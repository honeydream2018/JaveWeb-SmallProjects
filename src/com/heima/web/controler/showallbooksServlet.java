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
 * 转发到书籍列表页面
 */
@WebServlet("/showallbooksServlet")
public class showallbooksServlet extends HttpServlet {
	bookSerive service=new bookServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//得到所有的书
		Map<String,book> books=service.findAllbooks();	
		//将得到的数据进行封装
		request.setAttribute("books", books);
		
		//转向显示页面listbooks.jsp
		//使用绝对路径前头不加/
		request.getRequestDispatcher("WEB-INF/pages/listbooks.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
