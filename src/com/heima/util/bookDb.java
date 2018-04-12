package com.heima.util;

import java.util.LinkedHashMap;
import java.util.Map;

import com.heima.domain.book;

public class bookDb {
	private static Map<String,book> books=new LinkedHashMap<String,book>();
	static {
		books.put("ISBN-001", new book("ISBN-001","Java Web开发实战","软件开发技术联盟",89.80,"一本通俗易懂的书"));
		books.put("ISBN-002", new book("ISBN-002","精通Hibernate","James Elliott",55.00,"本书到通过一系列的示例项目演示如何完成多种从简单到复杂的任务"));
		books.put("ISBN-003", new book("ISBN-003","JavaScript高级程序设计","扎卡斯",99.00,"本书适合有一定编程经验的开发人员阅读"));
		books.put("ISBN-004", new book("ISBN-004","深入浅出hibernate","夏昕/曹晓钢/唐勇",59.00,"本书适合于Hibernate的各个阶层的读者"));
		books.put("ISBN-005", new book("ISBN-005","Struts2技术内幕","陆舟 ",69.00,"深入解析Struts2架构设计与实现原理"));
		books.put("ISBN-006", new book("ISBN-006","Java数据结构和算法","佛著", 55.00 ,"介绍了计算机编程中使用的数据结构和算法"));
	}
	public static Map<String ,book> getAll(){
		return books;
	}
	
	public static book getbookId(String bookid){
		return books.get(bookid);
	}
	
}
