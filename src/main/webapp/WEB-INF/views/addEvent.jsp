<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="jspf/head.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>eReservation</title>
</head>
<body>
	<%@ include file="jspf/header.jsp"%>
	<%@ include file="jspf/main.jsp"%>
	<form:form modelAttribute="event" method="post">
		<div>
			<form:label path="startTime">Rozpoczecie</form:label>

		</div>
		
		<div>
			<form:label path="endTime"> Zakonczenie </form:label>
		</div>

		<div>
			<input type="submit" />
		</div>

	</form:form>
	<%@ include file="jspf/footer.jsp"%>
</body>
</html>