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
    <link rel="stylesheet" href="<c:url value="/resources/style/css/bootstrap-select.css"/> ">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="<c:url value="/resources/style/js/selectRoles.js" />"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.5.4/bootstrap-select.js"></script>
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
</ul>
<br/>

<form:form  method="POST" commandName="student" action="/student/edit">
<div class="tab-content">
<div class="tab-pane active" id="tab1">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title"><c:out value="Name here"/></h3>

                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-edit"></span>
                        Edit
                    </button>
                </div>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-3 col-lg-3 " align="center">
                        <img alt="User Pic"
                             src="http://s020.radikal.ru/i717/1408/ae/013315d9d171.jpg"
                             class="img-circle" height="100" width="100" >
                    </div>
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">

                            <tbody class="filters">

                            <tr>

                                <td><form:input type="text" class="form-control"
                                                path="user.id" disabled="disabled"/></td>
                            </tr>

                            <tr>

                                <td><form:input type="text" class="form-control"
                                                path="user.name" disabled="disabled"/></td>
                            </tr>
                            <tr>

                                <td><form:input type="text" class="form-control"
                                                path="user.surname" disabled="disabled"/></td>
                            </tr>
                            <tr>

                                <td><form:input type="text" class="form-control"
                                                path="user.login" disabled="disabled"/></td>
                            </tr>
                            <tr>

                                <td><form:input type="text" class="form-control"
                                                path="user.password" disabled="disabled"/></td>
                            </tr>

                            <tr>
                                <td>Skype</td>
                                <td><form:input type="text" class="form-control"
                                           path="user.skype" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td><form:input type="text" class="form-control"
                                           path="user.email" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Phone Number</td>
                                <td><form:input type="text" class="form-control"
                                           path="user.phone" disabled="disabled"/></td>
                            </tr>
                            <%--<tr>--%>
                                <%--<td>Tutors</td>--%>
                                <%--<td><form:textarea class="form-control"  path="" disabled="disabled"/></td>--%>
                            <%--</tr>--%>
                            </tbody>

                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab2">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Education</h3>

                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-edit"></span>
                        Edit
                    </button>
                </div>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-3 col-lg-3 " align="center">
                    </div>
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <tbody class="filters">
                            <tr>
                                <td>University</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.institution" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Faculty</td>
                                <td><form:input type="text" class="form-control"
                                           path="generalInfo.faculty" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Specialty</td>
                                <td><form:input type="text" class="form-control"
                                          path="generalInfo.speciality" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Course</td>
                                <td><form:input type="text" class="form-control"
                                           path="generalInfo.course"  disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Group</td>
                                <td><form:input type="text" class="form-control"
                                           path="generalInfo.group" disabled="disabled"/></td>
                            </tr>
                            <tr>
                                <td>Graduation</td>
                                <td><form:input type="text" class="form-control"
                                           path="generalInfo.graduationYear" disabled="disabled"/></td>
                            </tr>


                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%--<div class="tab-pane" id="tab3">--%>
    <%--<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">--%>
        <%--<div class="panel panel-info filterable">--%>
            <%--<div class="panel-heading">--%>
                <%--<h3 class="panel-title">GPA</h3>--%>

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
                                <%--<td>Winter 2012/2013:</td>--%>
                                <%--<td><input type="text" class="form-control" value="8.0" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Summer 2012/2013:</td>--%>
                                <%--<td><input type="text" class="form-control" value="7.6" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Winter 2013/2014</td>--%>
                                <%--<td><input type="text" class="form-control" value="7.5" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Summer 2013/2014</td>--%>
                                <%--<td><input type="text" class="form-control" value="9.0" disabled></td>--%>
                            <%--</tr>--%>
                            <%--</tbody>--%>
                        <%--</table>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<div class="tab-pane" id="tab4">--%>
    <%--<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">--%>
        <%--<div class="panel panel-info filterable">--%>
            <%--<div class="panel-heading">--%>
                <%--<h3 class="panel-title">Skills information</h3>--%>

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
                        <%--<table class="table">--%>
                            <%--<tbody class="filters">--%>
                            <%--<tr>--%>
                                <%--<td>Current technology</td>--%>
                                <%--<td><textarea class="form-control" disabled><c:out--%>
                                        <%--value="${userForEdit.getCurrentTechs()}"/></textarea></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Future technology</td>--%>
                                <%--<td><textarea class="form-control" disabled><c:out--%>
                                        <%--value="${userForEdit.getFutureTechs()}"/></textarea></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>English level</td>--%>
                                <%--<td><input type="text" class="form-control"--%>
                                           <%--value="<c:out value="${userForEdit.getEnLevel()}"/>" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Exadel's tranings</td>--%>
                                <%--<td><input type="text" class="form-control"--%>
                                           <%--value="<c:out value="${userForEdit.getEnCourses()}"/>" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Certificates</td>--%>
                                <%--<td><input type="text" class="form-control" value="-" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>English lessons</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getEnCourses()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--</tbody>--%>
                        <%--</table>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<div class="tab-pane" id="tab5">--%>
    <%--<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">--%>
        <%--<div class="panel panel-info filterable">--%>
            <%--<div class="panel-heading">--%>
                <%--<h3 class="panel-title">Work in Exadel</h3>--%>

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
                                <%--<td>Hire date</td>--%>
                                <%--<td><input type="text" class="form-control" value="01.09.2014" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Probation</td>--%>
                                <%--<td><input type="text" class="form-control"--%>
                                           <%--value="${userForEdit.getProbationB4Acception()}" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Begin course</td>--%>
                                <%--<td><input type="text" class="form-control"--%>
                                           <%--value="${userForEdit.getCourseWhenAccepted()}" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Working hours</td>--%>
                                <%--<td><input type="text" class="form-control" value="4" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Expecting working hour</td>--%>
                                <%--<td><input type="text" class="form-control" value="6" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Billable</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getBillable()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--</tbody>--%>
                        <%--</table>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<div class="tab-pane" id="tab6">--%>
    <%--<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">--%>
        <%--<div class="panel panel-info filterable">--%>
            <%--<div class="panel-heading">--%>
                <%--<h3 class="panel-title">Projects history</h3>--%>

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
                                <%--<td>Previous projects</td>--%>
                                <%--<td><textarea class="form-control" disabled>Exadel stuff app</textarea></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Current project</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getCurrentPrj()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Begin course</td>--%>
                                <%--<td><input type="text" class="form-control" value="2nd" disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Role</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getCurPrjRole()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>TeamLead</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getTeamLead()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Project manager</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getPrjManager()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>Changing project</td>--%>
                                <%--<td><input type="text" class="form-control" value="${userForEdit.getWannaChangePrj()}"--%>
                                           <%--disabled></td>--%>
                            <%--</tr>--%>
                            <%--</tbody>--%>
                        <%--</table>--%>
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

