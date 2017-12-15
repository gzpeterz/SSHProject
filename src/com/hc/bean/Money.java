package com.hc.bean;

public class Money {
	  /*`mid` int(20) NOT NULL AUTO_INCREMENT COMMENT '罚款编号',
	  `sid` int(20) DEFAULT NULL COMMENT '学号',
	  `bid` int(20) DEFAULT NULL COMMENT '书号',
	  `fine_time` varchar(20) DEFAULT NULL COMMENT '罚款时间',
	  `sum` varchar(20) DEFAULT NULL COMMENT '金额',
	  `state` varchar(6) DEFAULT NULL COMMENT '缴纳状态',
	  `pay_time` varchar(20) DEFAULT NULL COMMENT '缴纳时间',*/
	
	private Integer mid;	//主键
	private String fine_time;
	private String sum;
	private String state;
	private String pay_time;

	private Reader reader;
	private Book book;
	
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getFine_time() {
		return fine_time;
	}
	public void setFine_time(String fine_time) {
		this.fine_time = fine_time;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPay_time() {
		return pay_time;
	}
	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}
	
}
