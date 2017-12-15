package com.hc.service;

import org.springframework.transaction.annotation.Transactional;

import com.hc.dao.ReaderDao;

@Transactional
public class ReaderServiceImpl implements ReaderService{
	  private ReaderDao readerDao;

	

	public void setReaderDao(ReaderDao readerDao) {
		this.readerDao = readerDao;
	}
	    
		

}
