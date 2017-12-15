package com.hc.action;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.hc.bean.Dict;
import com.hc.service.DictService;
import com.hc.utils.FastJsonUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DictAction extends ActionSupport implements ModelDriven<Dict>{

	private Dict dict = new Dict();
	
	@Override
	public Dict getModel() {
		return dict;
	}

	private DictService dictService;

	public void setDictService(DictService dictService) {
		this.dictService = dictService;
	}
	/**
	 * ajax加载图书类型
	 * @return
	 */
	public String findByCode(){
		String dict_type_code = dict.getDict_type_code();//查询ajax post请求提交过来的数据
		List<Dict> list = dictService.findByCode(dict_type_code);//然后用数据去查询
		String jsonString = FastJsonUtil.toJSONString(list);//把集合数据转换为json格式
		HttpServletResponse response = ServletActionContext.getResponse();//将数据写出去
		FastJsonUtil.write_json(response, jsonString);
		return NONE;
	}
}
