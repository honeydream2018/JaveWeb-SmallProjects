package com.heima.domain;

public class CartItem {
	private book book;
	private int num;//���˼���ͬ���͵���
	private double price;//ͬ�������ܼ�
	
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
	
	//����ͬ��������ܼ�
	public double getPrice() {
		return price=book.getPrice()*num;
		
		
	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
}
