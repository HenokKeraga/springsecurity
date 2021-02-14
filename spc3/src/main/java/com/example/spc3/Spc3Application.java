package com.example.spc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
public class Spc3Application implements CommandLineRunner {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JdbcUserDetailsManager jdbcUserDetailsManager;
    public static void main(String[] args) {
        SpringApplication.run(Spc3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        org.springframework.security.core.userdetails.UserDetails user1=
                org.springframework.security.core.userdetails.User
                        .withUsername("kearag")
                        .password(passwordEncoder.encode("123"))
                        .authorities("read")
                        .build();


        jdbcUserDetailsManager.createUser(user1);
    }
}
