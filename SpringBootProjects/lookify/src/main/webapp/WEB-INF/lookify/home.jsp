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
    
    <title>Lookify</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
        	<p class="errors"><c:out value="${error}"/></p>
        	<h1>Welcome to Lookify</h1>
			<br>
			<br>
			<p><a href="/dashboard">Start Looking</a></p>
        </div>
    </div>
</body>
</html>