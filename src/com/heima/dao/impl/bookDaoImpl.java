package com.heima.dao.impl;

import java.util.Map;

import com.heima.dao.bookDao;
import com.heima.domain.book;
import com.heima.util.bookDb;

public class bookDaoImpl implements bookDao  {
	/*
	 * 获取所有的书
	 * return Map<id,书对象>
	 */
	
	/* (non-Javadoc)
	 * @see com.heima.dao.impl.bookDaoImpl#findAllBooks()
	 */
	@Override
	public Map<String, book> findAllBooks(){
		return bookDb.getAll();
	}
	/*
	 * 根据书的id获取书对象
	 */
	/* (non-Javadoc)
	 * @see com.heima.dao.impl.bookDaoImpl#findbookById(java.lang.String)
	 */
	@Override
	public book findbookById(String bookid) {
		return bookDb.getbookId(bookid);
		
	}
}
