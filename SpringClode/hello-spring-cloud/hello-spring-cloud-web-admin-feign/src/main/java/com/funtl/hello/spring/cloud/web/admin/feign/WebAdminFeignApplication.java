package com.funtl.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @name:吴世祥
 * @Date：2019/7/21
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@ComponentScan(basePackages = "com.funtl.hello.spring.cloud.web.admin")
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
