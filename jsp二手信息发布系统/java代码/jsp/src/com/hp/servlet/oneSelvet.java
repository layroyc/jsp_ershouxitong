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
	//�޸ĵ�ʱ����Ҫ�ȸ���id���ҵ�Ҫ�޸Ķ������Ϣչʾ���޸�ҳ����
		//������Ӧ���ͺͱ����ʽ
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//��ȡ�������
		String i=request.getParameter("id");
		//��������ת��
		int id=Integer.parseInt(i);
		System.out.println(id+"-----");
		//����ʵ������� ���ø���id��ѯ�ķ���
		ErshouDao dao=new ErshouDaoImpl();
		Ershou se=dao.selectById(id);
		
		//�鵽֮���ŵ���������
		HttpSession session=request.getSession();
		session.setAttribute("se", se);
		//��ת���޸ĵ�ҳ��
		response.sendRedirect("/jsp/updateEmp.jsp");
	  
	  
}
}
