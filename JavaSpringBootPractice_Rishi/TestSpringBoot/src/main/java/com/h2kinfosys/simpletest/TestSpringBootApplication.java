package com.h2kinfosys.simpletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.h2kinfosys.simpletest.bean.Bank;

@SpringBootApplication
public class TestSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(TestSpringBootApplication.class, args);
		
		Bank bank = context.getBean(Bank.class);
		bank.getUser();
		context.registerShutdownHook();
		context.close();
	}

}
