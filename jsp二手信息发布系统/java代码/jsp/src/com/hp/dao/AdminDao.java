package com.hp.dao;

import com.hp.entity.Admin;

public interface AdminDao {
	//µÇÂ¼
		Admin login(String username);
	//×¢²á
		int zhuce(String username, String password,String shouji);
}
