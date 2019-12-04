package web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name:吴世祥
 * @Date：2019/6/16
 */
//方式一，启动单个Controller
@RestController//声明rest风格控制器
@SpringBootApplication//自动配置相当于写了SpringBoot配置文件
public class HelloSpringBoot {
    @RequestMapping("hello/{name}")
    @ResponseBody
    public String Hello(@PathVariable String name) {
        return name + ":我的第一个SpringBoot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBoot.class, args);
    }
}
