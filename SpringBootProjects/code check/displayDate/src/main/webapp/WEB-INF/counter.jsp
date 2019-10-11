<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Rubik&display=swap" rel="stylesheet">
  	<link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Display Time</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
            <h2 id="date"> You have visited <a>LocalHost</a> <c:out value="${count}"/> times. </h2>
            <br>
            <br>
            <a href="/count_increase" >Test another visit?</a> |  <a href="/reset_count">Reset Count</a>
            
        </div>
    </div>
</body>
</html>