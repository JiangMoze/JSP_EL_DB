<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>访问Javabean属性</title>
</head>
<body>
	<h4>使用EL访问Javabean属性</h4>
	<ul>
		<li>员工名:${employee.empName}
		<li>Email地址:${employee.email}
		<li>电话:${employee.phone}
		<li>客户信息:
			<ul>
				<li>城市:${employee.address.city}
				<li>频道:${employee.address.street}
				<li>邮编:${employee.address.zipCode}
			</ul>
	</ul>




</body>



</html>
