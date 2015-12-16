<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="conversion" class="convert.Conversion">
		<jsp:setProperty name="conversion" property="miles" value="${param.miles}" />
		<jsp:setProperty name="conversion" property="kilometers" value="${param.miles}" />
		Kilometers: <jsp:getProperty name="conversion" property="kilometers" />
	</jsp:useBean>
</body>
</html>