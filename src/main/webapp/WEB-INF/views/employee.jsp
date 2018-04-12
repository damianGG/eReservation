<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>eReservation</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="http://localhost:8080/eReservation/">Home</a></li>
					<li><a href="#">About projects</a></li>
					<li><a
						href="${pageContext.servletContext.contextPath}/customers/add">Customers</a></li>
					<li><a
						href="${pageContext.servletContext.contextPath}/employee/">Employees</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a
						href="${pageContext.servletContext.contextPath}/user/logout"><span
							class="glyphicon glyphicon-log-in"></span> Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<p>
					<a href="${pageContext.servletContext.contextPath}/employee/add">Add
						new employee</a>
				</p>
				<p>
					<a href="${pageContext.servletContext.contextPath}/employee/list">List
						of employees</a>
				</p>
				<p>
					<a href="${pageContext.servletContext.contextPath}/employee/edit">Edit employee</a>
				</p>
			</div>
			<div class="col-sm-8 text-left">
				<h1>Employy</h1>
				<p>Employees</p>
				<hr>
				<h3>Test</h3>
				<p>Lorem ipsum...</p>
			</div>
			<div class="col-sm-2 sidenav">
				<p>Employees</p>
				<div class="well">
					<img
						src="http://www.anlaya.pl/wp-content/uploads/2015/05/fryzjer-damski.jpg"
						style="width: 100px; height: 70px;">
				</div>
				<div class="well">
					<img
						src="http://r.dcs.redcdn.pl/scale/o2/tvn/web-content/m/p89/i/3c1e4bd67169b8153e0047536c9f541e/ec9171d8-7e96-4238-a7db-9d8aa6e6a1b8.jpg?type=1&quality=100&srcmode=0&srcx=1/1&srcy=3/20&srcw=1/1&srch=17/20&dstw=640&dsth=360"
						style="width: 100px; height: 70px;">
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>copyright Damian</p>
	</footer>

</body>
</html>