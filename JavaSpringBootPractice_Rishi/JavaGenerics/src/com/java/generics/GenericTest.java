package com.java.generics;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Box<Integer> box = new Box<>();
         
         box.add(2);
         Integer i = box.get();
         System.out.println("The passes Type value is:" +i);
        		 
        		 
	}

}
