package com.springboot.assessment.emailservice.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.assessment.emailservice.service.SmsService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

@Service
public class SmsServiceImpl implements SmsService {

    @Override
    public Message sendSMS() {
        // TODO Auto-generated method stub
       return createSMS();
    }

    private Message createSMS(){
        String ACCOUNT_SID = "ACbce62c32f2980c686ead3930ce460293";
        String AUTH_TOKEN = "fa3f17eeb7cf100a7978853796196d8e";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
        .creator(new com.twilio.type.PhoneNumber("+639686838245"), "MG73caea342a122f740b25e424ea11eada", "aa")
        .create();

    
    
    return message;
    }
    
}
