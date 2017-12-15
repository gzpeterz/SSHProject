package com.hc.dao;

import com.hc.bean.Book;

public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao{
         private BookDao bookDao;

		public void setBookDao(BookDao bookDao) {
			this.bookDao = bookDao;
		}
         
}
