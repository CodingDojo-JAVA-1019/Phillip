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
    
    <title>Create a New Dojo</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
        	<p class="errors"><c:out value="${error}"/></p>
        	<h1>Add A New Dojo</h1>
				<form:form action="/dojos/create" method ="POST" modelAttribute ="dojo">
					<table>
	                    <tr>
	                    
	                        <td><form:label path="name">Name: </form:label></td>
	                        <td><form:input path="name" /></td>
	                        <td><form:errors path="name"/>
	                        
	                    </tr>
	                  
	                    <tr>
	                        <td></td>
	                        <td><button type="submit">Add Dojo</button></td>
	                    </tr>
	                </table>
				
				</form:form>
			
        </div>
    </div>
</body>
</html>