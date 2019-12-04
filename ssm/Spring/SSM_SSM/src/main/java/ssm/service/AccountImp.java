package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.bean.Account;
import ssm.dao.Accounts;

import java.util.List;

/**
 * name: 吳世祥
 * Date: 2019/6/10 20:11
 * Content:
 */
@Service("accountService")
public class AccountImp implements AccountService {
    @Autowired
    private Accounts accounts;
    @Override
    public List<Accounts> allAccount() {
        System.out.println("业务层查询所有");
        return null;
    }

    @Override
    public Accounts idAccount(int id) {
        System.out.println("业务层保存单个");
        return null;
    }

    @Override
    public void setAccount(Account pcc) {

    }

    @Override
    public void addAccount(Account account) {
        accounts.addAccount(account);
    }
}
