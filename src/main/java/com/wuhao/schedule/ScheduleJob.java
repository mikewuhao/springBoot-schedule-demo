package com.wuhao.schedule;

import com.wuhao.domain.User;
import com.wuhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description: 定时任务类
 * @author: wuhao
 * @create: 2020-06-15 23:11
 **/
@Component
public class ScheduleJob {

    //邮件发送人的email地址
    @Value("${spring.mail.username}")
    private String username;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private UserService userService;

    @Scheduled(cron = "0/60 * * * * ? ")//每60秒执行一次
    public void job(){
        //邮件接收人的email地址
        String recipientEmailAddr = "XXXX@163.com";
        List<User> userList = userService.queryAllUsers();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo(recipientEmailAddr);
        message.setSubject("主题:用户数据");
        message.setText("测试邮件内容"+userList.toString());
        mailSender.send(message);
    }

}
