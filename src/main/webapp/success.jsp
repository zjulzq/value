<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<f:view>
	<head>
<title><h:outputText value="#{msgs.title}" /></title>
	</head>
	<body>
	success
		<h:form>
			<table>
				<tr>
					<td><h:outputText value="#{quiz.question}" /></td>
				</tr>
				<tr>
					<td><h:inputText value="#{quiz.response}" /></td>
				</tr>
				<tr>
					<td><h:commandButton value="#{msgs.answerButton}" action="#{quiz.answerAction}" /></td>
				</tr>
			</table>
		</h:form>
	</body>
</f:view>
</html>
