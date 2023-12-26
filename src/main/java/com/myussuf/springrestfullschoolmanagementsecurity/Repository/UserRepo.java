package com.myussuf.springrestfullschoolmanagementsecurity.Repository;

import com.myussuf.springrestfullschoolmanagementsecurity.Models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Long> {
}
