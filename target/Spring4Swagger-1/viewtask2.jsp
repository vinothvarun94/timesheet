<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>View TAsk</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="resources/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="resources/files/vtask/styles.css" type="text/css" rel="stylesheet"/>
	
	
    <script src="resources/resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
   
<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Task</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
	
	
	<style>
	
	body {
  margin:0px;
  background-color:rgba(51, 51, 51, 1);
  background-image:none;
  position:static;
  left:auto;
  width:798px;
  margin-left:0;
  margin-right:0;
  text-align:left;
}

#collect{
margin-top:300px;
margin-left:100px;

}	
	#table{
margin-top:600px;
margin-left:100px;

}	
	table
{
    border-collapse: collapse;
    width: 100%;
	
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}

td,tr,th
{
padding-left:80px;
padding-right:60px;
}

	</style>
</head>
<body>

<div id="u0" class="ax_default image" data-label="Image">
        <img id="u0_img" class="img " src="resources/images/vtask/image_u0.png"/>
        <!-- Unnamed () -->
        <div id="u1" class="text" style="display:none; visibility: hidden">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;"></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u2" class="ax_default heading_1">
        <img id="u2_img" class="img " src="resources/images/vtask/u2.png"/>
        <!-- Unnamed () -->
        <div id="u3" class="text">
          <p style="font-size:36px;"><span style="color:#FFFFFF;">Kumaran Systems</span></p><p style="font-size:18px;"><span style="color:#00FFFF;">&nbsp; Engage</span><span style="color:#FFFFFF;">&nbsp; &nbsp; &nbsp; &nbsp; </span><span style="color:#00FF66;">Emerge</span><span style="color:#FFFFFF;">&nbsp; &nbsp; &nbsp;&nbsp; </span><span style="color:#FF9933;">Excel</span></p>
        </div>
      </div>
   
	<center>
	<input type="text" id="sid" value="<%=session.getAttribute("id")%>">
	

		<div id="table"  style="color: white; font-size: 50px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View Assigned Task</div>
		

		<script type="text/javascript">
		
		
	
		
	$(document).ready(function() 
				{
		    var id=$('#sid').val();
		    alert(id);
					
					/* var i=0;
					var date = $(this).val();
					
					//alert(date); */
					$.ajax({
							type : "GET",
							contentType : "application/xml",
							url : "http://localhost:8080/Spring4Swagger/viewtask",
							dataType : 'json',
							success : function(response) {
							//alert(JSON.stringify(response));
							/* var json = "<h4>Ajax Response</h4><pre>"
							+ JSON.stringify(response, null, 4) + "</pre>"; */
							var obj = $.parseJSON(JSON.stringify(response));
							
							
							for ( var key in obj) {
							var obj1 = obj[key];

							for ( var key1 in obj1) {
							var obj2 = obj1[key1];
							var table = document.getElementById("table1");
						    var tr = table.insertRow();
							for ( var key2 in obj2) 
							{
							var td = tr.insertCell();
						    td.innerHTML= JSON.stringify(obj2[key2]).replace('"',' ').replace('"',' ');
						}
					}
				}
			}
		});

							});
		</script>
		<table class="table table-hover table-bordered" id="table1">
			<thead style="background-color: #bce8f1;">
				<tr>
					<th>Department</th>
					<th>Description</th>
				    <th>Employee Id</th>
					<th>Duration</th>
					<th>Project Name</th>
					<th>Taskname</th>
					
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