<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
                <form:form class="form-horizontal" action="/email" method="POST" commandName="emailDto">
                    <fieldset>
                        <legend class="text-center">Send message</legend>
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="topic">Topic</label>

                            <div class="col-md-9">
                                <form:input id="topic" path="title" name="topic" type="text" placeholder="Message topic"
                                       class="form-control"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-3 control-label" for="message">Your message</label>

                            <div class="col-md-9">
                                <form:textarea class="form-control" path="text" id="message" name="message"
                                          placeholder="Please enter your message here..." rows="5"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12 text-right">
                                <form:button type="submit" class="btn btn-primary">Submit</form:button>
                            </div>
                        </div>
                    </fieldset>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
