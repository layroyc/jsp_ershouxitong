package com.hp.dao;

import com.hp.entity.User;

public interface UserDao {

	public User selectByUser(String name);

	public int insert(User user);
}
