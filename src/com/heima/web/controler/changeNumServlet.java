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
	
		//得到请求参数 bookid和新的数量num
		String bookid=request.getParameter("bookid");
		String num=request.getParameter("num");
		int newNum=0;
		try {
			newNum=Integer.parseInt(num);
		}catch (Exception e) {
			//捕捉输入错误异常，提示用户
			request.setAttribute("message", "数量请输入数字");
			request.getRequestDispatcher("WEB-INF/pages/message.jsp").forward(request, response);
			return; 
		}
		//得到购物车，根据bookid获取购物项
		Cart cart=(Cart) request.getSession().getAttribute(MYConstant.SHOPPING_CART);
		CartItem item=cart.getMap().get(bookid);
		//修改购物项中的num
		item.setNum(newNum);
		//转向listcart.jsp
		request.getRequestDispatcher("WEB-INF/pages/listcart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
