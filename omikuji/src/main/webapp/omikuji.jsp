<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="wrapper">
<h1>Here's Your Omikuji</h1>
	<div class="container omikuji-container">
		<p>In 
		<span><c:out value="${luckyNumber}"/></span> you will live in 
		<span><c:out value="${city }"/></span> with 
		<span><c:out value="${person}"/></span> as your roommate,
		<span><c:out value="${hobby}"/></span> for a living. THe next time you see a
		<span><c:out value="${type}"></c:out></span>, you will have good luck. Also, 
		<span><c:out value="${somethingNice }"/></span>
		</p>
	</div>
	<a href="/omikuji">Go Back</a>
</div>

</body>
</html>