<%@page contentType = "text/html;charset = UTF-8" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*,javax.sql.*"%>
<%@ page import="DB.DruidDB" %>
<%
	DataSource dataSource = (DataSource)application.getAttribute("dataSource");
	Connection conn = DruidDB.getConnection();
	Statement stmt = conn.createStatement();
	ResultSet rst = stmt.executeQuery(
		"SELECT * FROM products WHERE prod_id>'P2'");
%>
<html><head><title>Listener Demo</title></head>
<body>
<h4>商品表中信息</h4>
<table border = "1">
<tr><td>商品号</td><td>商品名</td><td>价格</td><td>库存</td></tr>
<% while (rst.next()){ %>
<tr><td><%=rst.getString(1)%></td>
	<td><%=rst.getString(2)%></td>
	<td><%=rst.getString(3)%></td>
	<td><%=rst.getString(4)%></td>
	</tr>
<%} %>
</table>
</body>
</html>