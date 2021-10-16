package com.hp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hp.dao.ScoreDao;
import com.hp.entity.Score;
import com.hp.entity.User;
import com.hp.util.JdbcConn;

public class ScoreDaoImpl implements ScoreDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public List<Score> selectBySid(int sid) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try {
			conn = JdbcConn.getConn();
			
			String sql = "select * from score where sid=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, sid);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Score score = new Score(
						rs.getInt("id"),
						rs.getInt("sid"),
						rs.getString("subject"),
						rs.getInt("score"));
				list.add(score);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return list;
	}

}
