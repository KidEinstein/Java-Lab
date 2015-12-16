<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="faculty_info" class="faculty.FacultyInfo">
		<jsp:setProperty name="faculty_info" property="name" value="${param.name}" />
		<jsp:setProperty name="faculty_info" property="age" value="${Integer.parseInt(param.age)}" />
		 Name <jsp:getProperty name="faculty_info" property="name" />
		 Age <jsp:getProperty name="faculty_info" property="age" />
	</jsp:useBean>
</body>
</html>