package collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeList(){
        Employee e1 = new Employee("John" , 15000, 10);
        Employee e2 = new Employee("Raja", 20000, 20);
        Employee e3 = new Employee("Jeff Bezos", 100000, 10);
        Employee e4 = new Employee("Bill Gates" , 900000, 10);
        Employee e5 = new Employee("Mark Zuckerberg" , 80000, 20);
        Employee e6 = new Employee("Elon Musk" , 120000, 10);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }

}
