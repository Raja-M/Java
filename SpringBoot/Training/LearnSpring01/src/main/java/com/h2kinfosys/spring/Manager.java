package com.h2kinfosys.spring;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean{
	
	   private String empId;
	   private String deptName;
	   
	   public Manager() {
		   System.out.println("Inside Manager Constructor");
	   }

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Manager afterPropertiesSet");
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Manager is Destroyed");
	}
	
	

}
