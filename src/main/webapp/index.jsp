<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="style/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="style/css/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="style/css/indexStyle.css">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="style/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <h1>Exadel staff application</h1>
        <hr>
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-3 control-label">
                                Email
                            </label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="inputEmail3" placeholder="Email" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">
                                Password
                            </label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="inputPassword3" placeholder="Password" required="">
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
                    panel footer
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

