package com.hc.action;


import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.hc.bean.Money;
import com.hc.bean.Reader;
import com.hc.service.MoneyService;

import com.hc.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MoneyAction extends ActionSupport implements ModelDriven<Money>{
   private Money money = new Money();
  
	@Override
	public Money getModel() {
		return money;
	}
	
	private MoneyService moneyService;
	public void setMoneyService(MoneyService moneyService) {
		this.moneyService = moneyService;
	}
	
	/**
	 *  点击跳转
	 */
	public String goMove(){
		return "goMove";
	}
	
	/**
	 *  添加罚款记录
	 * @return
	 * @throws Exception
	 */
	public String save() {
		moneyService.save(money);
		return "goMove";
		
	}
	
	/**
	 *  显示罚款数据（分页查询）
	 * @return
	 * @throws Exception
	 */
	// 属性驱动
	// 当前页
	private Integer pageCode = 1;

	public void setPageCode(Integer pageCode) {
		if (pageCode == null || pageCode <1) {
			pageCode = 1;
		}
		this.pageCode = pageCode;
	}

	// 每页显示的条数
	private Integer pageSize = 2;

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String findByPage() {
		//创建离线条件查询对象
				DetachedCriteria criteria = DetachedCriteria.forClass(Money.class);
			
				try{
				
					
					Integer id = money.getReader().getSid();
					System.out.println(id);
					if(id >0){
						criteria.add(Restrictions.eq("reader.sid", id));
					}
				}catch(Exception e){
					
				}
				PageBean<Money>  page =moneyService.findByPage(pageCode,pageSize,criteria);
				//查
				
				//压栈
				ActionContext.getContext().getValueStack().set("page",page);
		return "findByPage";
		
	}
	
	public String initUpdate() {
		Integer mid = money.getMid();
		System.out.println(mid);
		if(mid == null){
			return "initUpdate";
		}
		money = moneyService.findById(mid);
		return "initUpdate";
		
	}
	
	public String update(){
		moneyService.update(money);
		return "initUpdate";
		
	}
	

}
