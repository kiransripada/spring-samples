<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Employee	</title>
</head>
<body>
<%-- <div id="addItem">
		<form action="addNewEmployee.do" method="post">
			<label>Enter Employee Id</label><input type="text" name="empId" /><br>
			<label>Enter Employee Name</label><input type="text" name="name" /><br>
			<label>Enter Employee Designation</label>
			<input type="text"
				name="designation" /><br>
				 <label>Enter Employee Salary</label>
				<input type="text" name="salary" /><br> <input type="submit"value="Add" />
		</form>
	</div> --%>
	
	<div id="addEmployee">
		<form:form action="addNewEmployee.do" method="post" commandName="emp">
			<p>
				<label>Enter Employee Id<fmt:message key="emp.empId" /></label>
				<form:input path="empId" />
			</p>
			<p>
				<label>Enter Name<fmt:message key="emp.name" /></label>
				<form:input path="name" />
			</p>
			<p>
				<label>Enter Type<fmt:message key="emp.designation" /></label>
				<form:input path="designation" />
			</p>
			<p>
				<label>Enter Price<fmt:message key="emp.salary" /></label>
				<form:input path="salary" />
			</p>
			<input type="submit" value="Add New Employee" />
		</form:form>
	</div>

</body>
</html>