package com.hc.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hc.bean.User;
import com.hc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * 属性驱动验证码
	 */
	private String viCode;
	
	public void setViCode(String viCode) {
		this.viCode = viCode;
	}

	public String login(){
		String user_code = user.getUser_code();
		String user_password = user.getUser_password();
		HttpSession session = ServletActionContext.getRequest().getSession();
		String vcode = (String) session.getAttribute("validateCode");
		if (user_code.trim().isEmpty() || user_code == null || user_password.trim().isEmpty() || user_password == null
				|| !vcode.equalsIgnoreCase(viCode)) {
			return "login";
		}
		User u = userService.login(user);
		// 如果用户不存在就回到登入页面
		if (u == null) {
			return "login";
		}
		session.setAttribute("existUser", u);
		return "index";
	}
	/**
	 * 安全退出
	 */
	public String exit() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("existUser");
		return "login";
	}
}
