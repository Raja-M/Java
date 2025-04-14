package com.javaguides.springboot.controller;

import com.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
   //http://localhost:8080/student
    @GetMapping("/student")
    public ResponseEntity<Student> getStudentDetails(){

             Student student =   new Student(1, "sony", "mudig");
             //  return ResponseEntity.ok(student);
             return ResponseEntity.ok().header("custom-header", "sony").body(student);

    }

    //http://localhost:8080/students
    @GetMapping()
    public ResponseEntity<List<Student>> getStudentsList(){
        List<Student> students = new ArrayList<>();
         students.add(  new Student(1, "sony", "mudig"));
        students.add(  new Student(2, "Raja", "mudig"));
        students.add(  new Student(4, "John", "Smith"));
        students.add(  new Student(4, "Reddy", "Reddy"));

        return ResponseEntity.ok(students);


    }
    //http://localhost:8080/students/1
    @GetMapping("/{id}/{firstName}/{lastName}")
    public ResponseEntity<Student> getStudentPathVariable(@PathVariable("id") int studId, @PathVariable("firstName") String frtName, @PathVariable("lastName") String lstName){

        return ResponseEntity.ok(new Student(studId,frtName , lstName));
    }

    //http://localhost:8080/students/query?id=1&firstName=aru&lastName=mudig
    @GetMapping("/query")
    public ResponseEntity<Student> getStudentRequestParam(@RequestParam("id") int studId, @RequestParam("firstName") String frtName, @RequestParam("lastName") String lstName){

        return ResponseEntity.ok(new Student(studId,frtName , lstName));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){


        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable int id){

        System.out.println(id);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteStudent( @PathVariable int id){

        System.out.println(id);

        return ResponseEntity.ok("The student with id " + id + " is deleted");
    }

}

