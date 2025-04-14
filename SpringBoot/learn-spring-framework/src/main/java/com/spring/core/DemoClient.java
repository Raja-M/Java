package com.spring.core;

import com.spring.core.controller.DemoController;
import com.spring.core.repository.DemoRepository;
import com.spring.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {

    public static void main(String[] args) {
        //Vechile vechile= new Bike();
        // Traveller traveller = new Traveller(vechile);
        //  traveller.startJourney();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController demoController = applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());
        DemoRepository demorepository = applicationContext.getBean(DemoRepository.class);
        System.out.println(demorepository.hello());
        DemoService demoservice = applicationContext.getBean(DemoService.class);
        System.out.println(demoservice.hello());

    }
}
