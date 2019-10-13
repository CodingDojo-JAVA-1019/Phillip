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
    
    <title>Song:  <c:out value ="${song.title}"/> </title>
</head>
<body>
    <div class="wrapper">
        <div class="header">
            <div class="headerL">
                <a href="/song/new">Add New</a>
                <a href="/song/topten">Top Songs</a>
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
            
         <h3>Song Details for: <c:out value ="${song.title}"/></h3>
         <p><span>Song Title: </span> <c:out value ="${song.title}"/> </p>
         <p><span>Performing Artist: </span> <c:out value ="${song.artist}"/> </p>
         <p><span>Song Rating: </span> <c:out value ="${song.rating}"/> </p>
         <p><a href="/song/delete/<c:out value="${song.id}"/>" >Delete Song</a></p>
    </div>
</body>
</html>
            		