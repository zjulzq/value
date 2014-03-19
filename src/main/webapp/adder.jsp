<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<f:view>
		<h:form>
			<h3>Please enter your name and password.</h3>
			<table>
				<tr>
					<td>Name:</td>
					<td><h:inputText value="#{user.name}" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><h:inputSecret value="#{user.password}" /></td>
				</tr>
			</table>
			<h:commandButton value="Login" action="login" />
		</h:form>
	</f:view>

</body>
</html>
