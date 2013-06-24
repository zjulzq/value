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

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<button type="button" class="btn btn-navbar" data-toggle=".nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="brand" href="#">Value System</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">Logged in as <a href="#" class="narbar-link">UserName</a></p>
					<ul class="nav">
						<li class="active">
							<a href="#">Home</a>
						</li>
						<li>
							<a href="#about">About</a>
						</li>
						<li>
							<a href="#contact">Contact</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		
	</div>

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