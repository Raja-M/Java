package com.h2kinfosys.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("spring4.xml");
		
		//TestHeritance testsp = context1.getBean(TestHeritance.class);
		//System.out.println(testsp);
		
		Account account = context1.getBean("account", Account.class);
		context1.registerShutdownHook();
		context1.close();
	}

}
