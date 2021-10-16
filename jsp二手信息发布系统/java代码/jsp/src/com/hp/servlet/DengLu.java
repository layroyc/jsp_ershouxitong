package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hp.dao.AdminDao;
import com.hp.dao.AdminDaoImpl;
import com.hp.entity.Admin;


public class DengLu extends HttpServlet{
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	  //设置响应类型和编码格式
	   resp.setContentType("text/html");
	   resp.setCharacterEncoding("UTF-8");
	   req.setCharacterEncoding("UTF-8");
		
	   String username = req.getParameter("user");
	   String password = req.getParameter("pwd");
		
		AdminDao admin=new AdminDaoImpl();
		 Admin ad=admin.login(username);
		
		HttpSession session = req.getSession();
		if(password.equals(ad.getPassword())) {
			
		req.setAttribute("info", "登录成功");
		session.setAttribute("username", username); //返回信息给前台，添加用户信息到session
	
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}else {
			req.setAttribute("info", "登录失败");
		}
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
