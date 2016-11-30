<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/11/20
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input a Customer</title>
</head>
<body>
<font color="red"><%=request.getAttribute("result")%></font>
<p>请输入一条客户记录</p>
<form action="addCustomer.do" method="post">
    <table>
        <tr><td>客户号：</td><td><input type="text" name="cust_id"></td></tr>
        <tr><td>客户名：</td><td><input type="text" name="cname"></td></tr>
        <tr><td>Email：</td><td><input type="text" name="email"></td></tr>
        <tr><td>余额：</td><td><input type="text" name="balance"></td></tr>
        <tr><td><input type="submit" name="submit" value="确定"></td>
            <td><input type="reset" name="reset" value="重置"></td>
        </tr>
    </table>


</form>
</body>
</html>
