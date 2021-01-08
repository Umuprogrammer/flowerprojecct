//$(document).ready();
$(document).ready(
	//function(){}
		
	function(){// now u can add  you statement

		
		$("#fullname").blur(function(){
      $("#fullname").change(function(){
        $("#fullname").removeClass("alert-r");
      });
  	 
  	$("#email").blur(function(){
        $(this).change().removeClass("alert-r");
        });
  	$("#username").blur(function(){
        $(this).change().removeClass("alert-r");
        });
  	$("#phonenumber").blur(function(){
        $(this).change().removeClass("alert-r");
        });
  	$("#password").blur(function(){
        $(this).change().removeClass("alert-r");
        });
  	$("#vpassword").blur(function(){
        $(this).change().removeClass("alert-r");
        });
      
        $("#birthday").blur(function(){
          $(this).change().removeClass("alert-r");
          });

    });
    
	//$().click(function(){statements;});
	$("#signup").click(function(){
    $("#warn").empty();
		var fullname=$("#fullname").val();
		var gender=$('input[name=gender]:checked').val();
		var birthday=$("#birthday").val();
		var username=$("#username").val();
		var email=$("#email").val();
		var phonenumber=$("#phonenumber").val();
    var password=$("#password").val();
    var pwdverf=$("#vpassword").val();
    var all=[$("#fullname"),$("#birthday"),$("#username"),$("#email"),$("#phonenumber"),$("#password"),$("#vpassword")];
  $(function(){
      
   	alert(!fullname  || !birthday || !username || !email || !phonenumber || !password || !pwdverf || gender); 

        });
       
      //$.ajax({url:"value", data: {"key":"value"} , success: function(data){} });
    if (!(!fullname  || !birthday || !username || !email || !phonenumber || !password || !pwdverf )){
      
     if(password==pwdverf)
        {
        $.ajax({url:"Registration",
                data: {  "fullname":fullname,
                         "gender":gender,
                         "birthday":birthday,
                         "username":username,
                         "email":email,
                         "phonenumbeer":phonenumber,
                         "passwrd":password
                        },
                success: function(result){
                    alert(result);

                      }
        });
      }
      else {
    	 
        $("#password,#vpassword").addClass("alert-r").val("");
        $("#warn").html("<p  style='color: red;' ><i class='warning'>passwords are not matching, try again! </i></p> ");

      }
    }else{
      $("#warn").html("<p  style='color: red;' ><i class='warning'>please fill all the fields !!</i></p>");
      
        if(!$("#fullname").val()){
              $("#fullname").addClass("alert-r");
        }
        if(!$("#birthday").val()){
          $("#birthday").addClass("alert-r");
        }
        if(!$("#email").val()){
          $("#email").addClass("alert-r");
        }
        if(!$("#phonenumber").val()){
          $("#phonenumber").addClass("alert-r");
        }
        if(!$("#password").val()){
          $("#password").addClass("alert-r");
        }
        if(!$("#vpassword").val()){
          $("#vpassword").addClass("alert-r");
        }
        if(!$("#username").val()){
            $("#username").addClass("alert-r");
          }
      
    }
           
   


		
		//alert(gender+" "+fullname+" "+birthday+" "+username+" "+email+" "+phonenumber+" "+password);

	});
		
	}
);

