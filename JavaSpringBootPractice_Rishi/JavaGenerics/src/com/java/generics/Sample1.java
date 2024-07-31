package com.java.generics;

public class Sample1 {
	
	public static <t> void printArray(t[] inputArray) {
		
		for(t e:inputArray) {
			System.out.printf("%s", e);
		}		
	}
	
	public static void main( String args[]) {
		
		 Integer[] array = {1,2,3, 4};
		 
		 System.out.println("Array integerArray contains:");
	      printArray(array);
	}

}
