package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.hc.bean.Book;
import com.hc.dao.BookDao;
import com.hc.utils.PageBean;

@Transactional
public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	/**
	 * 添加(保存)图书
	 */
	@Override
	public void save(Book book) {
		bookDao.save(book);
	}
	/**
	 * 分页查询
	 */
	@Override
	public PageBean<Book> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return bookDao.findByPage(pageCode, pageSize, criteria);
	}
	/**
	 * 学生模块分页查询
	 */
	@Override
	public PageBean<Book> findByPages(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return bookDao.findByPage(pageCode, pageSize, criteria);
	}
	/**
	 * 修改前根据id查询
	 */
	@Override
	public Book findById(Integer bid) {
		return bookDao.findById(bid);
	}
	/**
	 * 修改
	 */
	@Override
	public void update(Book book) {
		bookDao.update(book);
	}
	/**
	 * 删除
	 */
	@Override
	public void delete(Book book) {
		bookDao.delete(book);
	}
	

}
