package com.h2kinfosys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         HelloWorld hello = (HelloWorld)context.getBean("hello");
         
         hello.getMessage();
         context.close();
	}

}
