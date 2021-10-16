package com.hp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hp.entity.Score;
import com.hp.entity.User;
import com.hp.service.ScoreService;
import com.hp.service.UserService;
import com.hp.service.impl.ScoreServiceImpl;
import com.hp.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.接收登录的账号密码
		 * 2.根据账号密码进行判断  正确登录成功跳转到主页面   错误 登录失败返回重新登录
		 */
		
		String name = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		
		UserService us = new UserServiceImpl();
		User user = us.selectByName(name);
		
		HttpSession session = req.getSession();
		if(pwd.equals(user.getPwd())) {
			/*
			 * 跳转到主界面，主界面显示当前账号的成绩信息
			 * 
			 */
			req.setAttribute("info", "登录成功");
			session.setAttribute("username", user); //返回信息给前台，添加用户信息到session
			
			ScoreService ss = new ScoreServiceImpl();
			List<Score> list = ss.selectBySid(user.getId());  //根据当前登录的用户的id，也就是学号来获取其成绩
						
			req.setAttribute("list", list);   //将结果返回给前台
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}else {
			req.setAttribute("info", "登录失败");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
