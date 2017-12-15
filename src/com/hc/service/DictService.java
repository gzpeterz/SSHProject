package com.hc.service;

import java.util.List;

import com.hc.bean.Dict;

public interface DictService {

	/**
	 * 查询图书类型
	 * @param dict_type_code
	 * @return
	 */
	List<Dict> findByCode(String dict_type_code);
}
