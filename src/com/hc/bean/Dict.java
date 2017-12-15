package com.hc.bean;

public class Dict {
	  /*`dict_id` varchar(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
	  `dict_type_code` varchar(3) NOT NULL COMMENT '类别代码',
	  `dict_type_name` varchar(20) NOT NULL COMMENT '类型名称',
	  `dict_item_name` varchar(20) DEFAULT NULL COMMENT '项目名称',*/
	
	private String dict_id;
	private String dict_type_code;
	private String dict_type_name;
	private String dict_item_name;
	
	public String getDict_id() {
		return dict_id;
	}
	public void setDict_id(String dict_id) {
		this.dict_id = dict_id;
	}
	public String getDict_type_code() {
		return dict_type_code;
	}
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	public String getDict_type_name() {
		return dict_type_name;
	}
	public void setDict_type_name(String dict_type_name) {
		this.dict_type_name = dict_type_name;
	}
	public String getDict_item_name() {
		return dict_item_name;
	}
	public void setDict_item_name(String dict_item_name) {
		this.dict_item_name = dict_item_name;
	}
	@Override
	public String toString() {
		return "Dict [dict_id=" + dict_id + ", dict_type_code=" + dict_type_code + ", dict_type_name=" + dict_type_name
				+ ", dict_item_name=" + dict_item_name + "]";
	}
	
}
