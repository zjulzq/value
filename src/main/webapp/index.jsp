<%@ taglib uri="/myTLD" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<h2>Hello World!</h2>
	<jsp:useBean id="theBean" class="zju.lzq.learn.AdderBean" />
	<jsp:setProperty name="theBean" property="memory" value="169" />
	The value of memory is
	<jsp:getProperty name="theBean" property="memory" />

	<c:myTag />
	


</body>
</html>
