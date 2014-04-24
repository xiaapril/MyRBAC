package com.rbac.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SysRole implements Serializable {
	
	private Long id;
	private String roleName;
	private String roleDesc;
	private Integer isDeleted;
	private Long creatorId;
	private Date createTime;
	private Long modifierId;
	private Date modifierTime;
	
	private Set sysUserRoles= new HashSet(0);
	private Set sysRoleMenus= new HashSet(0);
	
	public SysRole(){
	}
	
	public SysRole(Integer isDeleted){
		this.isDeleted=isDeleted;		
	}
	
	public SysRole(String rolename,String roleDesc,Integer isDeleted,Long creatorId,
			Date createTime,Long modifierId,Date modifierTime,Set sysUserRoles,Set sysRoleMenus ){
		this.roleName=roleName;
		this.roleDesc=roleDesc;
		this.isDeleted=isDeleted;
		this.creatorId=creatorId;
		this.createTime=createTime;
		this.modifierId=modifierId;
		this.modifierTime=modifierTime;
		this.sysUserRoles=sysUserRoles;
		this.sysRoleMenus=sysRoleMenus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
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

	public Set getSysRoleMenus() {
		return sysRoleMenus;
	}

	public void setSysRoleMenus(Set sysRoleMenus) {
		this.sysRoleMenus = sysRoleMenus;
	}
	
	
	

}
