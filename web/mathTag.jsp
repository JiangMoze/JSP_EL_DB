<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="demo" uri="http://www.songjuan.com/Test" %>

<html>
  <head><title>动态属性</title> </head>
  
  <body>
   <p>动态属性的使用</p>
   		<table border="1">
   		  <demo:mathTag num="6" pow="2" min="4" max="8"/>
   		  <demo:mathTag num="${5*2}" pow="2"/></table>
  </body>
</html>
