package com.test.controller;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {


	@Autowired
	TestService testService;

	@GetMapping("/content")
	public List<Employee> content(){

		List<Employee> empList = testService.getContent();
		return empList;
	}

<<<<<<< HEAD
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		List<Employee> empList = testService.getEmployees();
		return empList;
	}
=======
		TgnContent tc = new TgnContent();
		//tc.setContentid(reqContentId);
		//tc.setContenttitle("title1");
	//	tc.setContentbody("newsbody");

		return tc;
>>>>>>> 9362922116c23ab81be4a9e84830b096b079a31b

	@GetMapping("/getEmployeeByName")
	public Employee getEmployeesByName( @RequestParam (name = "name") String empName){
		 Employee e = testService.getEmployeeByName(empName);
		return e;
	}

	@PostMapping("/saveEmployees")
	public List<Employee> saveEmployees( @RequestBody List<Employee> empList){
		return testService.SaveEmployees(empList);

	}
}

@Entity
class Employee {

	@Id
	String name;
	Integer  salary;

	Integer dept;

	public Employee(){

	}

	public Employee( String name, Integer salary, Integer dept){
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public String getName(){
		return name;
	}
	public void setName( String name){
		this.name = name;
	}

	public Integer getDept() {
		return dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

	public Integer getSalary(){
		return salary;
	}
	public void setSalary( Integer salary){
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				", dept=" + dept +
				'}';
	}
}

@Service
class TestService {


	@Autowired
	EmployeeRepository employeeRepository;

	List<Employee> employeeList = new ArrayList<>();
	public List<Employee>  getContent(){

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

		return employeeList;

	}

	public List<Employee>  getEmployees(  ){
		return employeeRepository.findAll(  );
	}

	public List<Employee>  SaveEmployees( List<Employee> empList){
		return employeeRepository.saveAll( empList);
	}

	public Employee getEmployeeByName( String ename){
		//List<Employee> empList = getEmployees();
		//List<Employee> em;
        //em = empList.stream().filter(e -> e.getName().contains(ename)).collect(Collectors.toList()) ;

		return  employeeRepository.findById( ename).get();
	}

}

@Repository
interface EmployeeRepository extends JpaRepository< Employee, String>{



}



