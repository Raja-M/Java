<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>H2kInfosys Teachers App</title>
</head>
<body>
    <h2> Teacher Data Entry Form</h2>
	<form method = "post" action = teacher">
		<p>
		   Teacher Name: <input type ="text" id ="teacherName" name ="teacherName">
		 </p>
		 <p>
		   Skills:<input type ="text" id ="teacherSkills" name ="teacherSkills">
		</p>
		<p>
		   Years Of Experience:<input type ="text" id ="yrsOfExp" name ="yrsOfExp">
		</p>
		<p>
		   Location:<input type ="text" id ="location" name ="location">
		</p>
		<input type="submit" title="Submit">
	</form>
</body>
</html>