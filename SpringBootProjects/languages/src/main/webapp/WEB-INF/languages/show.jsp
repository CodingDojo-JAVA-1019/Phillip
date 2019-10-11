<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<head>
  	<link rel="stylesheet" type="text/css" href="css/style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Rubik&display=swap" rel="stylesheet">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <title>Language Display for <c:out value="${language.name}"/></title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
        	<p class="errors"><c:out value="${error}"/></p>
        	<h1>All Languages</h1>
			<table>
			    <thead>
			        <tr>
			            <th>Name</th>
			            <th>Creator</th>
			            <th>Version</th>
			            <th>Actions</th>
			        </tr>
			    </thead>
			    <tbody>
			        
			        <tr>
			            <td><c:out value="${language.name}"/></td>
			            <td><c:out value="${language.creator}"/></td>
			            <td><c:out value="${language.version}"/></td>
			            
			            <td><a href="/languages/edit/<c:out value="${language.id}"/>" >Edit</a> | <a href="/languages/delete/<c:out value="${language.id}"/>" >Delete</a></td>
			        </tr>
			       
			    </tbody>
			</table>
			
        </div>
    </div>
</body>
</html>