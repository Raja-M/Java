package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core")
public class AppConfig {
    public AppConfig() {
        System.out.println("hello world");
        System.out.println("Hi");
    }
//    @Bean
//    public Vechile car(){
//        return new Car();
//    }
//
//    @Bean
//    public Vechile bike(){
//        return new Bike();
//    }
//
//    @Bean
//    public Traveller traveller(){
//        return new Traveller(bike());
//    }

}
