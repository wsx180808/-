package text.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * name: 吳世祥
 * Date: 2019/6/5 21:24
 * Content:
 */
@Controller
@RequestMapping("/hallo")
public class HelloInterceptor {
    @RequestMapping("/interceptor")
    public String interceptor() {
        System.out.println("进入Controller");
        return "/interceptor";
    }
}
