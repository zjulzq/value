<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<head>Add 2 numbers
</head>
<body>

	<f:view>
		<h:form id="addForm">

			<br />First Number:
		<h:inputText id="firstNumber" value="numberBean.firstNumber" />
			<br />Second Number:
		<h:inputText id="secondNumber" value="numberBean.secondNumber" />
			<br />
			<h:outputText id="output" value="#{numberBean.result}" />
			<br />
			<h:commandButton id="submitButton" value="Add">
				<f:actionListener type="zju.lzq.learn.MyActionListener" />
			</h:commandButton>
		</h:form>
	</f:view>

</body>
</html>
