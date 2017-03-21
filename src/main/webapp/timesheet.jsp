<!DOCTYPE html>
<html>
  <head>
    <title>TimeSheet</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="resources/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="resources/files/timesheet/styles.css" type="text/css" rel="stylesheet"/>
    <script src="resources/resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/resources/scripts/prototypePre.js"></script>
    <script src="resources/data/document.js"></script>
    <script src="resources/resources/scripts/prototypePost.js"></script>
    <script src="resources/files/timesheet/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
    <div id="base" class="">

      <!-- Header 1 (Rectangle) -->
      <div id="u0" class="ax_default paragraph1" data-label="Header 1">
        <div id="u0_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u1" class="text">
          <p style="font-size:28px;"><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Time Sheet Management</span></p><p style="font-size:28px;"><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span style="font-family:'Arial Bold', 'Arial';font-weight:700;font-size:18px;">(<%=session.getAttribute("role") %>)</span></p>
        </div>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u2" class="ax_default icon">
        <img id="u2_img" class="img " src="resources/images/timesheet/u2.png"/>
        <!-- Unnamed () -->
        <div id="u3" class="text" style="display:none; visibility: hidden">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;"></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u4" class="ax_default label">
        <div id="u4_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u5" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;color:#FFFFFF;">Welcome </span><span style="font-family:'Arial Bold', 'Arial';font-weight:700;color:#00FFFF;"><%=session.getAttribute("name") %></span><span style="font-family:'Arial Bold', 'Arial';font-weight:700;color:#FFFFFF;">,</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u6" class="ax_default label">
        <img id="u6_img" class="img " src="resources/images/timesheet/u6.png"/>
        <!-- Unnamed () -->
        <div id="u7" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Project Name:</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u8" class="ax_default label">
        <img id="u8_img" class="img " src="resources/images/timesheet/u8.png"/>
        <!-- Unnamed () -->
        <div id="u9" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Task Name:</span></p>
        </div>
      </div>

      <!-- date (Text Field) -->
      <div id="u10" class="ax_default text_field1">
        <input id="date" type="date" value="" required/>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u11" class="ax_default label">
        <img id="u11_img" class="img " src="resources/images/timesheet/u11.png"/>
        <!-- Unnamed () -->
        <div id="u12" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Date:</span></p>
        </div>
      </div>

      <!-- description (Text Field) -->
      <div id="u13" class="ax_default text_field1">
        <input id="description" type="text" value="" required/>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u14" class="ax_default label">
        <img id="u14_img" class="img " src="resources/images/timesheet/u14.png"/>
        <!-- Unnamed () -->
        <div id="u15" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Description:</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u16" class="ax_default label">
        <img id="u16_img" class="img " src="resources/images/timesheet/u16.png"/>
        <!-- Unnamed () -->
        <div id="u17" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Start Time:</span></p>
        </div>
      </div>

      <!-- stime (Text Field) -->
      <div id="u18" class="ax_default text_field1">
        <input id="stime" type="time" value="" required/>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u19" class="ax_default label">
        <img id="u19_img" class="img " src="resources/images/timesheet/u16.png"/>
        <!-- Unnamed () -->
        <div id="u20" class="text">
          <p><span>End Time:</span></p>
        </div>
      </div>

      <!-- etime (Text Field) -->
      <div id="u21" class="ax_default text_field1">
        <input id="etime" type="time" value="" required required/>
      </div>

      <!-- status (Text Field) -->
      <div id="u22" class="ax_default text_field1">
        <input id="status" type="text" value="" required/>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u23" class="ax_default label">
        <img id="u23_img" class="img " src="resources/images/timesheet/u16.png"/>
        <!-- Unnamed () -->
        <div id="u24" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">&nbsp;&nbsp; &nbsp;&nbsp; Status:</span></p>
        </div>
      </div>

      <!-- Header 1 (Rectangle) -->
      <div id="u25" class="ax_default paragraph1" data-label="Header 1">
        <img id="u25_img" class="img " src="resources/images/timesheet/header_1_u25.png"/>
        <!-- Unnamed () -->
        <div id="u26" class="text">
          <p><span style="font-family:'Segoe Print Bold', 'Segoe Print';font-weight:700;">Kumaran Systems</span></p>
        </div>
      </div>

      <!-- Image (Image) -->
      <div id="u27" class="ax_default image" data-label="Image">
        <img id="u27_img" class="img " src="resources/images/timesheet/image_u27.png"/>
        <!-- Unnamed () -->
        <div id="u28" class="text" style="display:none; visibility: hidden">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;"></span></p>
        </div>
      </div>

      <!-- Text (Rectangle) -->
      <div id="u29" class="ax_default paragraph1" data-label="Text">
        <img id="u29_img" class="img " src="resources/images/timesheet/text_u29.png"/>
        <!-- Unnamed () -->
        <div id="u30" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Engage</span></p>
        </div>
      </div>

      <!-- Text (Rectangle) -->
      <div id="u31" class="ax_default paragraph1" data-label="Text">
        <img id="u31_img" class="img " src="resources/images/timesheet/text_u29.png"/>
        <!-- Unnamed () -->
        <div id="u32" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Emerge</span></p>
        </div>
      </div>

      <!-- Text (Rectangle) -->
      <div id="u33" class="ax_default paragraph1" data-label="Text">
        <img id="u33_img" class="img " src="resources/images/timesheet/text_u29.png"/>
        <!-- Unnamed () -->
        <div id="u34" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Excel</span></p>
        </div>
      </div>

      <!-- Unnamed (Menu) -->
      <div id="u35" class="ax_default">
        <img id="u35_menu" class="img " src="resources/images/timesheet/u35_menu.png" alt="u35_menu"/>

        <!-- Unnamed (Table) -->
        <div id="u36" class="ax_default">

          <!-- Unnamed (Menu Item) -->
          <div id="u37" class="ax_default menu_item">
            <img id="u37_img" class="img " src="resources/images/timesheet/u37.png"/>
            <!-- Unnamed () -->
            <div id="u38" class="text">
              <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;"><a href="login.jsp">Home</a></span></p>
            </div>
          </div>

          <!-- Unnamed (Menu Item) -->
          <div id="u39" class="ax_default menu_item">
            <img id="u39_img" class="img " src="resources/images/timesheet/u39.png"/>
            <!-- Unnamed () -->
            <div id="u40" class="text">
              <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Profile</span></p>
            </div>
          </div>
        </div>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u41" class="ax_default icon">
        <img id="u41_img" class="img " src="resources/images/timesheet/u41.png"/>
        <!-- Unnamed () -->
        <div id="u42" class="text" style="display:none; visibility: hidden">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;"></span></p>
        </div>
      </div>

      <!-- Text (Rectangle) -->
      <div id="u43" class="ax_default paragraph1" data-label="Text">
        <img id="u43_img" class="img " src="resources/images/timesheet/text_u43.png"/>
        <!-- Unnamed () -->
        <div id="u44" class="text">
          <p><span style="font-family:'Arial Bold', 'Arial';font-weight:700;">Copyrights Kumaran Systems 2017</span></p>
        </div>
      </div>
      <!-- Unnamed (HTML Button) -->
      <div id="u45" class="ax_default html_button">
        <input id="submit" type="submit" value="Submit"/>
      </div>

      <!-- pname (Text Field) -->
      <div id="u46" class="ax_default text_field1">
        <input id="pname" type="text" value=""/ required>
      </div>

      <!-- task (Text Field) -->
      <div id="u47" class="ax_default text_field1">
        <input id="task" type="text" value=""/ required>
      </div>

      <!-- empid (Text Field) -->
      <div id="u48" class="ax_default text_field1">
        <input id="empid" type="text" value="" required="required" autofocus="autofocus"/>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u49" class="ax_default label">
        <img id="u49_img" class="img " src="resources/images/timesheet/u49.png"/>
        <!-- Unnamed () -->
        <div id="u50" class="text">
          <p><span>Employee Id:</span></p>
        </div>
      </div>
    </div>
     <script>
			var search = {};
			$('#submit').click(function() {
				search["empid"]=$('#empid').val();
				search["pname"] = $('#pname').val();
				search["task"] = $('#task').val();
				search["date"] = $('#date').val();
				search["description"] =$('#description').val();
				search["stime"] =$('#stime').val();
				search["etime"] =$('#etime').val();
				search["status"] =$('#status').val();
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "http://localhost:8080/Spring4Swagger/TimeSheet",
					data : JSON.stringify(search),
					dataType : 'json',
					timeout : 100000,
					success: function(response) 
					{
                         var role=response;
						
						alert("success");
						
						
						
							if(role=="developer")
								{
								window.location.href = "devcontent.jsp";
								}
							
							if(role=="teamlead")
							{
							window.location.href = "teamlead.jsp";
							}
							
							if(role=="pmanager")
							{
							window.location.href = "pmanager.jsp";
							}
							
							if(role=="bhead")
							{
							window.location.href = "bhead.jsp";
							}
							
					}
				});
			});
	</script>
  </body>
</html>
