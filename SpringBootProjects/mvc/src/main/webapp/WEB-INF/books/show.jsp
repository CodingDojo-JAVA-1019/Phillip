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
        	<h1><c:out value="${book.title}"/></h1>
			<p>Description: <c:out value="${book.description}"/></p>
			<p>Language: <c:out value="${book.language}"/></p>
			<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
			<a href="/books/${book.id}/edit">Edit Book</a>
			<form action="/books/${book.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input type="submit" value="Delete">
			</form>
		</div>
    </div>
</body>
</html>