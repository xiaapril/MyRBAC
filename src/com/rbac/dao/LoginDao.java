package com.rbac.dao;

import java.util.List;
import org.hibernate.criterion.Restrictions;

import com.rbac.common.BaseDaoSupport;
import com.rbac.entity.SysAction;
import com.rbac.entity.SysMenu;
import com.rbac.entity.SysUser;

public class LoginDao extends BaseDaoSupport {
	
	/**
	 * �����û��������û�
	 * @param username
	 * @return
	 */
	public SysUser getSysUserByUsername(String username){
		List list=super.getSession().createCriteria(SysUser.class).add(
				Restrictions.eq("isDeleted",0)).add(
				Restrictions.eq("username",username)).list();
		if(list.size()>0){
			return(SysUser) list.get(0);
		}
		return null;
	}
	
	/**
	 * �����û�id���Ҳ˵��б�
	 * @param userId
	 * @return
	 */
	public List getMenuListByUserId(Long userId){
		String sql="select m.* from sys_menu m where m.is_deleted=0 and m.ID in (select rm.menu_id from sys_role_menu rm where rm.is_deleted=0 and rm.ROLE_ID in" +
				"(select ur.role_id from sys_user_role ur where ur.is_deleted=0 and ur.user_id=:userId))";
		return super.getSession().createSQLQuery(sql).addEntity(SysMenu.class).setLong("userId",userId).list();
	}
	
	/**
	 * �����û�id����Ȩ���б�
	 * @param userId
	 * @return
	 */
	public List getActionListByUserId(Long userId){
		String sql = "select a.* from sys_action a where a.is_deleted=0 and a.id in (select ma.action_id from sys_menu_action ma where ma.is_deleted=0 and ma.menu_id in" +
				"(select rm.menu_id from sys_role_menu rm where rm.is_deleted=0 and rm.ROLE_ID in (select ur.role_id from sys_user_role ur where ur.is_deleted=0 and" +
				"ur.user_id=:userId)))";
		return super.getSession().createSQLQuery(sql).addEntity(SysAction.class).setLong("userId",userId).list();
	}

}
