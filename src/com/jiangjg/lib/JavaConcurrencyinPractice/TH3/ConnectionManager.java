package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 总结一句话就是一个是锁机制进行时间换空间，一个是存储拷贝进行空间换时间。
 */
public class ConnectionManager {

	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {  
        @Override  
        protected Connection initialValue() {  
            Connection conn = null;  
            try {  
                conn = DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/test", "username",  
                        "password");  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
            return conn;  
        }  
    };  
  
    public static Connection getConnection() {  
        return connectionHolder.get();  
    }  
  
    public static void setConnection(Connection conn) {  
        connectionHolder.set(conn);  
    }  

}
