<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/arrays">
		爱好： <br> 
		唱歌<input type="checkbox" name="ids" value="1"> <br>
		跳舞<input type="checkbox" name="ids" value="2"> <br> 
		打球<input type="checkbox" name="ids" value="3"> <br> 
		弹琴<input type="checkbox" name="ids" value="4"> <br> 
		<input type="submit" value="提交数据">
	</form>
</body>
</html>