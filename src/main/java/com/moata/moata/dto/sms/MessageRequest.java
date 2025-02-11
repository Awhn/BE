package com.moata.moata.dto.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class MessageRequest {
    String to;
    String content;
}
