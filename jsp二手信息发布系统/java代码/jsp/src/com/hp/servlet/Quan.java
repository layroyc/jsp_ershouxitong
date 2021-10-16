package com.hp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hp.dao.ErshouDao;
import com.hp.dao.ErshouDaoImpl;
import com.hp.entity.Ershou;


public class Quan extends HttpServlet {
	 @Override
	 protected void service(HttpServletRequest request, HttpServletResponse response)
	 		throws ServletException, IOException {
	 	// TODO Auto-generated method stub
		//������Ӧ���ͺͱ����ʽ
	 	response.setContentType("text/html");
	 	response.setCharacterEncoding("UTF-8");
	 	request.setCharacterEncoding("UTF-8");
	 		
	 	ErshouDao dao= new ErshouDaoImpl();
	 	ArrayList<Ershou> se=dao.selectAll();

	 	//��ȡsession�Ķ���
	 	HttpSession session=request.getSession();
	 	session.setAttribute("se", se);
	 	//response�ض���
	 	response.sendRedirect("/jsp/queryAll.jsp");
	 	
	 }

}
