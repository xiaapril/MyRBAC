package com.rbac.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.rbac.common.MvcConstant;

public class SessionListener implements HttpSessionAttributeListener,
		HttpSessionListener {
	
	private static int userNumber=0;
	
	private static Set<HttpSession> sessions=new HashSet<HttpSession>();

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session=arg0.getSession();
		if(session.getAttribute(MvcConstant.USER)!=null){
			if(!sessions.contains(session)){
				sessions.add(session);
				syncUserNumber();
			}
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}
	
	private void syncUserNumber() {
		// TODO Auto-generated method stub
		userNumber=0;
		Iterator<HttpSession> iter=sessions.iterator();
		while(iter.hasNext()){
			HttpSession session=iter.next();
			if(session!=null && session.getAttribute(MvcConstant.USER)!=null){
				userNumber+=1;
			}
		}
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session=arg0.getSession();
		if(session.getAttribute(MvcConstant.USER)!=null){
			sessions.remove(session);
			syncUserNumber();
		}
	} 
	
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static Set<HttpSession> getSessions(){
		return sessions;
	}
	
	public static int getUserNumber(){
		return userNumber;
	}

}





















