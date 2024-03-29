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
    
    <title>Programming Languages</title>
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
			        <c:forEach items="${languages}" var="lang">
			        <tr>
			            <td><a href="/languages/show/<c:out value="${lang.id}"/>" ><c:out value="${lang.name}"/></a></td>
			            <td><c:out value="${lang.creator}"/></td>
			            <td><c:out value="${lang.version}"/></td>
			            
			            <td><a href="/languages/edit/<c:out value="${lang.id}"/>" >Edit</a> | <a href="/languages/delete/<c:out value="${lang.id}"/>" >Delete</a></td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>
			<form:form action="/language" method="POST" modelAttribute="language">
			    <p>
			        <form:label path="name">Name</form:label>
			        <form:errors path="name"/>
			        <form:input path="name"/>
			    </p>
			    <p>
			        <form:label path="creator">Creator</form:label>
			        <form:errors path="creator"/>
			        <form:input path="creator"/>
			    </p>
			    <p>
			        <form:label path="version">Version</form:label>
			        <form:errors path="version"/>
			        <form:input path="version"/>
			    </p>
			      
			    <button type="submit">Submit</button>
			</form:form>
		
        </div>
    </div>
</body>
</html>