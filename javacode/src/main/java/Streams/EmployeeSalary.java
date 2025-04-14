package Streams;

import collections.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {

    public  void getEmpSalary(){


        Employee emp1 = new Employee( "wwww",2000, 2);
        Employee emp2= new Employee("ssss",4000,1);
        Employee emp3 = new Employee("kkk",8000,3);

        List<Employee> empList = Arrays.asList(emp1,emp2, emp3);
        Integer sum = empList.stream().mapToInt(Employee::getSalary).sum();
        System.out.println("Sum of the numbers : " + sum );



    }
}
