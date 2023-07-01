package com.example.University.Event.Management.service;

import com.example.University.Event.Management.model.Department;
import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;


    public String addStudents(Student student) {
        studentRepo.save(student);
        return "Students has been added.";
    }

    public String updateDepartment(Integer id, Department department) {
        Optional<Student> myStudentList=studentRepo.findById(id);
        Student student=myStudentList.get();
        if(myStudentList.isPresent()){
            student.setDepartment(department);
            studentRepo.save(student);
            return "Department of Student has been updated.";
        }
        return "No Student exists with given id";


    }

    public String deleteAllStudents() {
        studentRepo.deleteAll();
        return "All students have been deleted.";
    }

    public Iterable<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudent(Integer id) {
        Optional<Student> myStudent=studentRepo.findById(id);
        Student student=myStudent.get();
        if(myStudent.isPresent()){
            return student;
        }
        return null;
    }
}
