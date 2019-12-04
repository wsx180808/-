package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name:吴世祥
 * @Date：2019/7/20
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    private String sayHi(@RequestParam(value = "hi") String hi) {
        return String.format("你输入了 %s 你的端口是 %s", hi, port);
    }
}
