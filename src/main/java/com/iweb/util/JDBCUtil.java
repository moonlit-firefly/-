package com.iweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:49
 **/
public class JDBCUtil {
    private final static String URL =
            "jdbc:mysql://localhost:3306/czz?characterEncoding=utf8";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "123456";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return 获得一个新的连接
     * @throws SQLException
     */
    public  static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);

    }
}
