//package com.example.smtpconnect.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//import java.util.Properties;
//
//@Configuration
//public class MailConfiguration {
//
//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(465);
//
//        mailSender.setUsername("repurer4biz@gmail.com");
//        mailSender.setPassword("jmnesxtfuxybgjtg");
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.ssl.enable", "true");
////        props.put("mail.smtp.starttls.enable", "true");
////        props.put("mail.smtp.starttls.enable.required", "true");
//
//        return mailSender;
//    }
//}
