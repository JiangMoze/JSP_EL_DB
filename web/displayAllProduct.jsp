<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@ page import="DB.Product" %>
<html>
<head><title>显示所有商品</title></head>
<body>
<table border="1">
<tr><td>商品号</td><td>商品名</td><td>价格</td><td>数量</td></tr>
<%ArrayList<Product> productList=(ArrayList<Product>)session.getAttribute("productList");
for(Product product:productList){
%>
<tr><td><%=product.getProd_id() %></td>
<td><%=product.getPname() %></td>
<td><%=product.getPrice() %></td>
<td><%=product.getStock() %></td>
</tr>
<%
}
 %>

</table>

</body>

</html>