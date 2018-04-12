package com.heima.service1;

import java.util.Map;

import com.heima.domain.book;

public interface bookSerive {

	Map<String, book> findAllbooks();
	book findbookById(String bookid);
}