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
	
	//������Ӧ���ͺͱ����ʽ
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			
			//��ȡ�������
			String id=request.getParameter("id");
			//��������ת��
			int id2=Integer.parseInt(id);
			String name=request.getParameter("name");
			String kind=request.getParameter("kind");
			String mone=request.getParameter("money");
			int money=Integer.parseInt(mone);
			String faburen=request.getParameter("faburen");
			String phone=request.getParameter("phone");
			String time=request.getParameter("time");
			String qingkuang=request.getParameter("qingkuang");
			
			
			//����ʵ������� �����޸ķ���
			ErshouDao dao=new ErshouDaoImpl();
			Ershou emp=new Ershou(id2,name,kind,money,faburen,phone,time,qingkuang);
			System.out.println(emp+"�޸ĺ��");
			int i=dao.update(emp);
			if(i>0){
				System.out.println("�޸ĳɹ�");
				response.sendRedirect("/jsp/Quan");
			}else{
				System.out.println("�޸�ʧ��");
			}
	}
}

