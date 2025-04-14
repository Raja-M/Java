package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private MessageService messageService;
    private SmsService smsService;


   /* public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
          System.out.println("Constructor based dependency injection 1");

    }

    @Autowired
    public MessageSender( @Qualifier("emailService")MessageService messageService, SmsService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Constructor based dependency injection 2");

    }*/
    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("setter based dependency injection emailService");
    }
    @Autowired
    public void setSmsService(SmsService smsService) {
        this.smsService = smsService;
        System.out.println("setter based dependency injection smsService");
    }

    /*public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }*/
}
