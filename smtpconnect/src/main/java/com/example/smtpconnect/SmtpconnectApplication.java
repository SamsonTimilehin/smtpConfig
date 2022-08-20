package com.example.smtpconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class SmtpconnectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SmtpconnectApplication.class, args);
    }

}
