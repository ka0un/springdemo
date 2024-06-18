package com.example.demo;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
    }

}
