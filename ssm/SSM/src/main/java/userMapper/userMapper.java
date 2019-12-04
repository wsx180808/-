package userMapper;

/**
 * @name:吴世祥
 * @Date：2019/4/11
 */

import dean.User;

import java.util.List;

/**
 * mapper动态代理
 * 1.接口方法名需要和mapper.xml中 id保持一致
 * 2.parameterType和resultType（参数和返回值一致）
 * 3.mapper.xml的namespace和接口的路径一致
 * 4.返回值类型是根据具体返回自动选择（模糊查询或者多条数据，返回值不同）
 * @author z
 */


public interface userMapper {
    public User findUserById(int id);

    public List<User> userlikes(String name);

    public List<User> findUserByIdAll();

}
