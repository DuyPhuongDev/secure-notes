package com.secure.notes.util;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendPasswordResetEmail(String to, String resetUrl) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Password Reset Request");
        message.setText("Click here to reset your password to your email address:" + resetUrl);
        mailSender.send(message);
    }

    public void sendHtmlEmail(String to, String resetUrl) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject("Password Reset Request");
        String link = "<a href=\"" + resetUrl + "\">Tại đây</a>";
        String htmlContent = "<p>Click vào liên kết dưới đây để đặt lại mật khẩu của bạn: " + link + "</p>";


        mimeMessageHelper.setText(htmlContent, true);
        mailSender.send(mimeMessage);
    }
}
