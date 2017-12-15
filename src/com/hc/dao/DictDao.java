package com.hc.dao;

import java.util.List;

import com.hc.bean.Dict;

public interface DictDao {

	/**
	 * 查询图书类型
	 * @param dict_type_code
	 * @return
	 */
	List<Dict> findByCode(String dict_type_code);
}
