package web.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import web.Moder.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @name:吴世祥
 * @Date：2019/6/17
 */
@Controller

@RequestMapping("stu")
public class studentController {
    @RequestMapping("/list")
//将要传递给页面的值写在参数中
    public String freemarker(Model mav) {

        List<User> list = new ArrayList<User>();
//        map.put("usre1", new User(1, "吴世祥", "12345qwe"));
//       map.put("usre2", new User(2, "吴世", "12345qwe"));
//        map.put("usre3", new User(3, "吴", "12345qwe"));
        list.add(new User(1, "吴世祥", "12345qwe"));
        list.add(new User(2, "吴世", "12345qwe"));

        mav.addAttribute("name", "wushixiang");

        mav.addAttribute("agr",21);
        mav.addAttribute("list",list);
        return "ftla";
    }


}
