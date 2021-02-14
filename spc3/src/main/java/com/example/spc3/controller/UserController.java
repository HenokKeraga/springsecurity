package com.example.spc3.controller;


import com.example.spc3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JdbcUserDetailsManager jdbcUserDetailsManager;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }
    @PostMapping("/user")
    public void addUser(@RequestBody User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        jdbcUserDetailsManager.createUser(user);

    }
//    @GetMapping("")
//    public void addUserSample(){
//
//        org.springframework.security.core.userdetails.UserDetails user1=
//                org.springframework.security.core.userdetails.User
//                        .withUsername("kearag")
//                        .password(passwordEncoder.encode("123"))
//                        .authorities("read")
//                        .build();
//
//
//        jdbcUserDetailsManager.createUser(user1);
//
//    }

}
