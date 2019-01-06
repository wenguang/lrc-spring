package dao;

import java.sql.*;

public class OriginDao {

    public void originTest() {
        try {
            String sql = "select * from t_customer";
            Connection con = null;
            Statement stmt = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 连接对象
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/customer?useSSL=false", "root", "mj43420024");
            // 执行命令对象
            stmt =  con.createStatement();
            // 执行
            stmt.execute(sql);

            // 关闭
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
