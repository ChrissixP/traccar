#!/bin/bash

which mvn &> /dev/null || { echo >&2 "Maven package cant be found on path. Aborting."; exit 1; }
which docker &> /dev/null  || { echo >&2 "Docker package cant be found on path. Aborting."; exit 1; }
mvn package || { echo >&2 "Maven package has failed. Aborting."; exit 1; }

export company="tananaev"
export software="traccar"
export version=$(head -n 10 ./pom.xml |grep version|cut -d ">" -f2|cut -d"<" -f1)

tmp="./setup/docker/tmp"

mkdir -p ${tmp}/data/database
cat ./setup/unix/traccar.xml | awk '/web.path/ && !modif { printf("    <entry key=\"web.debug\">true</entry>\n"); modif=1 } {print}' > ${tmp}/traccar.xml
cp -rf ./database/*.xml ${tmp}/data
cp -rf ./target/tracker-server-jar-with-dependencies.jar ${tmp}/traccar-server.jar
cp -rf ./web ${tmp}/web

docker build -t ${company}/${software}:${version} ./setup/docker/

rm -rf ${tmp}