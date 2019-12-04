package servlet.dao;

import servlet.bean.Account;

/**
 * name: 吳世祥
 * Date: 2019/5/18 13:45
 * Content:
 */
public interface AccountDao {
    //操作数据库

    //扣款

    void setAccount(Account pcc);

    //加款
    void addAccount(Account account);


}
