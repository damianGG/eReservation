<?xml version="1.0" encoding="UTF-8" ?>
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <p class='main-menu'>
	<c:choose>
		<c:when test="${sessionScope.loggedInUser == null}">
			<a href="${pageContext.servletContext.contextPath}/user/register">Register</a>
		</c:when>
		<c:otherwise>
			<p>
				Dolaczyles jako: ${loggedInUser.username}</br> <a href="${pageContext.servletContext.contextPath}/user/logout">Logout</a>
				</br>
		</p>
		</c:otherwise>
	</c:choose>
 </p> 