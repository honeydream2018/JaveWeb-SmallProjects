package com.heima.web.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import com.heima.domain.Cart;
import com.heima.domain.MYConstant;
import com.heima.domain.book;
import com.heima.service.impl.bookServiceimpl;
import com.heima.service1.bookSerive;

/**
 * Servlet implementation class BuyServlet
 */
@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {
	private bookSerive service=new bookServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String bookid=request.getParameter("bookid");
		//��ȡ���ﳵ
		HttpSession session=request.getSession();
		Cart cart=(Cart) session.getAttribute(MYConstant.SHOPPING_CART);
		book book=service.findbookById(bookid);
		//û�й��ﳵ��ֱ�Ӵ���һ����������session��
		if(cart==null) {
			cart=new Cart();
			cart.addBook(book);
			session.setAttribute(MYConstant.SHOPPING_CART, cart);
		}else {
		//����У�ֱ�ӽ�������ӵ����ﳵ
			cart.addBook(book);
		}
		//ת���ﳵ�б�
		request.getRequestDispatcher("WEB-INF/pages/listcart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
