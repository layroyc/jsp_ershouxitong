package com.hp.service.impl;

import com.hp.dao.UserDao;
import com.hp.dao.impl.UserDaoImpl;
import com.hp.entity.User;
import com.hp.service.UserService;

public class UserServiceImpl implements UserService{
	
	UserDao ud = new UserDaoImpl();

	@Override
	public User selectByName(String name) {
		// TODO Auto-generated method stub
		return ud.selectByUser(name);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return ud.insert(user);
	}


}
