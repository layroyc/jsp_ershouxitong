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
	//设置响应类型和编码格式
  	response.setContentType("text/html");
  	response.setCharacterEncoding("UTF-8");
  	request.setCharacterEncoding("UTF-8");
  	
  			
 
  	String id=request.getParameter("id");
  	//类型转换
  	 int id2 =Integer.parseInt(id);

  	//创建实现类对象 调用删除方法
  	ErshouDao dao=new ErshouDaoImpl();
		int a=dao.delete(id2);
		
	    if(a>0){
			 System.out.println("恭喜你删除成功！");
			response.sendRedirect("/jsp/Quan");
		 }else{
			System.out.println("删除失败！");
		 }
  	
  }
}

