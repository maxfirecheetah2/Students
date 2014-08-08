<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Send Email</title>
    <link rel="stylesheet" href="<c:url value="/resources/style/css/sendEmailStyle.css"/> ">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="well well-sm">
                <form class="form-horizontal" action="" method="post">
                    <fieldset>
                        <legend class="text-center">Send message</legend>
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="topic">Topic</label>

                            <div class="col-md-9">
                                <input id="topic" name="topic" type="text" placeholder="Message topic"
                                       class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-3 control-label" for="message">Your message</label>

                            <div class="col-md-9">
                                <textarea class="form-control" id="message" name="message"
                                          placeholder="Please enter your message here..." rows="5"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12 text-right">
                                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
