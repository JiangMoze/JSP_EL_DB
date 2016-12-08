<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="demo" uri="http://www.songjuan.com/Test" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
    
    
    <title>Welcome Tag</title>
    
	
  
  
  <body>
    <h3><demo:welcome /></h3>
    <h3><demo:welcome user="john"/></h3>
    <h3><demo:welcome user="${param.userName}"/></h3>
    <h3><demo:welcome user='<%=request.getParameter("userName") %>'/></h3>
  </body>
</html>
