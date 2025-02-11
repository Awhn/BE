package com.moata.moata.dto.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
public class SmsResponse {

    String requestId;

    LocalDateTime requestTime;

    String statusCode;

    String statusName;

}