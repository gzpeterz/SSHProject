package com.hc.action;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.hc.bean.Book;
import com.hc.bean.Dict;
import com.hc.service.BookService;
import com.hc.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookAction extends ActionSupport implements ModelDriven<Book>{

	private Book book = new Book();
	
	@Override
	public Book getModel() {
		return book;
	}

	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	/**
	 * 点击跳转
	 */
	public String initAddUI(){
		return "initAddUI";
	}
	/**
	 * 添加(保存)图书
	 */
	public String save(){
		bookService.save(book);
		return "initAddUI";
	}
	/**
	 *  分页查询图书列表
	 */
	private Integer pageCode = 1;//当前页
	private Integer pageSize = 2;//每页显示的条数
	
	public void setPageCode(Integer pageCode) {
		if(pageCode==null || pageCode<1){
			pageCode = 1;
		}
		this.pageCode = pageCode;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public String findByPage(){
		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
		try {
			//1、根据图书名称查询
			String bname = book.getBname();
			if (!bname.trim().isEmpty() && bname != null) {
				criteria.add(Restrictions.like("bname", "%"+bname+"%"));
			}
			//2、根据图书类型查询
			Dict type = book.getType();
			if (!type.getDict_id().trim().isEmpty() && type != null) {
				criteria.add(Restrictions.eq("type.dict_id", type.getDict_id()));
			}
			//3、根据作者查询
			String author = book.getAuthor();
			if (!author.trim().isEmpty() && author != null) {
				criteria.add(Restrictions.like("author", "%"+author+"%"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		PageBean<Book> page = bookService.findByPage(pageCode,pageSize,criteria);
		ActionContext.getContext().getValueStack().set("page", page);
		return "findByPage";
	}
	public String findByPages() throws Exception{
		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
		try {
			//1、根据图书名称查询
			String bname = book.getBname();
			if (!bname.trim().isEmpty() && bname != null) {
				criteria.add(Restrictions.like("bname", "%"+bname+"%"));
			}
			//2、根据图书类型查询
			Dict type = book.getType();
			if (!type.getDict_id().trim().isEmpty() && type != null) {
				criteria.add(Restrictions.eq("type.dict_id", type.getDict_id()));
			}
			//3、根据作者查询
			String author = book.getAuthor();
			if (!author.trim().isEmpty() && author != null) {
				criteria.add(Restrictions.like("author", "%"+author+"%"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		PageBean<Book> page = bookService.findByPages(pageCode,pageSize,criteria);
		ActionContext.getContext().getValueStack().set("page", page);
		return "findByPages";
	}
	/**
	 * 修改前根据id查询
	 */
	public String initUpdate(){
		Integer bid = book.getBid();
		if(bid == null){
			return "initUpdate";
		}
		book = bookService.findById(bid);
		return "initUpdate";
	}
	/**
	 * 修改
	 */
	public String update(){
		bookService.update(book);
		return "update";
	}
	/**
	 * 删除
	 */
	public String delete(){
		Integer bid = book.getBid();
		book = bookService.findById(bid);
		bookService.delete(book);
		return "delete";
	}
}
