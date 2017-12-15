package com.hc.action;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.hc.bean.Reader;
import com.hc.service.ReaderService;
import com.hc.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@SuppressWarnings("all")
public class ReaderAction extends ActionSupport implements ModelDriven<Reader>{
	
    private Reader reader=new Reader();
    
	@Override
	public Reader getModel() {
		return reader;
	}
	
    private ReaderService readerService;
    
	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
	}
	/**
	 *  点击跳转
	 */
    public String initAddUI(){
    	return "initAddUI";
    }
    /**
     * 添加读者
     */
    public String save(){
    	readerService.save(reader);
    	return "initAddUI";
    }
    
    /**
	 *  分页查询读者
	 */
	// 属性驱动
	// 当前页
	private Integer pageCode =1;
	
	public void setPageCode(Integer pageCode) {
		if(pageCode == null || pageCode < 1){
			pageCode = 1;
		}
		this.pageCode = pageCode;
	}
	// 每页显示的条数
	private Integer pageSize=2;
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String findByPage(){
		//创建离线条件查询对象
		DetachedCriteria criteria = DetachedCriteria.forClass(Reader.class);
		try{
			//1.用学号查询
			int sid = reader.getSid();
			if (sid > 0) {
				criteria.add(Restrictions.eq("sid", sid));
			}
			//2.用姓名查询
			String sname=reader.getSname();
			if(!sname.trim().isEmpty() && sname != null){
				criteria.add(Restrictions.like("sname","%"+sname+"%"));
			}
		}catch(Exception e){
			
		}
		//查
		PageBean<Reader> page=readerService.findByPage(pageCode, pageSize, criteria);
		//压栈
		ActionContext.getContext().getValueStack().set("page",page);
		return "findByPage";
	}
	public String findByPages(){
		//创建离线条件查询对象
		DetachedCriteria criteria = DetachedCriteria.forClass(Reader.class);
		try{
			//1.用学号查询
			int sid = reader.getSid();
			if (sid > 0) {
				criteria.add(Restrictions.eq("sid", sid));
			}
			//2.用姓名查询
			String sname=reader.getSname();
			if(!sname.trim().isEmpty() && sname != null){
				criteria.add(Restrictions.like("sname","%"+sname+"%"));
			}
		}catch(Exception e){
			
		}
		//查
		PageBean<Reader> page=readerService.findByPages(pageCode, pageSize, criteria);
		//压栈
		ActionContext.getContext().getValueStack().set("page",page);
		return "findByPages";
	}
	/**
	 * 修改前，先用id查询
	 * @return
	 */
	public String initUpdate(){
		Integer sid = reader.getSid();
		if(sid == null){
			return "initUpdate";
		}
		reader = readerService.findById(sid);
		return "initUpdate";
	}
	/**
	 * 修改
	 */
	public String update(){
		readerService.update(reader);
		return "update";
	}
	/**
	 * 删除
	 * @return
	 */
	public String delete(){
		Integer sid= reader.getSid();
		reader =readerService.findById(sid);
		readerService.delete(reader);
		return "delete";
	}

}
