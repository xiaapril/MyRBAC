package com.rbac.action.system;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.struts.ActionSupport;

import com.opensymphony.xwork2.ActionContext;
import com.rbac.common.MvcConstant;
import com.rbac.common.UserDetail;
import com.rbac.entity.SysUser;
import com.rbac.service.LoginService;

public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	private String submit;
	
	private LoginService loginService;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
		
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	public String execute() throws Exception{
		
		if(StringUtils.isNotBlank(getPassword())){
			UserDetail userDetail=loginService.login(getUsername(),getPassword());
			if(userDetail!=null){
				Map session = (Map)ActionContext.getContext().get("session");
				session.put("com_user", userDetail);
				return "success";
			}
		}
		return "fail";
			
	}
	
	
}
