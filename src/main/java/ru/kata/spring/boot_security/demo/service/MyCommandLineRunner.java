package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

   @Autowired
   private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.initUser();


    }


}