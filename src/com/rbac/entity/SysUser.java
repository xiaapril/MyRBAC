package com.rbac.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SysUser implements Serializable {
	
	private Long id;
	private String username;
	private String password;
	private String realname;
	private String salt;
	private Integer isDeleted;
	private Long creatorId;
	private Date createTime;
	private Long modifierId;
	private Date modifierTime;
	
	private Set sysUserRoles=new HashSet(0);
	
	public SysUser(){	
	}
	
	public SysUser(String username, String password, Integer isDelete){
		this.username=username;
		this.password=password;
		this.isDeleted=isDeleted;
	}
	
	public SysUser(String username, String password, String realname, Integer isDelete,Long creatorId,
			Date createTime, Long modifierId, Date modifierTime, Set sysUserRoles){
		this.username=username;
		this.password=password;
		this.isDeleted=isDeleted;
		this.creatorId=creatorId;
		this.createTime=createTime;
		this.modifierId=modifierId;
		this.modifierTime=modifierTime;
		this.sysUserRoles=sysUserRoles;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifierId() {
		return modifierId;
	}

	public void setModifierId(Long modifierId) {
		this.modifierId = modifierId;
	}

	public Date getModifierTime() {
		return modifierTime;
	}

	public void setModifierTime(Date modifierTime) {
		this.modifierTime = modifierTime;
	}

	public Set getSysUserRoles() {
		return sysUserRoles;
	}

	public void setSysUserRoles(Set sysUserRoles) {
		this.sysUserRoles = sysUserRoles;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
