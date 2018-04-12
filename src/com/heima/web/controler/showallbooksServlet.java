package com.heima.web.controler;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.domain.book;
import com.heima.service.impl.bookServiceimpl;
import com.heima.service1.bookSerive;

/**
 * ת�����鼮�б�ҳ��
 */
@WebServlet("/showallbooksServlet")
public class showallbooksServlet extends HttpServlet {
	bookSerive service=new bookServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�õ����е���
		Map<String,book> books=service.findAllbooks();	
		//���õ������ݽ��з�װ
		request.setAttribute("books", books);
		
		//ת����ʾҳ��listbooks.jsp
		//ʹ�þ���·��ǰͷ����/
		request.getRequestDispatcher("WEB-INF/pages/listbooks.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
