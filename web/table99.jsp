<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title></title>
    
	

  </head>
  
  <body>
    <c:forEach var="x" begin="1" end="9" step="1">
    <c:forEach var ="y" begin="1" end="${x}" step="1">
    ${y}*${x}=${x*y}
    </c:forEach><br>
    </c:forEach>
  </body>
</html>
