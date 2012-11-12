<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Address List</title>
</head>
<body>
	<c:forEach items="${addresses}" var="address">
		<c:out value="${address.province}"></c:out>
		<c:out value="${address.city}"></c:out>
		<c:out value="${address.district}"></c:out>
		<br />
	</c:forEach>
</body>
</html>