package com.exadel.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;


@Service
public class MailService{

        @Autowired
        @Qualifier("mailSender")
        private MailSender mailSender;



    public void sendMail(final String to, final String subject, final String body){
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {

                SimpleMailMessage message = new SimpleMailMessage();
                message.setTo(to);
                message.setFrom("exadell@gmail.com");
                message.setSubject(subject);
                message.setText(body);
                 mailSender.send(message);

            }
        });
        th.start();

    }

}
