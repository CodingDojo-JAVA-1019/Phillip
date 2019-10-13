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
    
    <title>Lookify - Add a New Song</title>
</head>
<body>
    <div class="wrapper">
        <div class="header">
            <div class="headerL">
                
            </div>
            <div class="headerR">
                <a href="/dashboard">Dashboard</a>
            </div>
        </div>
        <div class="main">
            <form action="/" method="post">
                <table>
                    <tr>
                        <td>Song Title:</td>
                        <td><input type="text" name="title"></td>
                    </tr>
                    <tr>
                        <td>Performing Artist:</td>
                        <td><input type="text" name="artist"></td>
                    </tr>
                    <tr>
                        <td>Rating:</td>
                        <td><input type="number" name="rating"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><button type="submit">Add Song</button></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
            		