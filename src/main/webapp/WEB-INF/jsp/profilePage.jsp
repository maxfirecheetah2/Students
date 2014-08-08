<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="<c:url value="/resources/style/css/profilePageStyle.css"/> ">
    <script src="<c:url value="/resources/style/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/style/js/editFields.js" />"></script>
    <link rel="stylesheet" href="<c:url value="/resources/style/css/bootstrap-select.css"/> ">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="<c:url value="/resources/style/js/selectRoles.js" />"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.5.4/bootstrap-select.js"></script>
    <script src="<c:url value="/resources/style/js/editFields.js" />"></script>

</head>

<body>
<div class="container">
<div class="row">


<div class="col-sm-9 col-md-10">
<div class="tabbable">
<ul class="nav nav-tabs">
    <li class="active"><a href="#tab1" data-toggle="tab">Basic Info</a></li>
    <li><a href="#tab2" data-toggle="tab">Education</a></li>
    <li><a href="#tab3" data-toggle="tab">Progress</a></li>
    <li><a href="#tab4" data-toggle="tab">Skills</a></li>
    <li><a href="#tab5" data-toggle="tab">Company</a></li>
    <li><a href="#tab6" data-toggle="tab">Projects</a></li>
    <li><a href="#tab7" data-toggle="tab">Recreation</a></li>
    <li><a href="#tab8" data-toggle="tab">Feedbacks</a></li>
    <li><a href="#tab9" data-toggle="tab">Interviews</a></li>
</ul>
<br/>

<form:form  method="POST" commandName="student" action="/student/edit">
<div class="tab-content">


 <%@ include file="profile_tab1.jsp" %>
 <%@ include file="profile_tab2.jsp" %>
 <%@ include file="profile_tab3.jsp" %>
 <%@ include file="profile_tab4.jsp" %>
 <%--<%@ include file="profile_tab5.jsp" %>--%>
 <%--<%@ include file="profile_tab6.jsp" %>--%>



 <%--<div class="tab-pane" id="tab8">--%>
    <%--<div class="panel panel-info filterable">--%>
        <%--<div class="panel-body">--%>
            <%--<div class="row user-row">--%>
                <%--<div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">--%>
                    <%--<img class="img-circle"--%>
                         <%--src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"--%>
                         <%--alt="User Pic">--%>
                <%--</div>--%>
                <%--<div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">--%>
                    <%--<strong>Alfred</strong><br>--%>
                    <%--<span class="text-muted">User level: Butler</span>--%>
                <%--</div>--%>
                <%--<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user1">--%>
                    <%--<i class="glyphicon glyphicon-chevron-down text-muted"></i>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="row user-infos user1">--%>
                <%--<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">--%>
                    <%--<div class="col-md-6">--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="pole">Label:</label>--%>
                            <%--<input id="pole" class="form-control" disabled value="Yoy bitch, Mr.White">--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="pole2">Label:</label>--%>
                            <%--<input id="pole2" class="form-control" disabled value="Yoy bitch, Mr.White">--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="pole3">Label:</label>--%>
                            <%--<input id="pole3" class="form-control" disabled value="Yoy bitch, Mr.White">--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="pole4">Label:</label>--%>
                            <%--<input id="pole4" class="form-control" disabled value="Yoy bitch, Mr.White">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-6">--%>
                        <%--<label for="feedback">Feedback:</label>--%>
                        <%--<textarea id="feedback" class="form-control" disabled>Feedback bla-bla-bla</textarea>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<div class="tab-pane" id="tab9">--%>
    <%--<div class="panel panel-info filterable">--%>
        <%--<div class="panel-body">--%>
            <%--<div class="row user-row">--%>
                <%--<div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">--%>
                    <%--<img class="img-circle"--%>
                         <%--src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"--%>
                         <%--alt="User Pic">--%>
                <%--</div>--%>
                <%--<div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">--%>
                    <%--<strong>Alfred</strong><br>--%>
                    <%--<span class="text-muted">User level: Butler</span>--%>
                <%--</div>--%>
                <%--<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".inter1">--%>
                    <%--<i class="glyphicon glyphicon-chevron-down text-muted"></i>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="row user-infos inter1">--%>
                <%--<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">--%>
                    <%--<div class="col-md-6">--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="skill">Label:</label>--%>
                            <%--<input id="skill" class="form-control" disabled value="i'm batman">--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="skill2">Label:</label>--%>
                            <%--<input id="skill2" class="form-control" disabled value="i'm batman">--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="skill3">Label:</label>--%>
                            <%--<input id="skill3" class="form-control" disabled value="i'm batman">--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<label for="skill5">Label:</label>--%>
                            <%--<input id="skill5" class="form-control" disabled value="i'm batman">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-6">--%>
                        <%--<label for="note">Note:</label>--%>
                        <%--<textarea id="note" class="form-control" disabled>Note bla-bla-bla</textarea>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>







<%--<div class="tab-pane" id="tab7">--%>
    <%--<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">--%>
        <%--<div class="panel panel-info filterable">--%>
            <%--<div class="panel-heading">--%>
                <%--<h3 class="panel-title">Holidays</h3>--%>

                <%--<div class="pull-right">--%>
                    <%--<button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-edit"></span>--%>
                        <%--Edit--%>
                    <%--</button>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="panel-body">--%>
                <%--<div class="row">--%>
                    <%--<div class="col-md-3 col-lg-3 " align="center">--%>
                    <%--</div>--%>
                    <%--<div class=" col-md-9 col-lg-9 ">--%>
                        <%--<table class="table table-user-information">--%>
                            <%--<tbody class="filters">--%>
                            <%--<tr>--%>
                                <%--<td>Type</td>--%>
                                <%--<td><input type="text" class="form-control" value="Vacation" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Date</td>--%>
                                <%--<td><input type="text" class="form-control" value="24.07.2014-04.08.2014" disabled></td>--%>
                            <%--</tr>--%>
                            <%--</tbody>--%>
                        <%--</table>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<div class="tab-pane" id="tab8">--%>
    <%--<div class="panel panel-info filterable">--%>
        <%--<div class="panel-body">--%>
            <%--<div class="row user-row">--%>
                <%--<div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">--%>
                    <%--<img class="img-circle"--%>
                         <%--src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"--%>
                         <%--alt="User Pic">--%>
                <%--</div>--%>
                <%--<div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">--%>
                    <%--<strong>User1</strong><br>--%>
                    <%--<span class="text-muted">User level: Administrator</span>--%>
                <%--</div>--%>
                <%--<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user1">--%>
                    <%--<i class="glyphicon glyphicon-chevron-down text-muted"></i>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="row user-infos user1">--%>
                <%--<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">--%>
                    <%--<textarea class="form-control" disabled>Feedback bla-bla-bla</textarea>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="row user-row">--%>
                <%--<div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">--%>
                    <%--<img class="img-circle"--%>
                         <%--src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"--%>
                         <%--alt="User Pic">--%>
                <%--</div>--%>
                <%--<div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">--%>
                    <%--<strong>User2</strong><br>--%>
                    <%--<span class="text-muted">User level: Administrator</span>--%>
                <%--</div>--%>
                <%--<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user2">--%>
                    <%--<i class="glyphicon glyphicon-chevron-down text-muted"></i>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="row user-infos user2">--%>
                <%--<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">--%>
                    <%--<textarea class="form-control" disabled>Feedback bla-bla-bla</textarea>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--<div>--%>

<%--</div>--%>


<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<form:button type="submit" class="btn btn-primary pull-right" value="Submit">Submit</form:button>
</form:form>
</body>
</html>

