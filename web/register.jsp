<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="demo" uri="http://www.songjuan.com/Test"%>
<html>
<head><title>用户注册</title></head>
<body>
请输入客户信息，带<demo:star/>的域必须填写
<!-- <form action="validateCustomer.do" method="post"> -->
<table>
  <tr><td>客户名</td>
  <td><input type="text" name="custName"><demo:star/></td>
  </tr>
  <tr><td>Email地址</td>
  <td><input type="text" name="email"><demo:star/></td>
  </tr>
  <tr><td>电话</td>
  <td><input type="text" name="phone"><demo:star/></td>
  </tr>   
</table>
<input type='submit' value="提交">

</body>
</html>