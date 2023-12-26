package com.myussuf.springrestfullschoolmanagementsecurity.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Payment extends CrudRepository<Payment, Long> {
}
