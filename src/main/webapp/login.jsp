<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html>
<style type="text/css">
<!--
body {
	background-image: url(jsp/img/denglubeijing.jpg);
}
-->
</style>
	<body>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
<center>
			<font color="red">
				<s:actionerror/>
				<s:fielderror/>
			</font>
			<s:form action="login" method="post">
				<table background="img/denglukuang.jpg" width="344" height="300">
                	<tr>
                	<td></td></tr>
			  		<tr>
			  			<td><s:text name="username"/>
						<td><s:textfield name="user.name"/></td>
					</tr>
					<tr>
						<td><s:text name="password"/></td>
						<td><s:password name="user.passWd"/></td>
					</tr>	
		            <tr>
						<td>&nbsp;</td>
						<td>
							<s:submit value="%{getText('login')}" />
							<s:reset value="%{getText('reset')}" />
						</td>
					</tr>	
				</table>
  </s:form>

		</center>
	</body>
</html>
