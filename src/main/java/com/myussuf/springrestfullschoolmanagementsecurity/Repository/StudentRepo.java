package com.myussuf.springrestfullschoolmanagementsecurity.Repository;

import com.myussuf.springrestfullschoolmanagementsecurity.Models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {
}
