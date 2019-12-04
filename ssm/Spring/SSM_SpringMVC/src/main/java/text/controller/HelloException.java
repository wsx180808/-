package text.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import text.utils.exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * name: 吳世祥
 * Date: 2019/6/5 20:06
 * Content:
 */
@Controller
@RequestMapping("/hallo")
public class HelloException {
    @RequestMapping("/exception")
    public String exception(HttpServletRequest request, HttpServletResponse response) throws exception {
        //模拟异常

        try {
            int a = 10 / 0;

        } catch (Exception e) {
            //控制台打印错误信息
            e.printStackTrace();


            throw new exception("查询所有用户出错了");
        }
        return "/text/ok";
    }
}
