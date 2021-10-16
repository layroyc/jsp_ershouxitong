package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hp.dao.ErshouDao;
import com.hp.dao.ErshouDaoImpl;
import com.hp.entity.Ershou;


public class Update extends HttpServlet{
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	//设置响应类型和编码格式
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			
			//获取请求参数
			String id=request.getParameter("id");
			//数据类型转换
			int id2=Integer.parseInt(id);
			String name=request.getParameter("name");
			String kind=request.getParameter("kind");
			String mone=request.getParameter("money");
			int money=Integer.parseInt(mone);
			String faburen=request.getParameter("faburen");
			String phone=request.getParameter("phone");
			String time=request.getParameter("time");
			String qingkuang=request.getParameter("qingkuang");
			
			
			//创建实现类对象 调用修改方法
			ErshouDao dao=new ErshouDaoImpl();
			Ershou emp=new Ershou(id2,name,kind,money,faburen,phone,time,qingkuang);
			System.out.println(emp+"修改后的");
			int i=dao.update(emp);
			if(i>0){
				System.out.println("修改成功");
				response.sendRedirect("/jsp/Quan");
			}else{
				System.out.println("修改失败");
			}
	}
}

