package com.funtl.hello.spring.cloud.web.admin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @name:吴世祥
 * @Date：2019/7/20
 */
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "RunhiErr")
    public String Runhi(String hi) {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?hi=" + hi, String.class);
    }

    public String RunhiErr(String hi) {
        return "Hi，your message is :\"" + hi + "\" but request error.";
    }
}
