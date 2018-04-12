package com.heima.web.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.domain.Cart;
import com.heima.domain.MYConstant;

/**
 * Servlet implementation class deleteItemServlet
 */
@WebServlet("/deleteItemServlet")
public class deleteItemServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//得到bookid
		String bookid=request.getParameter("bookid");
		
		//得到购物车
		Cart cart=(Cart) request.getSession().getAttribute(MYConstant.SHOPPING_CART);
		//从购物车中删除购物项
		cart.deletecartItem(bookid);
		//转向购物车类表页面listCart.jsp
		request.getRequestDispatcher("WEB-INF/pages/listcart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
