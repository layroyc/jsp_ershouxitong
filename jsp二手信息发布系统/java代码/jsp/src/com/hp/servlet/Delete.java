package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hp.dao.ErshouDao;
import com.hp.dao.ErshouDaoImpl;


public class Delete extends HttpServlet{
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	//������Ӧ���ͺͱ����ʽ
  	response.setContentType("text/html");
  	response.setCharacterEncoding("UTF-8");
  	request.setCharacterEncoding("UTF-8");
  	
  			
 
  	String id=request.getParameter("id");
  	//����ת��
  	 int id2 =Integer.parseInt(id);

  	//����ʵ������� ����ɾ������
  	ErshouDao dao=new ErshouDaoImpl();
		int a=dao.delete(id2);
		
	    if(a>0){
			 System.out.println("��ϲ��ɾ���ɹ���");
			response.sendRedirect("/jsp/Quan");
		 }else{
			System.out.println("ɾ��ʧ�ܣ�");
		 }
  	
  }
}

