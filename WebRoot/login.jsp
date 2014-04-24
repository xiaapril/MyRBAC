<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
    <title>RBAC登陆页面</title>
  </head>
  
  <body>
  
  	<s:form action="login">
  		  <div>
  			<h1>RBAC系统</h1>   			
  			<s:textfield name="username" label="用户名"/>
  			<s:password name="password"  label="密码"/>
  			<s:submit value="登录"></s:submit>
  			<font color="red">${errormsg}</font>
  		  </div>	
  	</s:form>

  </body>
</html>
