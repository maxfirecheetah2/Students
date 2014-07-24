<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <title>UserProfile</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="<c:url value="/resources/style/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/style/css/bootstrap-theme.css" />" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style/css/profilePageStyle.css"/>">

    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="<c:url value="/resources/style/js/bootstrap.min.js" />"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('.filterable .btn-filter').click(function () {
                var $panel = $(this).parents('.filterable'),
                        $filters = $panel.find('.filters input'),
                        $tbody = $panel.find('.table tbody'),
                        $fltrs = $panel.find('.filters textarea');
                if ($filters.prop('disabled') == true) {
                    $filters.prop('disabled', false);
                    $fltrs.prop('disabled', false);
                    $filters.first().focus();
                } else {
                    $filters.val('').prop('disabled', true);
                    $fltrs.val('').prop('disabled', true);
                    $tbody.find('.no-result').remove();
                    $tbody.find('tr').show();
                }
            });
        });
    </script>


    <style type="text/css">
        .user-row {
            margin-bottom: 14px;
        }

        .user-row:last-child {
            margin-bottom: 0;
        }

        .dropdown-user {
            margin: 13px 0;
            padding: 5px;
            height: 100%;
        }

        .dropdown-user:hover {
            cursor: pointer;
        }

        .table-user-information > tbody > tr {
            border-top: 1px solid rgb(221, 221, 221);
        }

        .table-user-information > tbody > tr:first-child {
            border-top: 0;
        }


        .table-user-information > tbody > tr > td {
            border-top: 0;
        }
    </style>

    <script type="text/javascript">
        $(document).ready(function () {
            var panels = $('.user-infos');
            var panelsButton = $('.dropdown-user');
            panels.hide();

            //Click dropdown
            panelsButton.click(function () {
                //get data-for attribute
                var dataFor = $(this).attr('data-for');
                var idFor = $(dataFor);

                //current button
                var currentButton = $(this);
                idFor.slideToggle(400, function () {
                    //Completed slidetoggle
                    if (idFor.is(':visible')) {
                        currentButton.html('<i class="glyphicon glyphicon-chevron-up text-muted"></i>');
                    }
                    else {
                        currentButton.html('<i class="glyphicon glyphicon-chevron-down text-muted"></i>');
                    }
                })
            });


            $('[data-toggle="tooltip"]').tooltip();

            $('button').click(function (e) {
                e.preventDefault();
            });
        });
    </script>

</head>

<body>
<div class="container">
<div class="row">
<h2>User Profile</h2>
<hr/>
<input type="hidden" name="id" value="${userForEdit.id}"/>

<div class="col-sm-3 col-md-2 affix-sidebar">
    <div class="sidebar-nav">
        <div class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target=".sidebar-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <span class="visible-xs navbar-brand">Sidebar menu</span>
            </div>
            <div class="navbar-collapse collapse sidebar-navbar-collapse">
                <ul class="nav navbar-nav" id="sidenav01">
                    <li class="active">
                        <a href="#" data-toggle="collapse" data-target="#toggleDemo0" data-parent="#sidenav01"
                           class="collapsed">
                            <h4>
                                <img alt="User Pic"
                                     src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100"
                                     class="img-circle img-responsive">
                                <br/>
                                Nik Seredinskiy
                                <br>
                                <small>login as... <span class="caret"></span></small>
                            </h4>
                        </a>

                        <div class="collapse" id="toggleDemo0" style="height: 0px;">
                            <ul class="nav nav-list">
                                <li><a href="#"><span class="glyphicon glyphicon-user"></span> View my profile</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a href="#" data-toggle="collapse" data-target="#toggleDemo" data-parent="#sidenav01"
                           class="collapsed">
                            <span class="glyphicon glyphicon-list"></span> Lists 1 <span
                                class="caret pull-right"></span>
                        </a>

                        <div class="collapse" id="toggleDemo" style="height: 0px;">
                            <ul class="nav nav-list">
                                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Students</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Tutors</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a href="#" data-toggle="collapse" data-target="#toggleDemo2" data-parent="#sidenav01"
                           class="collapsed">
                            <span class="glyphicon glyphicon-list"></span> Lists 2 <span
                                class="caret pull-right"></span>
                        </a>

                        <div class="collapse" id="toggleDemo2" style="height: 0px;">
                            <ul class="nav nav-list">
                                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Stuff department</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Moderators</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Admins</a></li>
                            </ul>
                        </div>
                    </li>
                    <li><a href="#"><span class="glyphicon glyphicon-envelope"></span> Messages <span
                            class="badge pull-right">42</span></a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-search"></span> Advanced Search</a></li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>
