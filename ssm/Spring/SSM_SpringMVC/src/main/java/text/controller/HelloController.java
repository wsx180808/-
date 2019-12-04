package text.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import text.bean.user;
import text.bean.userDate;
import text.bean.userDateto;
import text.bean.userListMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * name: 吳世祥
 * Date: 2019/5/21 21:30
 * Content:
 */
@Controller
@RequestMapping("/hallo")
@SessionAttributes(value = {"msg"})   // 把msg=美美存入到session域对中
public class HelloController {
    @RequestMapping("/hallo")
    public String hello() {
        System.out.println("hallp");
        return "/text/ok";
    }

    @RequestMapping("/hallotest1")
    public String hellotest(String canshu) {
        System.out.println("打印参数" + canshu);
        return "/text/ok";
    }

    @RequestMapping("/hallotest2")
    public String hellotest2(user user) {
        System.out.println("打印参数" + user);
        return "/text/ok";
    }

    @RequestMapping("/hallotest3")
    public String hellotest3(userListMap userListMap) {
        System.out.println("打印参数" + userListMap);
        return "/text/ok";
    }
//日期转换格式:方法一

    @RequestMapping("/hallotest4")
    public String hellotest4(userDate vo) {
        System.out.println("date1:" + vo.getData());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(vo.getData());
        System.out.println("date2:" + date);

        userDate vo2 = new userDate();
        vo2.setData(new Date());
        return "/text/ok";

    }

    //日期转换格式:方法二
    @RequestMapping("/hallotest5")
    public String hellotest5(userDateto dateto) {
        System.out.println("打印参数" + dateto);
        return "/text/ok";
    }


    //常用的注解运用
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("执行了...");
        System.out.println(username);
        return "/text/ok";
    }

    /**
     * 获取到请求体的内容
     *
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("执行了...");
        System.out.println(body);
        return "/text/ok";
    }

    /**
     * PathVariable注解
     *
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("执行了...");
        System.out.println(id);
        return "/text/ok";
    }

    /**
     * 获取请求头的值
     *
     * @param header
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("执行了...");
        System.out.println(header);
        // return "success";
        // response.sendRedirect(request.getContextPath()+"/anno/testCookieValue");
        return "/text/ok";
    }


    /**
     * 获取Cookie的值
     *
     * @return
     */
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("执行了...");
        System.out.println(cookieValue);
        return "/text/ok";
    }

    /**
     * ModelAttribute注解
     *
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") user user) {
        System.out.println("testModelAttribute执行了...");
        System.out.println(user);
        return "/text/ok";
    }

    @ModelAttribute
    public void showUser(String uname, Map<String, user> map) {
        System.out.println("showUser执行了...");
        // 通过用户查询数据库（模拟）
        user user = new user();
        user.setName(uname);
        user.setModer(20d);
        user.setDate(new Date());
        map.put("abc", user);
    }

    /**
     * 该方法会先执行

     @ModelAttribute public User showUser(String uname){
     System.out.println("showUser执行了...");
     // 通过用户查询数据库（模拟）
     User user = new User();
     user.setUname(uname);
     user.setAge(20);
     user.setDate(new Date());
     return user;
     }
     */

    /**
     * SessionAttributes的注解
     *
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes...");
        // 底层会存储到request域对象中
        model.addAttribute("msg", "美美");
        return "/text/ok";
    }

    /**
     * 获取值
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes...");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "/text/ok";
    }

    /**
     * 清除
     *
     * @param status
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("getSessionAttributes...");
        status.setComplete();
        return "/text/ok";
    }
}
