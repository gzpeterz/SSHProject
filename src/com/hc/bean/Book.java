package com.hc.bean;

import java.util.HashSet;
import java.util.Set;

public class Book {
	  /*`bid` int(20) NOT NULL AUTO_INCREMENT COMMENT '书号',
	  `bname` varchar(20) DEFAULT NULL COMMENT '书名',
	  `author` varchar(20) DEFAULT NULL COMMENT '作者',
	  `publish` varchar(20) DEFAULT NULL COMMENT '出版社',
	  `type` varchar(20) DEFAULT NULL COMMENT '类型',
	  `publish_time` varchar(20) DEFAULT NULL COMMENT '出版时间',
	  `state` varchar(6) DEFAULT NULL COMMENT '出借状态',*/
	private int bid;
	private String bname;
	private String author;
	private String publish;
	private String type;
	private String publish_time;
	private String state;
	
	/*private Set<Lend> lend = new HashSet<Lend>();*/
	private Set<Money> money = new HashSet<Money>();

	/*public Set<Lend> getLend() {
		return lend;
	}
	public void setLend(Set<Lend> lend) {
		this.lend = lend;
	}*/
	public Set<Money> getMoney() {
		return money;
	}
	public void setMoney(Set<Money> money) {
		this.money = money;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
