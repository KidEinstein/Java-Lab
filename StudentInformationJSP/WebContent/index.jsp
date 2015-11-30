<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="AddStudent">
		Name<input type="text" name="name" />
		USN<input type="text" name="usn" />
		Branch<input type="text" name="branch" />
		Exam
		<select name="exam">
			<option value="cet">CET</option>
			<option value="comedk">COMEDK</option>
		</select>
		<input type="submit" />
	</form>
</body>
</html>