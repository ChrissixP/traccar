package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Vt200ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        Vt200ProtocolDecoder decoder = new Vt200ProtocolDecoder(new Vt200Protocol());

        verifyNull(decoder, binary(
                "286310373094563082002701033d010817143327c68a14841e00c27f550e9a000000000c000000084700200120007d01af260b29"));

        verifyAttributes(decoder, binary(
                "2863103730945630880062033d862631037309456f222014604362936f010817140954010817144135076b00002a3800003b7d6127cc91040000000000000000000000005a0000088e000001ce02630000263b000009b401ff00000cb40000069c02af000018190200000102019729"));

        verifyPosition(decoder, binary(
                "286310373094562086002101033d010817143328441790420114817637207d090a00000847002001207f00d6f229"));

        verifyPosition(decoder, binary(
                "286310373094562086002101033d0108171433354417932101148139772c9d080a00000847002001207f00dc6729"));

        verifyNull(decoder, binary(
                "2863103730945600880012180108171433004418103801148375470000dd29"));

        verifyNull(decoder, binary(
                "28631037309456108800002e29"));

        verifyAttributes(decoder, binary(
                "2863103730945630880062033c862631037309456f222014604362936f01081713365601081713571904c800001b2c000034f66827f0840000000000000000000000000047000006e7000001b9022a000023ff000007f2018a00000a10000003f300cd00000d8d0300000302002729"));

        verifyNull(decoder, binary(
                "28631037309456008e000801042307171804584229"));

        verifyNull(decoder, binary(
                "28631037309456108800002e29"));

        verifyPosition(decoder, binary(
                "28631037309456208200210103302307171805444417097301147188170198090f0000073a002000007e00074429"));

        verifyNull(decoder, binary(
                "286310373094563089001200032f2107171740144417075001147188872c29"));

        verifyAttributes(decoder, binary(
                "2863103730945630880062032f862631037309456f222014604362936f21071717373221071717401400a100000cd700000004020d3c8e0000000000000000000000000000000000000000000000000000000000000000000a000000040000000e009700000cc9000000000000e929"));

        verifyPosition(decoder, binary(
                "28192030961807208200210101b919011818375801245774036424612500160917000003aa008800007b00aa3429"));

        verifyNull(decoder, binary(
                "286310373094563082002701033d010817143327c68a14841e00c27f550e9a000000000c000000084700200120007d01af260b29"));

        verifyAttributes(decoder, binary(
                "2863103730945630880062033d862631037309456f222014604362936f010817140954010817144135076b00002a3800003b7d6127cc91040000000000000000000000005a0000088e000001ce02630000263b000009b401ff00000cb40000069c02af000018190200000102019729"));

        verifyPosition(decoder, binary(
                "286310373094562086002101033d010817143328441790420114817637207d090a00000847002001207f00d6f229"));

        verifyPosition(decoder, binary(
                "286310373094562086002101033d0108171433354417932101148139772c9d080a00000847002001207f00dc6729"));

        verifyNull(decoder, binary(
                "2863103730945600880012180108171433004418103801148375470000dd29"));

        verifyNull(decoder, binary(
                "28631037309456108800002e29"));

        verifyAttributes(decoder, binary(
                "2863103730945630880062033c862631037309456f222014604362936f01081713365601081713571904c800001b2c000034f66827f0840000000000000000000000000047000006e7000001b9022a000023ff000007f2018a00000a10000003f300cd00000d8d0300000302002729"));

        verifyNull(decoder, binary(
                "28631037309456008e000801042307171804584229"));

        verifyNull(decoder, binary(
                "28631037309456108800002e29"));

        verifyPosition(decoder, binary(
                "28631037309456208200210103302307171805444417097301147188170198090f0000073a002000007e00074429"));

        verifyNull(decoder, binary(
                "286310373094563089001200032f2107171740144417075001147188872c29"));

        verifyAttributes(decoder, binary(
                "2863103730945630880062032f862631037309456f222014604362936f21071717373221071717401400a100000cd700000004020d3c8e0000000000000000000000000000000000000000000000000000000000000000000a000000040000000e009700000cc9000000000000e929"));

        verifyPosition(decoder, binary(
                "28631037309456208400340102dc0906171616454415760201144494473f920a0c0000030500200100417c1f383a9d1090510000006a00007000000e00180ee129"));

        verifyPosition(decoder, binary(
                "28631037309456208400340102dc090617161654441577230114439597368c0a0c0000030500200100417c1baa349d3290510000006a00007000003d15004c11c629"));

    }

}
