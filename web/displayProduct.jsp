<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="product" type="DB.Product" scope="session"></jsp:useBean>
<html>
<head><title>商品信息</title></head>
<body>
<table border="0">
<tr><td>商品号：</td>
	<td><jsp:getProperty property="prod_id" name="product"/></td>
</tr>
<tr><td>商品名：</td>
<td><jsp:getProperty property="pname" name="product"/></td>
</tr>
<tr><td>价格：</td>
<td><jsp:getProperty property="price" name="product"/></td>
</tr>
<tr><td>库存量：</td>
<td><jsp:getProperty property="stock" name="product"/></td>
</tr>
</table>

</body>

</html>