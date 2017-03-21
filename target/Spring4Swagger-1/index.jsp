<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>

	<pre>
		Employee Id :<input type="text" id="empid"><br>
		Name :<input type="text" id="name"><br>
		Email Id :<input type="email" id="email"><br>
		Skill Set :<input type="text" id="skill"><br>
		Role :<input type="text" id="role"><br>
		Salary :<input type="text" id="salary"><br>
		Address :<textarea id="address"></textarea><br>
		Password :<input type="password" id="password"/><br>
		<!-- <input type="submit" value="click" id="submit">  -->
		<button  value="click" id="submit">click</button>
	</pre>

	<script>
			var search = {};
			
			
			$('#submit').click(function() {
				search["address"]=$('#address').val();
				search["name"] = $('#name').val();
				search["email"] = $('#email').val();
				search["skill"] = $('#skill').val();
				search["role"] =$('#role').val();
				search["salary"] =$('#salary').val();
				search["password"] =$('#password').val();
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "http://localhost:8080/Spring4Swagger/addEmployee",
					data : JSON.stringify(search),
					dataType : 'json',
					timeout : 100000,
					complete: function(data) {
						if(data)
							alert("SUCCESS");
						else
							alert("Fail");
					}
				});

			});
	</script>
</body>
</html>