<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees Management</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h3 class="text-center">Employee Management</h3>
			<hr />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Employee List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>Id</th>
							<th>Name</th>
						</tr>
							<tr>
								<td>${employee.empId}</td>
								<td>${employee.empName}</td>
							</tr>
					</table>
				</div>
			</div>
		</div>

	</div>
</body>
</html>