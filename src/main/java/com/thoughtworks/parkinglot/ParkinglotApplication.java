package com.thoughtworks.parkinglot;

import lombok.Builder;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ParkinglotApplication {
    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ParkinglotApplication.class, args);
    }

}
