package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EqualComparatorComparable {

    public static void main( String[] args ) {
        Integer a = 128;
        Integer b = 128;
        System.out.println( a == b ); // false

        Integer c = 127;
        Integer d = 127;
        System.out.println( c == d ); // true

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println( s1 == s2 ); // false
        System.out.println( s1.equals(s2) ); // true

        String s3 = "hello";
        String s4 = "hello";
        System.out.println( s3 == s4 ); // true
        System.out.println( s3.equals(s4) ); // true

        String s5 = "hello";
        String s6 = new String("hello");
        System.out.println( s5 == s6 ); // false
        System.out.println( s5.equals(s6) ); // true

        // Comparator and Comparable
        // Comparator is used to compare two objects of different classes
        // Comparable is used to compare two objects of the same class

        Employee emp1 = new Employee("John", 30);
        Employee emp2 = new Employee("Jane", 25);

        System.out.println( "Comparing empl1 with emp2 : "  + emp1.compareTo(emp2) ); // > 0

        List<Employee> employees = Arrays.asList(new Employee("John", 30),
                new Employee("Jane", 25),
                new Employee("Doe", 35));

        System.out.println("Before sorting: " + employees);
        Collections.sort(employees);
        System.out.println("After sorting: " + employees);

        EmployeeAgeComparator ageComparator = new EmployeeAgeComparator();

        int result = ageComparator.compare( emp1, emp2);

        System.out.println( "Using Comparator to compare emp1 with emp2 : " + result ); // > 0
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }
}

class EmployeeAgeComparator implements java.util.Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getAge(), e2.getAge());
    }
}