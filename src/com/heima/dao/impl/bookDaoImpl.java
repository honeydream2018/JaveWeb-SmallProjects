package com.heima.dao.impl;

import java.util.Map;

import com.heima.dao.bookDao;
import com.heima.domain.book;
import com.heima.util.bookDb;

public class bookDaoImpl implements bookDao  {
	/*
	 * ��ȡ���е���
	 * return Map<id,�����>
	 */
	
	/* (non-Javadoc)
	 * @see com.heima.dao.impl.bookDaoImpl#findAllBooks()
	 */
	@Override
	public Map<String, book> findAllBooks(){
		return bookDb.getAll();
	}
	/*
	 * �������id��ȡ�����
	 */
	/* (non-Javadoc)
	 * @see com.heima.dao.impl.bookDaoImpl#findbookById(java.lang.String)
	 */
	@Override
	public book findbookById(String bookid) {
		return bookDb.getbookId(bookid);
		
	}
}
