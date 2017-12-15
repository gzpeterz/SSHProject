package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;

import com.hc.bean.Book;
import com.hc.utils.PageBean;

public interface BookService {

	/**
	 * 添加(保存)图书
	 * @param book
	 */
	void save(Book book);
	/**
	 * 分页查询
	 * @param pageCode
	 * @param pageSize
	 * @param criteria
	 * @return
	 */
	PageBean<Book> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
	/**
	 * 学生模块分页查询
	 * @param pageCode
	 * @param pageSize
	 * @param criteria
	 * @return
	 */
	PageBean<Book> findByPages(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
	/**
	 * 修改前根据id查询
	 * @param book
	 * @return
	 */
	Book findById(Integer bid);
	/**
	 * 修改
	 * @param book
	 */
	void update(Book book);
	/**
	 * 删除
	 * @param book
	 */
	void delete(Book book);
	

}
