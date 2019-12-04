package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.bean.Account;
import ssm.service.AccountService;

/**
 * name: 吳世祥
 * Date: 2019/6/10 20:12
 * Content:
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/FinadAll")
    public String finadAll(String user ){
        System.out.println("表现层查询所有");
        System.out.println(user);
        accountService.allAccount();
        return "/test/list";
    }
    @RequestMapping("/save")
    public String save(Account account ){
        System.out.println("表现层查询所有");
        System.out.println(account.toString());
        accountService.addAccount(account);
        return "/test/list";
    }
}
