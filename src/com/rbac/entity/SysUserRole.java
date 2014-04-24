package com.rbac.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUserRole implements Serializable {
	
	private Long id;
	private SysUser sysUser;
	private SysRole sysRole;
	private Integer isDeleted;
	private Long creatorId;
	private Date createTime;
	private Long modifierId;
	private Date modifierTime;
	
	public SysUserRole(){	
	}
	
	public SysUserRole(Integer isDeleted){
		this.isDeleted=isDeleted;		
	}
	
	/**
	 * @param sysUser
	 * @param sysRole
	 * @param isDeleted
	 * @param creatorId
	 * @param createTime
	 * @param modifierId
	 * @param modifierTime
	 */
	public SysUserRole(SysUser sysUser,SysRole sysRole,Integer isDeleted,
			Long creatorId,Date createTime,Long modifierId, Date modifierTime){
		this.sysUser=sysUser;
		this.sysRole=sysRole;
		this.isDeleted=isDeleted;
		this.creatorId=creatorId;
		this.createTime=createTime;
		this.modifierId=modifierId;
		this.modifierTime=modifierTime;	
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public SysRole getSysRole() {
		return sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
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
	
	

}
