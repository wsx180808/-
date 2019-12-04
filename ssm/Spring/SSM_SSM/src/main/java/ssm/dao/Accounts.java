package ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ssm.bean.Account;

import java.util.List;

/**
 * name: 吳世祥
 * Date: 2019/6/10 20:02
 * Content:
 */

public interface Accounts {

    //查询所有

    public List<Account> allAccount();


    //新增

    void addAccount(Account account);
}
