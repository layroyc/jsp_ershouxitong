package com.hp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hp.dao.UserDao;
import com.hp.entity.User;
import com.hp.util.JdbcConn;


public class UserDaoImpl implements UserDao {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public User selectByUser(String name) {
		// TODO Auto-generated method stub
		User user = null;
		
		try {
			conn = JdbcConn.getConn();
			
			String sql = "select * from user where name=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setPhone(rs.getString("phone"));	
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return user;
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		int a = 0;
		
		try {
			conn = JdbcConn.getConn();
			String sql = "insert into user(name,pwd,phone) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getPwd());
			ps.setString(3, user.getPhone());
			
			a = ps.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}

}
