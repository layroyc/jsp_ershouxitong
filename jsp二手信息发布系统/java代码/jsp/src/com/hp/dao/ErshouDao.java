package com.hp.dao;

import java.util.ArrayList;
import com.hp.entity.Ershou;

public interface ErshouDao {
	   //È«²é
		ArrayList<Ershou> selectAll();
		//É¾³ý
		int delete(int id);
			//ÐÞ¸Ä
		int update(Ershou ershou);
		Ershou selectById(int id);
		
}
