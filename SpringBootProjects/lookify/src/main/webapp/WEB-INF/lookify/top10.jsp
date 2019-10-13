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
    
    <title>Top 10 Songs by Rating</title>
</head>
<body>
    <div class="wrapper">
        <div class="header">
            <div class="headerL">
                <a href="/song/new">Add New</a>
                <a href="/dashboard">Back to Dashboard</a>
            </div>
            <div class="headerR">
                <form action="/search" method="get">
                    <table>
                        <tr>
                            <td><input type="text" name="artist" placeholder="Search by Artist">
                            </td>
                            <td><button type="submit">Search By Artist</button></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
            
         <h3>Top 10 Songs By Rating</h1>
         <table>
         
         	<thead>
         		<tr>
         			<th>Song Title</th>
         			<th>Rating</th>
         			<th>Actions</th>
         		</tr>
         	</thead>
         	<tbody>
         		<c:forEach items="${songs}" var="song">
         		<tr>
         			<td><c:out value ="${song.title}"/></td>
         			<td><c:out value ="${song.artist}"/></td>
         			<td><c:out value ="${song.rating}"/></td>
         			<td><a href="/song/show/<c:out value="${song.id}"/>" >View Details</a> | <a href="/song/delete/<c:out value="${song.id}"/>" >Delete Song</a></td>
         		</tr>
         		</c:forEach>
         	</tbody>	
         </table>
            
    </div>
</body>
</html>
            		