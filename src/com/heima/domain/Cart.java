package com.heima.domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//购物车
public class Cart {
	private int num;//总量
	public int getNum() {
		num=0;
		for(Map.Entry<String, CartItem>  me:map.entrySet()) {
			CartItem item=me.getValue();
			num+=item.getNum();
		}
		return num;
	}
	private double price;//总价
	private Map<String,CartItem> map=new LinkedHashMap<String,CartItem>();
	public double getprice() {
		price=0;
		for(Map.Entry<String, CartItem>  me:map.entrySet()) {
			CartItem item=me.getValue();
			price+=item.getPrice();
		}
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Map<String, CartItem> getMap() {
		return map;
	}
	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}
	//向购物车中放书
	public void addBook(book book) {
		//首先判断该书有没有对应的购物项
		String bookid=book.getId();
		boolean has=map.containsKey(bookid);
		if(has) {
			CartItem item=map.get(bookid);
			item.setNum(item.getNum()+1);
		}else {
			CartItem item=new CartItem();
			item.setBook(book);
			item.setNum(1);
			map.put(bookid, item);
		}
		//有，购物车的数量加1 
		//没有：创建一个购物项，把书放入
	}
	public void deletecartItem(String bookid) {
		map.remove(bookid);
	}
}
