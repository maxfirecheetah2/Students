package com.exadel.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;


@Service
public class MailService {

        @Autowired
        private MailSender mailSender;


    public void sendMail(String to, String subject, String body)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setFrom("exadell@gmail.com");
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }



}
