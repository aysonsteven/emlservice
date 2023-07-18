package com.springboot.assessment.emailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assessment.emailservice.service.SmsService;
import com.twilio.rest.api.v2010.account.Message;

@RestController
@RequestMapping("/sms")
public class SMSController {

    @Autowired
    private SmsService service;
    
    @PostMapping("/send")
    public Message sendSMS(){
        return service.sendSMS();
    }
}
