package com.funtl.hello.spring.cloud.web.admin.feign.service;

import com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceErr;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @name:吴世祥
 * @Date：2019/7/21
 */
//默认有负载均衡
//fallback熔断器配置，当服务宕机时，用熔断类
@FeignClient(value = "HELLO-SPRING-CLOUD-SERVICE-ADMIN",fallback = AdminServiceErr.class)
public interface AdminService {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi(@RequestParam(value = "hi") String hi);
}
