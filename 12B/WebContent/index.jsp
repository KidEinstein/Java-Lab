<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Greeter</title>
</head>
<body>
	<form method="get" action="Greet">
		Name
		<input type="text" name="name" />
		<br />
		Gender
		<select>
			<option value="male">Male</option>
			<option value="female">Female</option>
		</select>
		<br />
		Age
		<input type="number" name="age" />
		<input type="submit" />
	</form>
</body>
</html>