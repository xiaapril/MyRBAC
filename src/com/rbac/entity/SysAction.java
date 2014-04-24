package com.rbac.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SysAction implements Serializable {
	
	private Long id;
	private String name;
	private String url;
	private Integer needCheck;
	private Integer isDeleted;
	private Long creatorId;
	private Date createTime;
	private Long modifierId;
	private Date modifierTime;
	
	private Set sysMenuActions=new HashSet(0);
	
	public SysAction(){	
	}
	
	public SysAction(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	/** full constructor */
	public SysAction(String name, String url, Integer needCheck,
			Integer isDeleted, Long creatorId, Date createTime,
			Long modifierId, Date modifierTime, Set sysMenuActions) {
		this.name = name;
		this.url = url;
		this.needCheck = needCheck;
		this.isDeleted = isDeleted;
		this.creatorId = creatorId;
		this.createTime = createTime;
		this.modifierId = modifierId;
		this.modifierTime = modifierTime;
		this.sysMenuActions = sysMenuActions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getNeedCheck() {
		return needCheck;
	}

	public void setNeedCheck(Integer needCheck) {
		this.needCheck = needCheck;
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

	public Set getSysMenuActions() {
		return sysMenuActions;
	}

	public void setSysMenuActions(Set sysMenuActions) {
		this.sysMenuActions = sysMenuActions;
	}
	
	
	
	
	
}
