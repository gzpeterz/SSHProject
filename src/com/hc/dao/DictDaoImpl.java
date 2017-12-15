package com.hc.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.hc.bean.Dict;

public class DictDaoImpl extends HibernateDaoSupport implements DictDao{

	/**
	 * 查询图书类型
	 */
	@Override
	public List<Dict> findByCode(String dict_type_code) {
		return (List<Dict>) this.getHibernateTemplate().find("from Dict where dict_type_code = ?", dict_type_code);
	}

}
