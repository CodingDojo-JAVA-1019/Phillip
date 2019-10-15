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
    
    <title>Create a New Ninja</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
        	<p class="errors"><c:out value="${error}"/></p>
        	<h1>Create a New Ninja</h1>
				<form:form action="/ninjas/create" method ="POST" modelAttribute ="ninja">
					<table>
	                    <tr>
	                    
	                        <td><form:label path="dojo">Select Dojo: </form:label></td>
	                        <td><form:select path="dojo" >
	                        <c:forEach items="${dojo}" var="dojo">
	                        	<form:option value="${dojo.id}">${dojo.name}</form:option>
	                        </c:forEach>
	                        </form:select></td>
	                        <td><form:errors path="dojo"/>
	                        
	                    </tr>
	                    <tr>
	                        <td><form:label path="firstName">First Name: </form:label></td>
	                        <td><form:input path="firstName" /></td>
	                        <td><form:errors path="firstName"/></td>
	                    </tr>
	                    <tr>
	                        <td><form:label path="lastName">Last Name: </form:label></td>
	                        <td><form:input path="lastName" /></td>
	                        <td><form:errors path="lastName"/></td>
	                    </tr>
	                    <tr>
	                        <td><form:label path="age">Age: </form:label></td>
	                        <td><form:input type="number" path="age" /></td>
	                        <td><form:errors path="age"/></td>
	                    </tr>
	                   
	                    <tr>
	                        <td></td>
	                        <td><button type="submit">Add Ninja</button></td>
	                    </tr>
	                </table>
				
				</form:form>
			
        </div>
    </div>
</body>
</html>