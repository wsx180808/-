import java.sql.*;

/**
 * @name:吴世祥
 * @Date：2019/2/27 0027
 */
public class day1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new day1().jdbc();
    }

    public  void jdbc() throws SQLException, ClassNotFoundException {
        //1.注册驱动
        //方式一
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //方式二更好，没有JAR包也可以运行
        Class.forName("com.mysql.cj.jdbc.Driver");
        //方式三
       //System.setProperty("jdbc,drivers", "com.mysql.jdbc.Driver:oracle.jdbc.OracleDriver");
        //2.建立连接
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wushixiang?serverTimezone=UTC", "root2", "123456");
        //创建语句
        Statement st = con.createStatement();
        //执行语句
        ResultSet rs = st.executeQuery("select * from test");
        //处理结果
        while (rs.next()) {
            System.out.printf("成功");
            System.out.println("");
            System.out.println(rs.getInt(1));
        }
        //关闭资源
        rs.close();
        st.close();
        con.close();
    }
}
