<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<f:view>
	<head>
<title><h:outputText value="#{msgs.title}" /></title>
	</head>
	<body>
		<h:form>
			<table>
				<tr>
					<td><h:outputText value="#{msgs.thankYou}" /></td>
				</tr>
				<tr>
					<td><h:outputFormat value="#{msgs.score}">
							<f:param value="#{quiz.score}" />
						</h:outputFormat></td>
				</tr>
				<tr>
					<td><h:commandButton value="#{msgs.startOverButton}" action="#{quiz.startOverAction}" /></td>
				</tr>
			</table>
		</h:form>
	</body>
</f:view>
</html>
