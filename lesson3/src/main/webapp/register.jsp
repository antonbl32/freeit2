<html lang="en">
<head>
    <title>Registration page</title>
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="Resources/images/icons/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="Resources/css/util.css">
    <link rel="stylesheet" type="text/css" href="Resources/css/main.css">
</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100 p-t-50 p-b-90">
            <form class="login100-form validate-form flex-sb flex-w" method="post" action="/reg">
					<span class="login100-form-title p-b-51">
						Registration information
					</span>
                <div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
                    <input class="input100" type="text" name="name" placeholder="Username">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
                    <input class="input100" type="password" name="password" placeholder="Password">
                    <span class="focus-input100"></span>
                </div>
                <div class="container-login100-form-btn m-t-17">
                    <button class="login100-form-btn" >
                        Register
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>