package com.jiangjg.lib.JavaConcurrencyinPractice.TH3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDaoNew {

	// ��ʹ��ThreadLocal����Connection����  
    private static ThreadLocal<Connection> connThreadLocal = new ThreadLocal<Connection>();  
  
    public static Connection getConnection() {  
        // �����connThreadLocalû�б��̶߳�Ӧ��Connection����һ���µ�Connection��  
        // �����䱣�浽�̱߳��ر����С�  
        if (connThreadLocal.get() == null) {  
            Connection conn = getConnection();  
            connThreadLocal.set(conn);  
            return conn;  
        } else {  
            return connThreadLocal.get();// ��ֱ�ӷ����̱߳��ر���  
        }  
    }  
  
    public void addTopic() throws SQLException {  
        // �ܴ�ThreadLocal�л�ȡ�̶߳�Ӧ��Connection  
        Statement stat = getConnection().createStatement();  
    }  

}
