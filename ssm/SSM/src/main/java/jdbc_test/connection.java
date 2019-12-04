package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @name:吴世祥
 * @Date：2019/4/1
 */
public class connection {

    public static void main(String[] args) {

        //创建连接
        Connection conn = null;
        //查询对象
        PreparedStatement prep = null;
        //获取结果集
        ResultSet res = null;
        //加载数据库驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wushxiang?serverTimezone=UTC", "root", "123456");
            prep = conn.prepareStatement("select * from user1 where id = ?");
            prep.setString(1,"1");
            res = prep.executeQuery();
            while (res.next()){
                System.out.println(res.getString("user")+res.getInt("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
