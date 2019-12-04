package text.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import text.bean.user;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.Date;

/**
 * name: 吳世祥
 * Date: 2019/5/29 20:31
 * Content:
 */
@Controller
@RequestMapping("/halloto")
public class HelloControllerTo {

    public static user getuser() {
        user user = new user();
        user.setModer(23.3d);
        user.setName("吴世祥");
        user.setPassword("1234");
        user.setDate(new Date());
        return user;
    }

    @RequestMapping("/returnString")
    public String returnString(Model mode) {
        mode.addAttribute("usermm", HelloControllerTo.getuser());
        return "/text/okTo";
    }

    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        方式一 请求转发
        request.setAttribute("usermm", HelloControllerTo.getuser());
        request.getRequestDispatcher("../WEB-INF/text/okTo.jsp").forward(request, response);
        return;
    }

    @RequestMapping("/returnVoidto")
    public void returnVoidto(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        方式二 重定向 重定向相当于重新发一次请求，无法直接在地址栏中访问WEB-INF，所以重定向到webapp下的index.jsp
        System.out.println(request.getContextPath());
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }

    @RequestMapping("/returnVoidth")
    public void returnVoidth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //设置编码
        response.setCharacterEncoding("UTF-8");
        //浏览器解析编码
        response.setContentType("text/html:charset:UTF-8");
        PrintWriter out = response.getWriter();
        out.println("直接输出");
        return;
    }

    @RequestMapping("/returnModelAndView")
    public ModelAndView returnModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("usermm", HelloControllerTo.getuser());
        mv.setViewName("/text/okTo");
        return mv;
    }

    @RequestMapping("/forwardAndredlrect")
    public String forwardAndredlrect() {
        //请求转发
       // return "forward:../WEB-INF/text/okTo.jsp";
        //重定向
        return "redirect:/index.jsp";
    }
}
