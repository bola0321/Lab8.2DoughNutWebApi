<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>${donut.name}</title>
</head>
<body>
	<h1>${donut.name} Doughnut</h1>
	<br>>
	<img src="${donut.photo}" alt="picture of a ${donut.name} doughnut" >
	
	<br>
	${donut.photoAttribution}
	<br>
	Calories: ${donut.calories}
	<br>
	Extras: 
		<ul>
		<c:forEach var= "nuts" items="${donuts}">
			<li>${nuts.extras}</li>
		</c:forEach>	
		</ul>
	<a href= "/">Back to Home Page</a>

</body>
</html>