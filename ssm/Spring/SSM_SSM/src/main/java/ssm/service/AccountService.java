package ssm.service;

import ssm.bean.Account;
import ssm.dao.Accounts;

import java.util.List;

/**
 * name: 吳世祥
 * Date: 2019/6/10 20:10
 * Content:
 */
public interface AccountService {
    //查询所有

    List<Accounts> allAccount();

    //根据id查询
    Accounts idAccount(int id);
    //扣款

    void setAccount(Account pcc);

    //添加
    void addAccount(Account account);
}
