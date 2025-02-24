package com.spring.core.bean;

public class Student {

    private Address address;

    public Student(Address address){
        this.address = address;
    }

    public void print(){
        System.out.println("student class method called...");
        this.address.showAddress();
    }

    public void init(){
        System.out.println("Intialization..........");
    }

    public void destroy(){
        System.out.println("Instance destroyed..........");
    }
}
