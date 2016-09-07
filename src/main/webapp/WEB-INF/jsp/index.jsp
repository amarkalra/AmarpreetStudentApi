<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Studen API</title>
</head>
<body>

	<p>Sample Student Api can be used to do following Follow the steps
		in following order<br>
		a) Upload Student Data - URL (http://localhost:8080/UploadCSV)
		<br>
		 b) Search a Student - URL (http://localhost:8080/student/getStudent/id/{id})
		 <br>
		 	where {id} is a parameter. Sample http://localhost:8080/student/getStudent/id/1
		 <br>
		H2 Database console can be accessed using link http://localhost:8080/console JDBC
		URI is "jdbc:h2:mem:AZ"</p>
</body>
</html>
