package com.github.maly7.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Library {

    public static void main(String[] args) {
        SpringApplication.run(Library.class, args);
    }

    @GetMapping(value = "/")
    public String hello() {
        return "Hello from library";
    }
}
