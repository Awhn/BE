package com.moata.moata.dto.sms;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Builder
@Getter
public class SmsRequest {

    String type;
    String contentType;
    String countryCode;
    String from;
    String content;
    List<MessageRequest> messages;
}