package com.heima.service.impl;

import java.util.Map;

import com.heima.dao.bookDao;
import com.heima.dao.impl.bookDaoImpl;
import com.heima.domain.book;
import com.heima.service1.bookSerive;

public class bookServiceimpl implements bookSerive {
	bookDao dao=new bookDaoImpl();
		
		
	/* (non-Javadoc)
	 * @see com.heima.service.impl.bookSerive#findAllbooks()
	 */
	@Override
	public Map<String ,book> findAllbooks(){
		return dao.findAllBooks();
	}
	public book findbookById(String bookid) {
		return dao.findbookById(bookid);
	}
	
	
	
}
