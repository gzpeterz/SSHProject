package com.hc.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.hc.utils.PageBean;

/**
 *  通用的增 、 删 、 改 、分页查询、查询所有、用id查询
 * @author Administrator
 *
 * @param <T>
 */
public interface BaseDao<T> {

	
	public void save(T t);
	
	public void delete(T t);
	
	public void update(T t);
	/**
	 *  用id查询
	 * @param id
	 * @return
	 */
	public T findById(Integer id);
	/**
	 *  查询所有
	 */
	public List<T> findAll();
	/**
	 *  分页查询
	 */
	public PageBean<T> findByPage(Integer pageCode,Integer pageSize,DetachedCriteria criteria);
	/**
	 * 学生模块分页查询
	 * @param pageCode
	 * @param pageSize
	 * @param criteria
	 * @return
	 */
	public PageBean<T> findByPages(Integer pageCode,Integer pageSize,DetachedCriteria criteria);
}
