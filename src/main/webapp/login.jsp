<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Please Login</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/login.do">
		<table>
			<tr>
				<td>User name</td>
				<td><input name="userName" type="text" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input id="submit" type="submit" value="Log in"></td>
			</tr>
		</table>
	</form>
</body>
</html>