<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<form action="${pageContext.request.contextPath}/login" method="post">
       <input type="text" name="uName" value="name">&nbsp;
       <input type="text" name="uPwd" value="password">&nbsp;
       <input type="text" name="uBirthDay" value="date">&nbsp;
       <input type="submit" value="提交数据">
    </form>
</body>
</html>