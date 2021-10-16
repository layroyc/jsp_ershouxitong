package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hp.entity.User;
import com.hp.service.UserService;
import com.hp.service.impl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.先接受前台提交的用户信息
		 * 2.判断当前用户名在数据库是否存在，存在的话提示信息   用户已存在，请直接登录    跳转回注册界面
		 * 3.如果不存在，先插入数据到数据表，添加成功提示注册成功，跳转到登录界面，失败则提示注册失败，回到注册界面
		 */
		
		String name = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		String phone = req.getParameter("phone");
		UserService us = new UserServiceImpl();
		User user = us.selectByName(name);
		
		if(user != null) {//用户名存在
			req.setAttribute("info", "用户已存在,请重新注册");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}else {//用户名不存在
			User user1 = new User();
			user1.setName(name);
			user1.setPwd(pwd);
			user1.setPhone(phone);
			int a = us.insert(user1);
			if(a > 0) {
				req.setAttribute("info", "注册成功");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}else {
				req.setAttribute("info", "注册失败");
				req.getRequestDispatcher("register.jsp").forward(req, resp);
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
