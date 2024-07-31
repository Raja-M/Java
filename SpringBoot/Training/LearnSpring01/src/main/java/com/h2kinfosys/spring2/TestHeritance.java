package com.h2kinfosys.spring2;

import org.springframework.beans.factory.InitializingBean;

public class  TestHeritance implements InitializingBean{
	private String name;
	private String address;
	private String id;
	
	public TestHeritance() {
		System.out.println("Inside TestHeritance");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("TestHeritance :: afterPropertiesSet");
		
	}
	
	@Override
	public String toString() {
		return "TestHeritance [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
