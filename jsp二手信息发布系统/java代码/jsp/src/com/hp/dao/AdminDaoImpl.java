package com.hp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hp.entity.Admin;
import com.hp.util.DBHelper;

public class AdminDaoImpl implements AdminDao{

	@Override
	public Admin login(String username) {
		// TODO Auto-generated method stub
		Admin admin=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//加载驱动
			conn=DBHelper.getConn();
			//书写sql语句
			String sql="select * from admin where username=?";
			//创建PrepareStatement  执行sql
			ps=conn.prepareStatement(sql);
			ps.setString(1,username);
		    rs=ps.executeQuery();
			//处理结果集	    
		    System.out.println(rs);
			while(rs.next()){
				admin=new Admin(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(rs, ps, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return admin;
	}
	@Override
	public int zhuce(String username, String password, String shouji) {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps=null;
		try {
			//书写sql语句
			conn=DBHelper.getConn();
			String sql1 = "insert into admin(username,password,shouji) values (?,?,?)";
			//创建preparedStatement,执行sql
			ps=conn.prepareStatement(sql1);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, shouji);
			i=ps.executeUpdate();
			System.out.println(i);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(ps, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("连接SQl异常");
			}
		}
		return i;
	}

}
