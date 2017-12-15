package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.hc.bean.Money;
import com.hc.dao.MoneyDao;

import com.hc.utils.PageBean;
@Transactional
public class MoneyServiceImpl implements MoneyService{
    private MoneyDao moneyDao;
    
	public void setMoneyDao(MoneyDao moneyDao) {
		this.moneyDao = moneyDao;
	}

	@Override
	public void save(Money money) {
		moneyDao.save(money);
		
	}

	@Override
	public PageBean<Money> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return moneyDao.findByPage(pageCode,pageSize,criteria);
		
	}

	@Override
	public void update(Money money) {
		moneyDao.update(money);
		
	}

	@Override
	public Money findById(Integer mid) {
		return moneyDao.findById(mid);
		
	}

	

}
