package com.hp.dao;

import com.hp.entity.Admin;

public interface AdminDao {
	//��¼
		Admin login(String username);
	//ע��
		int zhuce(String username, String password,String shouji);
}
