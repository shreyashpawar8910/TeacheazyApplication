package com.company.controller;

import com.company.entity.Subjects;
import com.company.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    // This controller for save subjects into database
    @PostMapping
    public ResponseEntity<?> saveSubjects(@RequestBody Subjects subjects){
        return new ResponseEntity<>(subjectService.saveSubjects(subjects), HttpStatus.CREATED);
    }


    // This controller for getting all data from student table
    @GetMapping
    public ResponseEntity<?> getSubjects(){
        return new ResponseEntity<>(subjectService.getAllSubjects(), HttpStatus.OK);
    }


    // This controller for delete subject by Id
    @DeleteMapping
    public void deleteSubject(@PathVariable Integer id){
        subjectService.deleteSubject(id);
    }

}
