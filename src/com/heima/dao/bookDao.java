package com.heima.dao;

import java.util.Map;

import com.heima.domain.book;

public interface bookDao {

	Map<String, book> findAllBooks();

	/*
	 * �������id��ȡ�����
	 */
	book findbookById(String bookid);

}