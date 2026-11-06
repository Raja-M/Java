package core.CompableComparator;

import java.util.*;

public class ComparableComparator {

    public static void main(String[] args){

        // Comparable Example
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("John", 20),
                new Student("Alice", 22),
                new Student("Bob", 19),
                new Student("Eve", 21)
            )
        );
       // Collections.sort(studentList);

        studentList.sort( ( s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()) );
        studentList.forEach( student -> System.out.println(student.getName()));


        // Comparator Example
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 60000),
                new Employee("Bob", 45000),
                new Employee("Eve", 70000)
            )
        );

        //Collections.sort(employeeList, new EmployeeComparator());
        employeeList.sort( new EmployeeComparator());
        employeeList.forEach( employee -> System.out.println(employee.getName() + " : " + employee.getSalary()) );
    }

}

class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}

class EmployeeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
       if( o1.getSalary() < o2.getSalary()){
           return -1;
       } else if( o1.getSalary() > o2.getSalary()){
           return 1;
       } else {
       return 0;
    }
}


}



class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
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
    public int compareTo(Student nextStudent) {
        return Integer.compare(this.age, nextStudent.age);
    }

}