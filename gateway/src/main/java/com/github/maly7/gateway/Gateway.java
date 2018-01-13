package com.github.maly7.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
