package com.example.smtpconnect.service;

import com.example.smtpconnect.model.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

    String sendAttachmentWithMail(EmailDetails details);
}
