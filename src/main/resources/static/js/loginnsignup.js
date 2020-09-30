            function changeSec(divname){
				if(divname=='login'){
					$("#loginDiv").animate({'height': '500px','margin-top':'0px'}, 1000);
					$("#signupDiv").animate({'height': '436px','margin-top':'35px'}, 1000);
					$("#loginContent").fadeOut(1000);
					$("#loginForm").fadeIn(1000);
					$("#signupForm").fadeOut(1000);
					$("#signupContent").fadeIn(1000);
					$("#loginDiv").css('background-color','#ffffff');
					$("#signupDiv").css('background-color','#00aeef');
				}
				else{
					$("#signupDiv").animate({'height': '500px','margin-top':'0px'}, 1000);
					$("#loginDiv").animate({'height': '436px','margin-top':'35px'}, 1000);
					$("#loginForm").fadeOut(1000);
					$("#loginContent").fadeIn(1000);
					$("#signupContent").fadeOut(1000);
					$("#signupForm").fadeIn(1000);
					$("#loginDiv").css('background-color','#00aeef');
					$("#signupDiv").css('background-color','#ffffff');
				}
			}