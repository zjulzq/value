<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add department</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/department/add.do" id="addDepartmentForm">
		<table>
			<tr>
				<td>部门编码</td>
				<td><input name="deptCode" type="text" /></td>
				<td></td>
			</tr>
			<tr>
				<td>部门名称</td>
				<td><input name="deptName" type="text" /></td>
				<td></td>
			</tr>
			<tr>
				<td>部门经理</td>
				<td><input name="manager" type="text" /></td>
				<td>请填入员工号</td>
			</tr>
			<tr>
				<td>部门副经理</td>
				<td><input name="viceManager" type="text" /></td>
				<td>请填入员工号</td>
			</tr>
			<tr>
				<td></td>
				<td><input id="submit" type="submit" value="新建" /></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>