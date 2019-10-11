<%@ page isErrorPage="true" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
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
        	<h1>Edit Book</h1>
			<form:form action="/books/${book.id}" method="post" modelAttribute="book">
			    <input type="hidden" name="_method" value="put">
			    <p>
			        <form:label path="title">Title</form:label>
			        <form:errors path="title"/>
			        <form:input path="title"/>
			    </p>
			    <p>
			        <form:label path="description">Description</form:label>
			        <form:errors path="description"/>
			        <form:textarea path="description"/>
			    </p>
			    <p>
			        <form:label path="language">Language</form:label>
			        <form:errors path="language"/>
			        <form:input path="language"/>
			    </p>
			    <p>
			        <form:label path="numberOfPages">Pages</form:label>
			        <form:errors path="numberOfPages"/>     
			        <form:input type="number" path="numberOfPages"/>
			    </p>    
			    <input type="submit" value="Submit"/>
			</form:form>
        
        </div>
    </div>
</body>
</html>