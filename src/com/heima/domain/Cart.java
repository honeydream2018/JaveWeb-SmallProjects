package com.heima.domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//���ﳵ
public class Cart {
	private int num;//����
	public int getNum() {
		num=0;
		for(Map.Entry<String, CartItem>  me:map.entrySet()) {
			CartItem item=me.getValue();
			num+=item.getNum();
		}
		return num;
	}
	private double price;//�ܼ�
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
	//���ﳵ�з���
	public void addBook(book book) {
		//�����жϸ�����û�ж�Ӧ�Ĺ�����
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
		//�У����ﳵ��������1 
		//û�У�����һ��������������
	}
	public void deletecartItem(String bookid) {
		map.remove(bookid);
	}
}
