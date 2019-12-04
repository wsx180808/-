package web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import web.Moder.User;

/**
 * @name:吴世祥
 * @Date：2019/6/16
 */
//方式二，通过App这个类控制多个Controller
@RestController//声明rest风格控制器
@SpringBootApplication//自动配置相当于写了SpringBoot配置文件
@RequestMapping("user")
public class UserSpringBoot {
    @RequestMapping("hello/{id}")
    @ResponseBody//返回json类型数据
    public User Hello(@PathVariable Integer id) {

        User user = new User(null, "吴世祥", "12345qwe");
        user.setId(id);
        return user;
    }
}


