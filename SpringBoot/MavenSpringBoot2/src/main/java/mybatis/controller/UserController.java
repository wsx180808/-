package mybatis.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import mybatis.bean.User;
import mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService ius;

    @RequestMapping("logo")
    public String logo(Model mav) {
        return "logo";
    }

    @RequestMapping("sele")
    public String sele() {
        //查询所有
        for (User user1 : ius.sele()) {
            System.out.println(user1.toString());
        }
        return "dtla";
    }

    @RequestMapping("insert")
    public String insert() {
        ius.insert(new User(2, "污水", "sds"));
//        坑二 跳转位置不可以与用user之类与bean重名或者与表重名
        return "dtla";
    }

    @RequestMapping("seleid")
    public String seleid() {
//        通过ID查询
        System.out.println(ius.seleid(1).toString());
        return "dtla";
    }

    @RequestMapping("test")
    public String test(Model mav) {
        mav.addAttribute("name", "wushixiang");

        mav.addAttribute("agr", 21);

        return "dtla";
    }


    @RequestMapping("logins")
    public String logins(HttpServletResponse response, HttpServletRequest request, Model model) {
        User user = ius.selename(new User(null, request.getParameter("username"), request.getParameter("pwd")));
        if (user == null) {
            model.addAttribute("er", "用户或密码不存在");
            return "logo";
        }else{

            model.addAttribute("name", user.getU_username());
            return "good";
        }

    }
}
