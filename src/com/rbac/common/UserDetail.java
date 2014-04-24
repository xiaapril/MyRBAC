package com.rbac.common;

import java.util.Set;

import com.rbac.entity.SysUser;

public class UserDetail {
	
	private SysUser user;
	
	private String menuJsonString;
	
	private Set<String> permitActionSet;

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public String getMenuJsonString() {
		return menuJsonString;
	}

	public void setMenuJsonString(String menuJsonString) {
		this.menuJsonString = menuJsonString;
	}

	public Set<String> getPermitActionSet() {
		return permitActionSet;
	}

	public void setPermitActionSet(Set<String> permitActionSet) {
		this.permitActionSet = permitActionSet;
	}
	
	

}