</div>
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
                             src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100"
                             class="img-circle">
                    </div>
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <tbody class="filters">
                            <tr>
                                <td>Department:</td>
                                <td><input type="text" class="form-control" value="Programming" disabled></td>
                            </tr>
                            <tr>
                                <td>Skype:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getSkype()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Email:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getEmail()}"/>" disabled/></td>
                            </tr>
                            <tr>
                                <td>Phone Number:</td>
                                <td><textarea class="form-control" disabled>123-4567-890(Landline)</textarea></td>
                            </tr>
                            <tr>
                                <td>Curators:</td>
                                <td><textarea class="form-control" disabled><c:out
                                        value="${userForEdit.getName()}"/></textarea></td>
                            </tr>
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
                                <td>University:</td>
                                <td><input type="text" class="form-control" value="BSU" disabled></td>
                            </tr>
                            <tr>
                                <td>Faculty:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getFaculty()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Specialty:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getSpeciality()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Course:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getCourse()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Group:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getGroup()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Graduation:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getGraduationYear()}"/>" disabled></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab3">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">GPA</h3>

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
                                <td>Winter 2012/2013:</td>
                                <td><input type="text" class="form-control" value="8.0" disabled></td>
                            </tr>
                            <tr>
                                <td>Summer 2012/2013:</td>
                                <td><input type="text" class="form-control" value="7.6" disabled></td>
                            </tr>
                            <tr>
                                <td>Winter 2013/2014</td>
                                <td><input type="text" class="form-control" value="7.5" disabled></td>
                            </tr>
                            <tr>
                                <td>Summer 2013/2014</td>
                                <td><input type="text" class="form-control" value="9.0" disabled></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab4">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Skills information</h3>

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
                        <table class="table">
                            <tbody class="filters">
                            <tr>
                                <td>Current technology:</td>
                                <td><textarea class="form-control" disabled><c:out
                                        value="${userForEdit.getCurrentTechs()}"/></textarea></td>
                            </tr>
                            <tr>
                                <td>Future technology:</td>
                                <td><textarea class="form-control" disabled><c:out
                                        value="${userForEdit.getFutureTechs()}"/></textarea></td>
                            </tr>
                            <tr>
                                <td>English level:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getEnLevel()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Exadel's tranings:</td>
                                <td><input type="text" class="form-control"
                                           value="<c:out value="${userForEdit.getEnCourses()}"/>" disabled></td>
                            </tr>
                            <tr>
                                <td>Certificates:</td>
                                <td><input type="text" class="form-control" value="-" disabled></td>
                            </tr>
                            <tr>
                                <td>English lessons:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getEnCourses()}"
                                           disabled></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab5">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Work in Exadel</h3>

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
                                <td>Hire date:</td>
                                <td><input type="text" class="form-control" value="01.09.2014" disabled></td>
                            </tr>
                            <tr>
                                <td>Probation</td>
                                <td><input type="text" class="form-control"
                                           value="${userForEdit.getProbationB4Acception()}" disabled></td>
                            </tr>
                            <tr>
                                <td>Begin course:</td>
                                <td><input type="text" class="form-control"
                                           value="${userForEdit.getCourseWhenAccepted()}" disabled></td>
                            </tr>
                            <tr>
                                <td>Working hours</td>
                                <td><input type="text" class="form-control" value="4" disabled></td>
                            </tr>
                            <tr>
                                <td>Expecting working hours:</td>
                                <td><input type="text" class="form-control" value="6" disabled></td>
                            </tr>
                            <tr>
                                <td>Billable:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getBillable()}"
                                           disabled></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab6">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Projects history</h3>

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
                                <td>Previous projects:</td>
                                <td><textarea class="form-control" disabled>Exadel stuff app</textarea></td>
                            </tr>
                            <tr>
                                <td>Current project:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getCurrentPrj()}"
                                           disabled></td>
                            </tr>
                            <tr>
                                <td>Begin course:</td>
                                <td><input type="text" class="form-control" value="2nd" disabled></td>
                            </tr>
                            <tr>
                                <td>Role:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getCurPrjRole()}"
                                           disabled></td>
                            </tr>
                            <tr>
                                <td>TeamLead:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getTeamLead()}"
                                           disabled></td>
                            </tr>
                            <tr>
                                <td>Project manager:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getPrjManager()}"
                                           disabled></td>
                            </tr>
                            <tr>
                                <td>Changing project:</td>
                                <td><input type="text" class="form-control" value="${userForEdit.getWannaChangePrj()}"
                                           disabled></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab7">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Holidays</h3>

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
                                <td>Type:</td>
                                <td><input type="text" class="form-control" value="Vacation" disabled></td>
                            </tr>
                            <tr>
                                <td>Date:</td>
                                <td><input type="text" class="form-control" value="24.07.2014-04.08.2014" disabled></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="tab-pane" id="tab8">
    <div class="panel panel-info filterable">
        <div class="panel-body">
            <div class="row user-row">
                <div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">
                    <img class="img-circle"
                         src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
                         alt="User Pic">
                </div>
                <div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
                    <strong>User1</strong><br>
                    <span class="text-muted">User level: Administrator</span>
                </div>
                <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user1">
                    <i class="glyphicon glyphicon-chevron-down text-muted"></i>
                </div>
            </div>
            <div class="row user-infos user1">
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">
                    <textarea class="form-control" disabled>Feedback bla-bla-bla</textarea>
                </div>
            </div>

            <div class="row user-row">
                <div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">
                    <img class="img-circle"
                         src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
                         alt="User Pic">
                </div>
                <div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
                    <strong>User2</strong><br>
                    <span class="text-muted">User level: Administrator</span>
                </div>
                <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user2">
                    <i class="glyphicon glyphicon-chevron-down text-muted"></i>
                </div>
            </div>
            <div class="row user-infos user2">
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">
                    <textarea class="form-control" disabled>Feedback bla-bla-bla</textarea>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

</div>
</div>
</div>
</div>
</div>
</body>
</html>

