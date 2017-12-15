package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;

import com.hc.bean.Reader;
import com.hc.utils.PageBean;

public interface ReaderService {
    /**
     *
     * 添加读者信息
     * @param reader
     */
	void save(Reader reader);
    /**
     * 分页查询读者信息
     * @param pageCode
     * @param pageSize
     * @param criteria
     * @return
     */
	PageBean<Reader> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
	/**
     * 分页查询读者信息
     * @param pageCode
     * @param pageSize
     * @param criteria
     * @return
     */
	PageBean<Reader> findByPages(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
	/**
	 * 根据Id查询读者信息
	 * @param sid
	 * @return
	 */
	Reader findById(Integer sid);
	/**
	 * 修改读者信息
	 * @param reader
	 */
	void update(Reader reader);
	/**
	 * 删除
	 * @param reader
	 * 
	 */
	void delete(Reader reader);

	

//	List<Reader> findAll();



}
