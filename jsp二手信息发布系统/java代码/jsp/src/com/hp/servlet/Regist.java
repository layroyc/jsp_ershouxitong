package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hp.dao.AdminDao;
import com.hp.dao.AdminDaoImpl;
import com.hp.entity.Admin;

public class Regist extends HttpServlet{
	 @Override
	 protected void service(HttpServletRequest request, HttpServletResponse response)
	 		throws ServletException, IOException {
	 	// TODO Auto-generated method stub
	 	  response.setContentType("text/html");
	 		response.setCharacterEncoding("UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		
	 		String username=request.getParameter("username");
	 		String password=request.getParameter("password");
	 		String shouji=request.getParameter("shouji");
			
	 	
	 		AdminDao dao=new AdminDaoImpl();
	 		Admin admin = dao.login(username);
	 		System.out.println(admin+"----");
	 		if(admin==null){
	 			//不存在 注册
	 			int a=dao.zhuce(username, password, shouji);
	 			if(a>0){
	 				System.out.println("注册成功！");
	 				response.sendRedirect("/jsp/login.jsp");
	 			}else{
	 				System.out.println("注册失败！");
	 				
	 			}
	 		}else{
	 			System.out.println("用户已经存在");
	 			response.sendRedirect("/jsp/register.jsp");
	 			
	 		}
	 }

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req, resp);
		}
}
