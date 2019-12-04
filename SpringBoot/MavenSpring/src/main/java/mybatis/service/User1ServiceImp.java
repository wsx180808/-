package mybatis.service;


import mybatis.bean.User1;
import mybatis.user1Mapper.IUser1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */
@Service
@Transactional//事务，如果报错终止调用dao
public class User1ServiceImp implements IUser1Service {
    @Autowired
    private IUser1Mapper ium;

    @Override
    public void insert(User1 user) {
        ium.insert(user);
    }

    @Override
    public List<User1> sele() {
        return ium.sele();
    }

    @Override
    public User1 seleid(Integer id) {
        return ium.seleid(id);
    }
}
