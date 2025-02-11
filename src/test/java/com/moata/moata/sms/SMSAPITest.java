package com.moata.moata.sms;

import com.moata.moata.dto.sms.MessageRequest;
import com.moata.moata.util.SMSUtil;
import org.junit.jupiter.api.Test;

public class SMSAPITest {
    private final SMSUtil smsUtil;

    public SMSAPITest(SMSUtil smsUtil) {
        this.smsUtil = smsUtil;
    }

    @Test
    public void testSend() {
        MessageRequest testMessage = MessageRequest.builder()
                .to("01020934925")
                .content("Test")
                .build();
        try {
            smsUtil.sendSms(testMessage);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
