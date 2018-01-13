package com.github.maly7.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Bookstore {
    public static void main(String[] args) {
        SpringApplication.run(Bookstore.class, args);
    }

    @GetMapping(value = "/")
    public String hello() {
        return "Hello from bookstore";
    }
}
