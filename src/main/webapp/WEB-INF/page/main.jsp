<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="full-screen">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Value System</title>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.min.css" />
<script type="text/javascript" src="js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body class="full-screen">

	<header>
		<jsp:include page="header.jsp"></jsp:include>
	</header>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span2">
				<jsp:include page="side.jsp"></jsp:include>
			</div>
			<div class="span10">
				<jsp:include page="board.jsp"></jsp:include>
			</div>
		</div>
	</div>

	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>


</body>
</html>