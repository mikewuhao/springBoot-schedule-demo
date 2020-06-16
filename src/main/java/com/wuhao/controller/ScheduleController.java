package com.wuhao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: controller
 * @author: wuhao
 * @create: 2020-06-15 23:11
 **/
@RestController
@Slf4j
public class ScheduleController {

    /***
    * @Description: 测试方法
    * @return: java.lang.String
    * @Author: wuhao
    * @Date: 2020/6/15 23:06
    */
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


}
