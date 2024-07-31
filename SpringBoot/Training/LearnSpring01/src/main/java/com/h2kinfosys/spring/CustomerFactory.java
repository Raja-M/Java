package com.h2kinfosys.spring;

public class CustomerFactory {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Customer getCustomer() {
		Customer cust = new Customer();
		cust.setCustId("100");
		cust.setCustName("sony");
		if(type != null && type.equalsIgnoreCase("reguler"))
			cust.setCustType("Regular");
		else
			cust.setCustType("Loyal");
		return cust;
	}

}
