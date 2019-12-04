package servlet.servlet;

import servlet.bean.Account;
import servlet.dao.AccountDao;

import javax.annotation.Resource;

/**
 * name: 吳世祥
 * Date: 2019/5/18 13:41
 * Content:
 */
public class AccountSerlvetImp implements AccountSerlvet {
    @Resource(type = AccountDao.class)
    private AccountDao accountDao;


    @Override
    public void transferAccount() {
        Account ac = new Account();
        ac.setId(1);
        ac.setTranfermoney(100d);
        //先扣款
        accountDao.setAccount(ac);

        //再加款
        Account ac2 = new Account();
        ac2.setId(1);
        ac2.setTranfermoney(100d);
        accountDao.addAccount(ac);
    }
}
