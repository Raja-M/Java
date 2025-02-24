package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vechile {

    @Override
    public void move(){
        System.out.println("the Bike is moving.....");
    }
}
