package com.heima.dao;

import java.util.Map;

import com.heima.domain.book;

public interface bookDao {

	Map<String, book> findAllBooks();

	/*
	 * 根据书的id获取书对象
	 */
	book findbookById(String bookid);

}