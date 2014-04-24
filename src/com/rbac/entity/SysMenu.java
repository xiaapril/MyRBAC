package com.rbac.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SysMenu implements Serializable {
	
	private Long id;
	private SysMenu sysMenu;
	private String name;
	private String url;
	private Integer needCheck;
	private Integer isDeleted;
	private Integer isShow;
	private Long creatorId;
	private Date createTime;
	private Long modifierId;
	private Date modifierTime;
	private Integer orderSeq;
	private Long parentId;
	
	private Set sysMenus=new HashSet(0);
	private Set sysMenuActions=new HashSet(0);
	private Set sysRoleMenus=new HashSet(0);
	
	public SysMenu(){		
	}
	
	public SysMenu(SysMenu sysMenu,String name,String url, Integer needCheck,
			Integer isShow, Integer isDelete,Long creatorId,Date createTime,Long modifierId,
			Date modifierTime, Set sysMenus, Set sysMenuActions, Set sysRoleMenus){
		this.sysMenu=sysMenu;
		this.url=url;
		this.name=name;
		this.needCheck=needCheck;
		this.isShow=isShow;
		this.isDeleted=isDelete;
		this.creatorId=creatorId;
		this.createTime=createTime;
		this.modifierId=modifierId;
		this.modifierTime=modifierTime;
		this.sysMenus=sysMenus;
		this.sysMenuActions=sysMenuActions;
		this.sysRoleMenus=sysRoleMenus;
	}

	public SysMenu(SysMenu sysMenu,String url){
		this.sysMenu=sysMenu;
		this.url=url;	
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
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
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
	public Set getSysMenus() {
		return sysMenus;
	}
	public void setSysMenus(Set sysMenus) {
		this.sysMenus = sysMenus;
	}
	public Set getSysMenuActions() {
		return sysMenuActions;
	}
	public void setSysMenuActions(Set sysMenuActions) {
		this.sysMenuActions = sysMenuActions;
	}
	public Set getSysRoleMenus() {
		return sysRoleMenus;
	}
	public void setSysRoleMenus(Set sysRoleMenus) {
		this.sysRoleMenus = sysRoleMenus;
	}

	public Integer getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(Integer orderSeq) {
		this.orderSeq = orderSeq;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
}
