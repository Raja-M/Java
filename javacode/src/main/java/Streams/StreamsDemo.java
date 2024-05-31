package Streams;

import collections.Employee;
import collections.EmployeeList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main ( String[] args){
        EmployeeList employeeList = new EmployeeList();
        Stream<Employee> employeeStream = employeeList.getEmployeeList().stream();
        employeeStream.forEach(System.out::println);
        List<String> empList = employeeList.getEmployeeList().stream().filter(e -> e.getSalary() < 81000).map(e -> e.getName() ).collect( Collectors.toList());
        empList.forEach( System.out::println);

        List<Employee > empList2 = employeeList.getEmployeeList().stream().collect(Collectors.toList());
        for (Employee employee : empList2) {
            System.out.println( employee);
        }
        System.out.println("Employee with salary greater than 1000000" ) ;
        Employee emp = employeeList.getEmployeeList().stream().filter( e -> e != null ).filter( e -> e.getSalary() >1000000 ).findFirst().orElse( null );
        System.out.println( emp);

        Employee[] employees = employeeList.getEmployeeList().stream().toArray( Employee[]::new );

        for( Employee e : employees){
            System.out.println( " Employee from Array : " +  e);
        }
        employeeList.getEmployeeList().stream().peek (e -> e.setSalary( e.getSalary() + 5 )).forEach( System.out::println);

        Long empCount100 = employeeList.getEmployeeList().stream().filter( e -> e.getSalary() > 100000 ).count();

        System.out.println( " Employee Count : " + empCount100);

        List< Employee> employeeLimit  = employeeList.getEmployeeList().stream().skip(3 ).limit(2).collect( Collectors.toList());

        List<Integer> intList = Arrays.asList( 2, 5,3,4,5,5,3,2,1,6,7,3,2);
        System.out.println("Original List : " + intList);

        List<Integer> distinctList = intList.stream().distinct().sorted( (e1, e2) -> e1.intValue() < e2.intValue() ? e1.intValue(): e2.intValue()).collect(Collectors.toList());

        System.out.println( " Distinct List of Numbers : " + distinctList);
    }
}
