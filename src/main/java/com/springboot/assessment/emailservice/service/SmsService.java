package com.springboot.assessment.emailservice.service;

import com.twilio.rest.api.v2010.account.Message;

public interface SmsService {
    

    public Message sendSMS();
}
