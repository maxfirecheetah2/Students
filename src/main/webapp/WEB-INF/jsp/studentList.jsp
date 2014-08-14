<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Students</title>
    <link rel="stylesheet" href="<c:url value="/resources/style/css/usersListStyle.css"/> ">
    <script src="<c:url value="/resources/style/js/filter.js" />"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-10">
            <div class="panel panel-primary filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Students</h3>
                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                </div>
            </div>
            <table class="table">
                <thead>
                <tr class="filters">
                    <th><input type="text" class="form-control" placeholder="Name" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Surname" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Skype" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Hired" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Faculty" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Course" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Hours a day" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Billable" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Role" disabled></th>
                    <th><input type="text" class="form-control" placeholder="English" disabled></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${users}" var="student">
                    <tr>


                            <td><c:out value="${student.user.name}"/></td>
                            <td><c:out value="${student.user.surname}"/></td>
                            <td><c:out value="${student.user.skype}"/></td>
                            <td><c:out value="${student.generalInfo.acceptionDate}"/></td>
                            <td><c:out value="${student.generalInfo.faculty}"/></td>
                            <td><c:out value="${student.generalInfo.course}"/></td>
                            <td></td>
                            <td><c:out value="${student.generalInfo.billable}"/></td>
                            <td><c:out value="${student.generalInfo.curPrjRole}"/></td>
                            <td><c:out value="${student.generalInfo.enLevel}"/></td>


                        <td>
                            <div class="dropdown">
                                <a role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                                    Operation <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">


                                        <li><a href='<c:url value="/student/${student.id}"/>'>View profile</a></li>
                                        <li><a href='<c:url value="/feedback/${student.id}"/>'>Add feedback</a></li>
                                        <li><a href='<c:url value="/interview/${student.id}"/>'>Add interview</a></li>


                                    <li class="divider"></li>

                                </ul>
                            </div>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
        </div>
    </div>
</div>
</div>
</body>
</html>
