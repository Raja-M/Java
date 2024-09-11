package com.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        //Doctor doctor = context.getBean(Doctor.class);
        //doctor.assist();
       // Nurse nurse = (Nurse) context.getBean("nurse");
       // nurse.assist();
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());
        System.out.println("Hello world!");
    }
}