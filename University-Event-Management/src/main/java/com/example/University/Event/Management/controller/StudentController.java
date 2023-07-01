package com.example.University.Event.Management.controller;

import com.example.University.Event.Management.model.Department;
import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Validated
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudents(@Valid @RequestBody Student student){
        return studentService.addStudents(student);
    }

    @PutMapping("student/{id}/{department}")
    public String updateStudentDepartment(@PathVariable Integer id,@PathVariable Department department){
        return studentService.updateDepartment(id,department);
    }

    @DeleteMapping("students")
    public String deleteAllStudents(){
        return studentService.deleteAllStudents();
    }

    @GetMapping("students")
    public Iterable<Student> getStudent(){
        return studentService.getStudents();
    }

    @GetMapping("student/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }


}
