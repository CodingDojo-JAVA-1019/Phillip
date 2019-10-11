<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Rubik&display=swap" rel="stylesheet">
  	<link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <title>Books API</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
        	<p class="errors"><c:out value="${error}"/></p>
        	<h1>All Books</h1>
			<table>
			    <thead>
			        <tr>
			            <th>Title</th>
			            <th>Description</th>
			            <th>Language</th>
			            <th>Number of Pages</th>
			            <th>Actions</th>
			        </tr>
			    </thead>
			    <tbody>
			        <c:forEach items="${books}" var="book">
			        <tr>
			            <td><c:out value="${book.title}"/></td>
			            <td><c:out value="${book.description}"/></td>
			            <td><c:out value="${book.language}"/></td>
			            <td><c:out value="${book.numberOfPages}"/></td>
			            <td><a href="/books/show/<c:out value="${book.id}"/>" >View Book</a></td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>
			<a href="/books/new">New Book</a>
        </div>
    </div>
</body>
</html>