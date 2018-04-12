package com.heima.util;

import java.util.LinkedHashMap;
import java.util.Map;

import com.heima.domain.book;

public class bookDb {
	private static Map<String,book> books=new LinkedHashMap<String,book>();
	static {
		books.put("ISBN-001", new book("ISBN-001","Java Web����ʵս","���������������",89.80,"һ��ͨ���׶�����"));
		books.put("ISBN-002", new book("ISBN-002","��ͨHibernate","James Elliott",55.00,"���鵽ͨ��һϵ�е�ʾ����Ŀ��ʾ�����ɶ��ִӼ򵥵����ӵ�����"));
		books.put("ISBN-003", new book("ISBN-003","JavaScript�߼��������","����˹",99.00,"�����ʺ���һ����̾���Ŀ�����Ա�Ķ�"));
		books.put("ISBN-004", new book("ISBN-004","����ǳ��hibernate","���/������/����",59.00,"�����ʺ���Hibernate�ĸ����ײ�Ķ���"));
		books.put("ISBN-005", new book("ISBN-005","Struts2������Ļ","½�� ",69.00,"�������Struts2�ܹ������ʵ��ԭ��"));
		books.put("ISBN-006", new book("ISBN-006","Java���ݽṹ���㷨","����", 55.00 ,"�����˼���������ʹ�õ����ݽṹ���㷨"));
	}
	public static Map<String ,book> getAll(){
		return books;
	}
	
	public static book getbookId(String bookid){
		return books.get(bookid);
	}
	
}
