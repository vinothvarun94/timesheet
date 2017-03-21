<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Being Java Guys | User Details</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Being Java Guys | User
			Details</div>
		<form id="collect">
			Date : <input type="date" id="date" name="date" />
		</form>

		<script type="text/javascript">
			$(document).ready(function()
					{
					$('#date').change(function() 
							{
								alert();
								var i=0;
								var date = $(this).val();
								//alert(date);
						$.ajax({
									type : "GET",
									contentType : "application/xml",
									url : "http://localhost:8080/TaskUpdationWithSpringAndSwagger/getStatus/"
											+ date,
									dataType : 'json',
									success : function(
											response) {
										alert(JSON
												.stringify(response));
										/* var json = "<h4>Ajax Response</h4><pre>"
											+ JSON.stringify(response, null, 4) + "</pre>"; */
										var obj = $
												.parseJSON(JSON
														.stringify(response));

										for ( var key in obj) {
											var obj1 = obj[key];

											for ( var key1 in obj1) {
												var obj2 = obj1[key1];
												 var table = document.getElementById("table1");
												    var tr = table.insertRow();
												for ( var key2 in obj2) {
													var td = tr.insertCell();
												    td.innerHTML= JSON.stringify(obj2[key2]);
												}
											}
										}
									}
								});
						});
					});
		</script>
		<table class="table table-hover table-bordered" id="table1">
			<thead style="background-color: #bce8f1;">
				<tr>
					<th>Project</th>
					<th>Work Product</th>
					<th>Task Description</th>
					<th>Assign hours</th>
					<th>Actual hours</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
		</table>
		



		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



	</center>
</body>
</html>