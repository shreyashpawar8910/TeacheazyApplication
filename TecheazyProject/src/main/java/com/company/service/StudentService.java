package com.company.service;

import com.company.entity.Student;
import com.company.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // This function for to save of students into Student table
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    // This function for get all data from the Student table
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    // This function for delete student using ID
    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }

}
