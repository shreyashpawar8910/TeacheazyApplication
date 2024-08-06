package com.company.service;

import com.company.entity.Subjects;
import com.company.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    // This function for save subjects into subject table
    public Subjects saveSubjects(Subjects subjects){
        return subjectRepository.save(subjects);
    }

    // This function used for get all data from the student table
    public List<Subjects> getAllSubjects(){
        return subjectRepository.findAll();
    }

    // This function for delete subject using ID
    public void deleteSubject(Integer id){
        subjectRepository.deleteById(id);
    }

}
