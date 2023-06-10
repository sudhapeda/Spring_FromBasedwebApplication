<%@ taglib prefix ="form" uri="http://www.spingframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration From</title>
</head>
<body>

	<form action="processFrom" modelAttribute = "employeeModel">
	
	First Name : <form:input path="firstName"/>
	<br>
	<br>
	Last Name : <form:input path="lastNmae"/>
	<br>
	<br>
	Department : 
		HR <form:radiobutton path = "department" value = "HR"/>
		ADMIN <form:radiobutton path = "department" value = "ADMIN"/>
		IT <form:radiobutton path = "department" value = "IT"/>
	<br>
	Technologies :
		Excel<form:checkbox path = "technologies" value = "Excel"/>	
		Java<form:checkbox path = "technologies" value = "Java"/>
		RDBMS<form:checkbox path = "technologies" value = "RDBMS"/>
		PYTHON<form:checkbox path = "technologies" value = "PYTHON"/>
		<br>
		<br>
		<br>
	<input type="submit" value = "submit">
	</form>
	

</body>
</html>