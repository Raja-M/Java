package com.h2kinfosys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("spring2.xml");
        //Greetings greets = context1.getBean("greet", Greetings.class);
        
       // if(greets.getLanguage().equalsIgnoreCase("English")) {
        //	System.out.println("Hello");
       // }else {
        //	System.out.println("Hola");
        //}
        
       // Employee empl = context1.getBean("emp", Employee.class);
        
       // Manager mang = context1.getBean("mng", Manager.class);
        
        MSWord msword = context1.getBean("msword", MSWord.class);
	}

}
