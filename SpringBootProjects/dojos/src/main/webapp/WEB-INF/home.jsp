<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<head>
  	<link rel="stylesheet" type="text/css" href="/css/style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Rubik&display=swap" rel="stylesheet">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <title>Relationships</title>
</head>
<body>
    <div class="wrapper">
	    <div class="header">
	        <div class="headerL">
	            <a href="/dojos/new">Create a New Dojo</a>
	            <a href="/ninjas/new">Add a New Ninja</a>
	        </div>
	    </div>
        <div class="main">
        	<h1>All Dojos</h1>
				<table>
	            	<thead>
	            		<tr>
	            			<th>Dojo Name</th>
	            		
	            		</tr>
	            	</thead>
	            	<tbody>
	            		<c:forEach items="${dojos}" var="d">
	            		<tr>
	            			<td><c:out value ="${d.name}"/></td>
	            		</tr>
	            		</c:forEach>
	            	</tbody>	
	            </table>
        </div>
        <div class="sidebar">
	        <table>
	            <thead>
	                <tr>
	                    <th>Ninja Name</th>
	                    <th>Ninja Age</th>
	                    <th>Dojo</th>
	                
	                </tr>
	            </thead>
	            <tbody>
	                <c:forEach items="${ninjas}" var="d">
	                <tr>
	                    <td><c:out value ="${d.firstName}"/> <c:out value ="${d.lastName}"/></td>
	                    <td><c:out value ="${d.age}"/></td>
	                    <td><c:out value ="${d.dojo.name}"/></td>
	                </tr>
	                </c:forEach>
	            </tbody>	
	        </table>
	    </div>
    </div>
</body>
</html>