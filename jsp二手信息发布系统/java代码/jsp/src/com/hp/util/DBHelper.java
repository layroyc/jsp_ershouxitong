package com.hp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
	 private static Properties pr = new Properties();
		static{
				InputStream in=null;
				try {
					in = DBHelper.class.getResourceAsStream("/jdbc.properties");
					pr.load(in);
					//1.加载驱动
					Class.forName(pr.getProperty("driver"));
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			public static Connection getConn() throws SQLException{
				Connection conn= DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("username"),pr.getProperty("password"));
				return conn;
			}
			public static void close(ResultSet rs,PreparedStatement ps,Connection conn) throws SQLException{
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}
			
			//方法重载--针对于增删改
			public static void close(PreparedStatement ps,Connection conn) throws SQLException{
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
}
			public static void main(String[] args) throws SQLException {
				System.out.println(DBHelper.getConn());
			}

}
