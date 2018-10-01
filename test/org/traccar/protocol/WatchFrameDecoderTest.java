package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class WatchFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {
        
        WatchFrameDecoder decoder = new WatchFrameDecoder();

        verifyFrame(
                binary("5b53472a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305d"),
                decoder.decode(null, null, binary("0D5b53472a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305d")));

        verifyFrameNull(                
                decoder.decode(null, null, binary("0D53472a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305d")));

        verifyFrameNull(                
                decoder.decode(null, null, binary("2a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305d")));

        verifyFrameNull(                
                decoder.decode(null, null, binary("5b53472a3335323636313039303134333135302a303030312a4c4b2c302c302c313030")));        
        
        verifyFrame(
                binary("5b53472a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305d"),
                decoder.decode(null, null, binary("5b53472a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305b53472a3335323636313039303134333135302a303030312a4c4b2c302c302c3130305D")));        
        
        verifyFrame(
                binary("5b33472a3335323636313039303134333135302a303030412a4c4b2c302c302c3130305d"),
                decoder.decode(null, null, binary("5b33472a3335323636313039303134333135302a303030412a4c4b2c302c302c3130305d")));

        verifyFrame(
                binary("5b33472a383330383430363237392a303030382a72636170747572655d"),
                decoder.decode(null, null, binary("5b33472a383330383430363237392a303030382a72636170747572655d")));

        verifyFrame(
                binary("5b33472a383330383430363237392a303030392a4c4b2c302c302c38345d"),
                decoder.decode(null, null, binary("5b33472a383330383430363237392a303030392a4c4b2c302c302c38345d")));

        verifyFrame(
                binary("5b5a4a2a3031343131313030313335303330342a303033342a303030392a4c4b2c302c302c31395d"),
                decoder.decode(null, null, binary("5b5a4a2a3031343131313030313335303330342a303033342a303030392a4c4b2c302c302c31395d")));

    }

}
