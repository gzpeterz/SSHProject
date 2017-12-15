package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.hc.bean.Reader;
import com.hc.dao.ReaderDao;
import com.hc.utils.PageBean;
@Transactional
public class ReaderServiceImpl implements ReaderService{
    private ReaderDao readerDao;
    
	public void setReaderDao(ReaderDao readerDao) {
		this.readerDao = readerDao;
	}
    /**
     * 添加读者信息
     */
	@Override
	public void save(Reader reader) {
		readerDao.save(reader);
	}
	/**
	 * 查询读者信息
	 */
	@Override
	public PageBean<Reader> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return readerDao.findByPage(pageCode, pageSize, criteria);
	}
	@Override
	public PageBean<Reader> findByPages(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return readerDao.findByPage(pageCode, pageSize, criteria);
	}
	/**
	 * 用id查询读者信息
	 */
	@Override
	public Reader findById(Integer sid) {
		return readerDao.findById(sid);
	}
	/**
	 * 修改
	 */
	@Override
	public void update(Reader reader) {
		readerDao.update(reader);
	}
	/**
	 * 删除
	 * @param reader
	 */
	@Override
	public void delete(Reader reader) {
		readerDao.delete(reader);
	}
}
