package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;

import com.hc.bean.Money;

import com.hc.utils.PageBean;

public interface MoneyService {

	void save(Money money);

	PageBean<Money> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

	void update(Money money);

	Money findById(Integer mid);

	

}
