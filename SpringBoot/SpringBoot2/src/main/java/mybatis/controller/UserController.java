package mybatis.controller;

import mybatis.bean.User;
import mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService ius;

    @RequestMapping("insert")
    public String insert() {
//        查询所有
//        for (User user1 : ius.sele()) {
//            System.out.println(user1.toString());
//        }

//        通过ID查询
        System.out.println(ius.seleid(1).toString());

//插入
        // ius.insert(new User(2,"污水","sds"));
//        坑二 跳转位置不可以与用user之类与bean重名或者与表重名
        return "dtla";
    }
}
