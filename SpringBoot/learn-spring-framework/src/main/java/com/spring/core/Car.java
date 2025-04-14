package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vechile {

    @Override
    public void move(){
        System.out.println("the car is moving.....");
    }
}
