package com.hp.dao;

import java.util.ArrayList;
import com.hp.entity.Ershou;

public interface ErshouDao {
	   //ȫ��
		ArrayList<Ershou> selectAll();
		//ɾ��
		int delete(int id);
			//�޸�
		int update(Ershou ershou);
		Ershou selectById(int id);
		
}
