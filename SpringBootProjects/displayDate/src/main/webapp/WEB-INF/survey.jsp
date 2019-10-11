<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Rubik&display=swap" rel="stylesheet">
  	<link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Display Code</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
            <h1> Submitted Info: </h1>
        <table>
	        <tr>
	        	<td>Name: </td>
	        	<td> <c:out value="${name }"/> </td>
	        </tr>
	        <tr>
	        	<td>Location : </td>
	        	<td> <c:out value="${location }"/> </td>
	        </tr>
	        <tr>
	        	<td>Language: </td>
	        	<td> <c:out value="${language }"/> </td>
	        </tr>
	        <tr>
	        	<td>Comments: </td>
	        	<td> <c:out value="${comments }"/> </td>
	        </tr>
        
        
        </table>
        </div>
    </div>
</body>
</html>