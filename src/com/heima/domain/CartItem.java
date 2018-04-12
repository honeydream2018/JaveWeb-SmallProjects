package com.heima.domain;

public class CartItem {
	private book book;
	private int num;//买了几本同类型的书
	private double price;//同类型书总价
	
	public book getBook() {
		return book;
	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
	public void setBook(book book) {
		this.book = book;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	//计算同类型书的总价
	public double getPrice() {
		return price=book.getPrice()*num;
		
		
	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
}
