<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/resources/style/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/style/css/bootstrap-theme.css" />" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/css/indexStyle.css"/>">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="../../style/js/bootstrap.min.js"></script>

</head>
<body>


<div class="container">
    <div class="row">
        <hr>
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" name="loginForm" action="/j_spring_security_check"
                          method="POST">
                        <div class="form-group">
                            <label for="inputLogin3" class="col-sm-3 control-label">
                                Login
                            </label>

                            <div class="col-sm-9">
                                <input class="form-control" id="inputLogin3" name="j_username" placeholder="Login"
                                       required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">
                                Password
                            </label>

                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="inputPassword3" name="j_password"
                                       placeholder="Password" required="">
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-success btn-sm">
                                    Sign in
                                </button>
                                <button type="reset" class="btn btn-default btn-sm">
                                    Reset
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-footer">
                    <input type='checkbox' name='_spring_security_remember_me'/>
                    <label>Remember me</label>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>

