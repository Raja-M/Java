package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
          //Vechile vechile= new Bike();
       // Traveller traveller = new Traveller(vechile);
      //  traveller.startJourney();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //Car car =applicationContext.getBean(Car.class);
        //car.move();


        //Bike bike =applicationContext.getBean(Bike.class);
       // bike.move();

        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();

    }
}
