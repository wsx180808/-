package servlet.web;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import servlet.bean.User;
import servlet.servlet.Userservlet;
import servlet.servlet.Userservletlmpl;

@javax.servlet.annotation.WebServlet("/userLogin")

public class UserLoginServlet extends javax.servlet.http.HttpServlet {


    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        //接收表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //封装成user对象
        User user = (User) wac.getBean("user");
        user.setU_username(username);
        user.setU_userpass(password);
        //调用servlet方法验证数据

        Userservletlmpl us = (Userservletlmpl) wac.getBean("userservlet");
        user = us.getuserBylnfo(user);
        //根据用户验证结果进行操作
        if (us==null||user.getU_username()==null){
            //验证失败转发到login_page.jsp
            request.setAttribute("errorMsg","用户名或密码错误");
            request.getRequestDispatcher("login_page.jsp").forward(request,response);

        }else {
            //request.getContextPath()获取路径
            response.sendRedirect("index.jsp");

        }
        //验证成功登陆，重定向到index.jsp

    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }
}
