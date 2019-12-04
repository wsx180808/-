package mybatis.service;

import mybatis.bean.User;
import mybatis.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */
@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private IUserMapper ium;

    @Override
    public void insert(User user) {
        ium.insert(user);
    }

    @Override
    public List<User> sele() {
        return ium.sele();
    }

    @Override
    public User seleid(Integer id) {
        return ium.seleid(id);
    }
}
