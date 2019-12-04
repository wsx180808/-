package test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

/**
 * @name:吴世祥
 * @Date：2019/6/16
 */
@ComponentScan(basePackages = {"mybatis.controller","mybatis.service"})

@EnableAutoConfiguration
@MapperScan(basePackages = "mybatis.mapper")

public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);




    }


}