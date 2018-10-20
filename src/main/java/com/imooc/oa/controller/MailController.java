package com.imooc.oa.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发送邮件类
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    JavaMailSender mailSender;

    /**
     * 直接发邮件到相应的接收方
     * @param sender
     * @return
     */
    @ResponseBody
    @RequestMapping("/send")
    public Object sendEmail(String sender ) {
        try {
            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("516333085@qq.com");
            message.setTo("516333085@qq.com");
            message.setSubject("提交了申请");
            message.setText("需要审批申请");
            this.mailSender.send(mimeMessage);
            return "sucesss";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }
    }
}