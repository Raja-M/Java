package com.spring.core.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoStudent {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)
        try (var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Student student = (Student) applicationContext.getBean("studentBean");
            String[] beanNames = applicationContext.getBeanDefinitionNames();
            for(String bean: beanNames) {
                System.out.println("the bean name is :" +bean);
            }
            student.print();

        }
    }
}
