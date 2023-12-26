package com.myussuf.springrestfullschoolmanagementsecurity.Controllers;

import com.myussuf.springrestfullschoolmanagementsecurity.Models.Users;
import com.myussuf.springrestfullschoolmanagementsecurity.Repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class Usercontroller {

    @Autowired
    private UserRepo repo;

    @GetMapping("/all")
    public List<Users> getAllUsers(){
        List<Users> allusers = new ArrayList<>();
        for (Users x: repo.findAll()){
            allusers.add(x);
        }

                return allusers;
    }
}
