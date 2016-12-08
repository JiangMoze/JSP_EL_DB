<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="Product" uri="http://www.songjuan.com/Test"%>
<html>
<head>
<title>显示所有商品信息</title>
</head>
<body>
<p>显示所有商品信息</p>
<table border = "1">
  <tr><td>商品号</td> <td>商品名</td> <td>价格</td> <td>库存量</td> </tr>
<Product:showProduct productList="${prodList}">
	<tr><td>${product.Prod_id}</td>
		<td>${product.Pname}</td>
		<td>${product.Price}</td>
		<td>${product.Stock}</td>
	</tr>+

</Product:showProduct>
</table>
</body>
</html>