package com.h2kinfosys.spring2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanProcessor implements BeanPostProcessor{
	
	public TestBeanProcessor() {
		
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("postProcessBeforeInitialization ::"  +beanName+ " ::+bean.toString()");
		return bean;
		
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("postProcessAfterInitialization ::"  +beanName+ " ::+bean.toString()");
		return bean;
		
	}

}
