<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title></title>
    
	
  </head>
  
  <body>
   <table>
   <tr>
   <td>课程</td>
   <td>票数</td>
   <td>占比</td>
   </tr>
   <tr>
   <td>
   <span>JAVA</span>
   </td>
    <td>
  <%=request.getAttribute("c0") %>
   </td>
    <td> ${c0/(c1+c2+c0)*100}%
   </td>
   
   
   </tr>
   
    <tr>
   <td>
   <span>C++</span>
   </td>
    <td><%=request.getAttribute("c1") %>
   </td>
    <td>
    ${c1/(c1+c2+c0)*100}%
   </td>
   
   
   </tr>
   
    <tr>
    
   <td>
   <span>C#</span>
   </td>
   <td><%=request.getAttribute("c2") %>
   </td>
    <td>${c2/(c1+c2+c0)*100}%
   </td>
   
   
   </tr>
   
   
   
   </table>
  </body>
</html>
