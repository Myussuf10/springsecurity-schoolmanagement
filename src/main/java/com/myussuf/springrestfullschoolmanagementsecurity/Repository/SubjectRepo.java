package com.myussuf.springrestfullschoolmanagementsecurity.Repository;

import com.myussuf.springrestfullschoolmanagementsecurity.Models.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
