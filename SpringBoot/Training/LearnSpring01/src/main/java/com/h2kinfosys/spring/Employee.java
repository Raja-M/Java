package com.h2kinfosys.spring;

public class Employee {
	
	private String empId;
	private String empName;
	
	public Employee() {
		System.out.println("Employee Constructor Excuted");
	}
	
	public void start() {
		System.out.println("Making sure Employee exists in registry");
	}
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void destroy() {
		System.out.println("Making sure Employee is destroyed");
	}

}
