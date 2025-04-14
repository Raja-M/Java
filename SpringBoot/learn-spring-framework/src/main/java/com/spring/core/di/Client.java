package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
       String message1 = "Hello World" ;
        String message2 = "Hi Welcome to Spring and Spring boot tutorial" ;
//        MessageService smsService = new SmsService();
//
//        MessageSender messageSender = new MessageSender(smsService);
//
//        messageSender.sendMessage(message);

        ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ;

        EmailService emailService = ApplicationContext.getBean(EmailService.class);
        emailService.sendMessage(message1);
        SmsService smsService = ApplicationContext.getBean(SmsService.class);
        smsService.sendMessage(message2);
    }
}
