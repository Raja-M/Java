package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {

    public static void main (String[] args){
        getEmployeeList();
    }
             public static  void getEmployeeList(){

                Employee emp1 = new Employee("Raja",9000,1);
                 Employee emp2 = new Employee("Sony",6000,2);
                 Employee emp3 = new Employee("Laddu",7000,3);

                 List<Employee> empList = new ArrayList<Employee>( Arrays.asList(
                         new Employee("Raja",9000,1),
                         new Employee("Sony",6000,2),
                         emp3
                 )
                 );

                 Iterator < Employee > empItr = empList.iterator();
                 while( empItr.hasNext()){
                     Employee e = empItr.next();
                     System.out.println( "Employee itr : " + e);
                 }
                 Stream<Emp> empS = empList.stream().map(e-> new Emp(e.getName(),e.getSalary()));

                  empS.forEach( System.out::println);
             }
}
class Emp{
    String name;
    int  salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
