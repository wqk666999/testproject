<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
welcome!!!!!!!!!!!!!!!!!!11yeah!你好

学生的学号是：${requestScope.stu23.id}<br/>
姓名是：${requestScope.stu23.name}<br/>
年龄是${requestScope.stu23.age}
</body>
</html>