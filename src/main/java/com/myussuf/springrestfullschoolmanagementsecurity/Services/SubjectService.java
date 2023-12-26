package com.myussuf.springrestfullschoolmanagementsecurity.Services;

import com.myussuf.springrestfullschoolmanagementsecurity.Models.Student;
import com.myussuf.springrestfullschoolmanagementsecurity.Models.Subject;
import com.myussuf.springrestfullschoolmanagementsecurity.Repository.StudentRepo;
import com.myussuf.springrestfullschoolmanagementsecurity.Repository.SubjectRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SubjectService {
    @Autowired
    private SubjectRepo repo;
    private StudentRepo studentRepo;
    public void addSubject(long studentId, String subjectName, int subjectPrice){
        Student student = studentRepo.findById(studentId).get();

        Subject subject = new Subject(subjectName,subjectPrice,);

    };
}
