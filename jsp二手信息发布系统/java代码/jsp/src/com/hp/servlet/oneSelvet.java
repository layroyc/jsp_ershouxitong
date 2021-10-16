package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hp.dao.ErshouDao;
import com.hp.dao.ErshouDaoImpl;
import com.hp.entity.Ershou;

public class oneSelvet extends HttpServlet{
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	//修改的时候需要先根据id查找到要修改对象的信息展示到修改页面上
		//设置响应类型和编码格式
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//获取请求参数
		String i=request.getParameter("id");
		//数据类型转换
		int id=Integer.parseInt(i);
		System.out.println(id+"-----");
		//创建实现类对象 调用根据id查询的方法
		ErshouDao dao=new ErshouDaoImpl();
		Ershou se=dao.selectById(id);
		
		//查到之后存放到作用域中
		HttpSession session=request.getSession();
		session.setAttribute("se", se);
		//跳转到修改的页面
		response.sendRedirect("/jsp/updateEmp.jsp");
	  
	  
}
}
