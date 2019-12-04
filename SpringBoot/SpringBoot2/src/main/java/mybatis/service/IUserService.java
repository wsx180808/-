package mybatis.service;

import mybatis.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */

public interface IUserService {
    public void insert(User user);
    public List<User> sele();
    public User seleid(Integer id);
}
