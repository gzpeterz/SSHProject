package com.hc.bean;

public class Reader {
	  /*`sid` int(20) NOT NULL AUTO_INCREMENT COMMENT '学号',
	  `spassword` varchar(20) DEFAULT NULL COMMENT '密码',
	  `sname` varchar(20) DEFAULT NULL COMMENT '姓名',
	  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
	  `dept` varchar(20) DEFAULT NULL COMMENT '院系',
	  `grade` varchar(20) DEFAULT NULL COMMENT '班级',
	  `register_time` varchar(20) DEFAULT NULL COMMENT '注册时间',
	  `state` varchar(6) DEFAULT NULL COMMENT '状态',*/
	
	private Integer sid;
	private String sname;
	private String spassword;
	private String sex;
	private String dept;
	private String grade;
	private String register_time;
	private String state;
	
	/*private Set<Lend> lend = new HashSet<Lend>();
	private Set<Money> money = new HashSet<Money>();*/
	
	
/*	public Set<Lend> getLend() {
		return lend;
	}
	public void setLend(Set<Lend> lend) {
		this.lend = lend;
	}
	public Set<Money> getMoney() {
		return money;
	}
	public void setMoney(Set<Money> money) {
		this.money = money;
	}*/
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
