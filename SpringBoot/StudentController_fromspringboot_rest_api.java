package com.javaguides.springboot.controller;

import com.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
   //http://localhost:8080/student
    @GetMapping("/student")
    public ResponseEntity<Student> getStudentDetails(){

             Student student =   new Student(1, "sony", "mudig");
             return ResponseEntity.ok(student);

    }

    //http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudentsList(){
        List<Student> students = new ArrayList<>();
         students.add(  new Student(1, "sony", "mudig"));
        students.add(  new Student(2, "Raja", "mudig"));
        students.add(  new Student(4, "John", "Smith"));
        students.add(  new Student(4, "Reddy", "Reddy"));

        return students;


    }
    //http://localhost:8080/students/1
    @GetMapping("/students/{id}/{firstName}/{lastName}")
    public Student getStudentPathVariable(@PathVariable("id") int studId, @PathVariable("firstName") String frtName, @PathVariable("lastName") String lstName){

        return new Student(studId,frtName , lstName);
    }

    //http://localhost:8080/students/query?id=1&firstName=aru&lastName=mudig
    @GetMapping("/students/query")
    public Student getStudentRequestParam(@RequestParam("id") int studId, @RequestParam("firstName") String frtName, @RequestParam("lastName") String lstName){

        return new Student(studId,frtName , lstName);
    }

    @PostMapping("/students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){


        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    @PutMapping("/students/{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable int id){

        System.out.println(id);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    @PutMapping("/students/{id}/delete")
    public String deleteStudent( @PathVariable int id){

        System.out.println(id);

        return "The student with id " + id + " is deleted";
    }

}

