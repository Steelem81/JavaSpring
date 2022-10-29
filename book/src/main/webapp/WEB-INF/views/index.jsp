<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <table>
   	<thead>
   		<th>Title</th>
   		<th>Description</th>
   		<th>Language</th>
   		<th>Num. Pages</th>
   	</thead>
   	<c:forEach var="book" items="${allBooks}">
   		<tr>
   			<td><c:out value="${book.title}"/></td>
   			<td><c:out value="${book.description}"/></td>
   			<td><c:out value="${book.language}"/></td>
   			<td><c:out value="${book.numberOfPages}"/></td>
   		</tr>
   	</c:forEach>
   </table>
</body>
</html>
