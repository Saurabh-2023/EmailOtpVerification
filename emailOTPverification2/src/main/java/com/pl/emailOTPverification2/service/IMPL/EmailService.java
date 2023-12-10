package com.pl.emailOTPverification2.service.IMPL;

import jakarta.mail.internet.MimeMessage;
import org.jetbrains.annotations.NotNull;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class EmailService
{
private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    public void sendEmail(String to,String subject,String body)
    {
        try
        {


            MimeMessage Message= javaMailSender.createMimeMessage();


            MimeMessage message=null;
            MimeMessageHelper helper= new MimeMessageHelper(message,true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body,true);
            javaMailSender.send(message);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getMessage();
            throw new RuntimeException(e);
        }



    }





}
