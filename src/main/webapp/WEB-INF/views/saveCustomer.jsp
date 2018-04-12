<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="jspf/bootstrap.jsp"%>
</head>
<body>
<%@ include file="jspf/header.jsp"%>
	<%@ include file="jspf/main.jsp"%>

	<div class="container">
		<h4>Zapisz sie na wizyte</h4>

	</div>

	<form:form modelAttribute="customer" class="form-inline" method="post">
		<div>
			<form:label class="control-label col-sm-2" path="firstName"> Imie </form:label>
			<form:input class="form-control" path="firstName" />
		</div>
		
		<div>
			<form:label class="control-label col-sm-2" path="phoneNumber"> Telefon </form:label>
			<form:input  class="form-control" path="phoneNumber" />
		</div>

		<div>
			<form:label class="control-label col-sm-2" path="email"> Email* </form:label>
			<form:input  class="form-control" type="email" path="email" />
		</div>

		<div class="form-inline">
			<input  class="btn btn-default" type="submit" value="Zapisz mnie"/>
		</div>
		
	* - pola niewymagane 
	</form:form>




</body>
</html>