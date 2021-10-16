package com.hp.service;

import com.hp.entity.User;

public interface UserService {
	//根据用户名查找用户
	public User selectByName(String name);

	public int insert(User user);

}
