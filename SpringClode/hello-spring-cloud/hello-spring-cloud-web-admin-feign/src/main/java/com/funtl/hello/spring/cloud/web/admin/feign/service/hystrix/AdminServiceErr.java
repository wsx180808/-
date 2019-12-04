package com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @name:吴世祥
 * @Date：2019/7/21
 */

//熔断方法
@Component
public class AdminServiceErr implements AdminService {



    @Override
    public String hi(String hi) {
        return hi;
    }
}