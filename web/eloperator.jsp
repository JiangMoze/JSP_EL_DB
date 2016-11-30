<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'eloperator.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>Expression Language Example</title>
  </head>
  
  <body>
   <p> JSP Expression Language Example</p>
   <table border="1">
   <thead><td>Expression</td><td>Value</td></thead>
   <tr><td>\${2+5}</td><td>${2+5}</td></tr>
   <tr><td>\${4/5}</td><td>${4/5}</td></tr>
  <!-- <tr><td>\${5div6}</td><td>${5 div 6}</td></tr> -->
   <tr><td>\${5mod7}</td><td>${5 mod 7}</td></tr>
   <tr><td>\${2<3}</td><td>${2 < 3}</td></tr>
   <tr><td>\${2gt3}</td><td>${2 gt 3}</td></tr>
   <tr><td>\${3.1 le 3.2}</td><td>${3.1 le 3.2}</td></tr>
   <tr><td>\${(5>3)?5:3}</td><td>${(5>3)?5:3}</td></tr>
   <tr><td>\${empty null}</td><td>${empty null}</td></tr>
   <tr><td>\${empty param}</td><td>${empty param}</td></tr>
  
   </table>
  </body>
</html>
