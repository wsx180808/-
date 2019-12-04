package com.funtl.hello.spring.cloud.web.admin.feign.controller;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name:吴世祥
 * @Date：2019/7/21
 */
@RestController
public class AdminContorller {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi(@RequestParam(value = "hi") String hi) {
        return adminService.hi(hi);
    }
}
