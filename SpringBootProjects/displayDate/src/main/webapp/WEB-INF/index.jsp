<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Rubik&display=swap" rel="stylesheet">
  	<link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <title>Code Check</title>
</head>
<body>
    <div class="wrapper">
        <div class="main">
        	<p class="errors"><c:out value="${error}"/></p>
            <h1>Please Take the Ninja Survey</h1>
            <br>
			<form action="/survey" method="post">
		        <table>
		            <tr>
		                <td>Your Name: </td>
		                <td><input type="text" name="name"></td>
		            </tr>
		            <tr>
		                <td>Dojo Location: </td>
		                <td><input type="text" name="location"></td>
		            </tr>
		            <tr>
		                <td>Dojo Location: </td>
		                <td><select name="language">
		                    <option value="Python">Python</option>
		                    <option value="Java">Java</option>
		                    <option value="PHP">PHP</option>
		                    <option value="Ruby">Ruby</option>
		                </select></td>
		            </tr>
		        </table>
		        <textarea name="comments" >Comments:  (optional)</textarea>
		        <button type="submit">Submit Your Answers</button>
		    </form>
        </div>
    </div>
</body>
</html>