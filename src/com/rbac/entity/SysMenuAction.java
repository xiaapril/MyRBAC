package com.rbac.entity;

import java.io.Serializable;
import java.util.Date;

public class SysMenuAction implements Serializable {
	
	private Long id;
	private SysMenu sysMenu;
	private SysAction sysAction;
	private Integer isDeleted;
	private Long creatorId;
	private Date createTime;
	private Long modifierId;
	private Date modifierTime;
	
	
	public SysMenuAction() {
	}

	/** minimal constructor */
	public SysMenuAction(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	/** full constructor */
	public SysMenuAction(SysMenu sysMenu, SysAction sysAction,
			Integer isDeleted, Long creatorId, Date createTime,
			Long modifierId, Date modifierTime) {
		this.sysMenu = sysMenu;
		this.sysAction = sysAction;
		this.isDeleted = isDeleted;
		this.creatorId = creatorId;
		this.createTime = createTime;
		this.modifierId = modifierId;
		this.modifierTime = modifierTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SysMenu getSysMenu() {
		return sysMenu;
	}

	public void setSysMenu(SysMenu sysMenu) {
		this.sysMenu = sysMenu;
	}

	public SysAction getSysAction() {
		return sysAction;
	}

	public void setSysAction(SysAction sysAction) {
		this.sysAction = sysAction;
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
