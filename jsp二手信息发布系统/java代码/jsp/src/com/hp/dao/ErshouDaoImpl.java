package com.hp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hp.entity.Ershou;
import com.hp.util.DBHelper;

public class ErshouDaoImpl implements ErshouDao {

	@Override
	public ArrayList<Ershou> selectAll() {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ArrayList< Ershou> list = new ArrayList< Ershou>();
		try {
			con=DBHelper.getConn();
			String sql2="select * from Ershou";
			ps=con.prepareStatement(sql2);
			ResultSet rs=ps.executeQuery(); 
			Ershou e=null;
			while(rs.next()){
				e=new Ershou(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6),
						rs.getDate(7),
						rs.getString(8)
						); 
				list.add(e);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(ps, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return list;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int a=0;
		try {
			con=DBHelper.getConn();
			String sql3="delete from Ershou where id=?";
			ps=con.prepareStatement(sql3);
			ps.setInt(1,id);
			a=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(ps, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return a;
	}

	@Override
	public int update(Ershou ershou) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int b=0;
		try {
			con=DBHelper.getConn();
		String sql="update Ershou set name=?,kind=?,money=?,faburen=?,phone=?,time=?,qingkuang=? where id=?";
		
			ps = con.prepareStatement(sql);
			ps.setString(1,ershou.getName());
			ps.setString(2,ershou.getKind());
			ps.setInt(3, ershou.getMoney());
			ps.setString(4, ershou.getFaburen());
			ps.setString(5, ershou.getPhone());
			ps.setDate(6, (Date) ershou.getTime());
			ps.setString(7, ershou.getQingkuang());
			ps.setInt(8, ershou.getId());
			
			 b= ps.executeUpdate();	 
		}catch(Exception e){	
			// TODO Auto-generated catch block
			e.printStackTrace();
	}finally{
		try {
			DBHelper.close(ps, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return b;
	}

	@Override
	public Ershou selectById(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
	    PreparedStatement ps=null;
	    ResultSet rs=null;
	    Ershou ershou=null;
	  try {
		con=DBHelper.getConn();
		String sql2="select * from Ershou where id=?";
		ps=con.prepareStatement(sql2);
		ps.setInt(1, id);
		rs=ps.executeQuery();
		
		 System.out.println(rs);
			while(rs.next()){
				ershou=new Ershou(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6),
						rs.getDate(7),
						rs.getString(8)
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(rs, ps, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ershou;
	}

}
