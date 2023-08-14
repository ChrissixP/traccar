/*
 * Copyright 2022 - 2023 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.forward;

public class MqttClientFactory {
    public MqttClient create(int version, String host, int port, String username, String password, String topic) {
        if(version==3) {
            return new MqttClientV3(host, port, username, password, topic);
        }
        else {
            return new MqttClientV5(host, port, username, password, topic);
        }
    }
}
