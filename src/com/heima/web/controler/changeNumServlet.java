package com.heima.web.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.domain.Cart;
import com.heima.domain.CartItem;
import com.heima.domain.MYConstant;

/**
 * Servlet implementation class changeNumServlet
 */
@WebServlet("/changeNumServlet")
public class changeNumServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//�õ�������� bookid���µ�����num
		String bookid=request.getParameter("bookid");
		String num=request.getParameter("num");
		int newNum=0;
		try {
			newNum=Integer.parseInt(num);
		}catch (Exception e) {
			//��׽��������쳣����ʾ�û�
			request.setAttribute("message", "��������������");
			request.getRequestDispatcher("WEB-INF/pages/message.jsp").forward(request, response);
			return; 
		}
		//�õ����ﳵ������bookid��ȡ������
		Cart cart=(Cart) request.getSession().getAttribute(MYConstant.SHOPPING_CART);
		CartItem item=cart.getMap().get(bookid);
		//�޸Ĺ������е�num
		item.setNum(newNum);
		//ת��listcart.jsp
		request.getRequestDispatcher("WEB-INF/pages/listcart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
