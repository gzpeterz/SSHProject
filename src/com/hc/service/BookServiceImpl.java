package com.hc.service;

import org.springframework.transaction.annotation.Transactional;

import com.hc.dao.BookDao;



@Transactional
public class BookServiceImpl implements BookService{
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
}
