<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<f:view>
		<h:form>
			<h3>
				Welcome to JavaServer Faces,
				<h:outputText value="#{user.name}" />
				<span>!</span>
			</h3>
		</h:form>
	</f:view>
</body>
</html>
