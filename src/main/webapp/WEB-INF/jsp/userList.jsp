<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="<c:url value="/resources/style/css/usersListStyle.css"/> ">
    <script src="<c:url value="/resources/style/js/filter.js" />"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-10">
            <div class="panel panel-primary filterable">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        ${role}
                    </h3>
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
                        <th><input type="text" class="form-control" placeholder="Email" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Phone" disabled></th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${users}" var="el">

                            <td><c:out value="${el.name}"/></td>
                            <td><c:out value="${el.surname}"/></td>
                            <td><c:out value="${el.skype}"/></td>
                            <td><c:out value="${el.email}"/></td>
                            <td><c:out value="${el.phone}"/></td>


                            <td>
                                <div class="dropdown">
                                    <a role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                                        Operation <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
                                        <c:if test="${role == 'Tutors' || role == 'Interviewers'}">
                                            <li><a href="#">View students</a></li>
                                        </c:if>
                                        <c:if test="${role == 'Tutors'}">
                                            <li><a href="#">View feedbacks</a></li>
                                        </c:if>
                                        <c:if test="${role == 'Interviewers'}">
                                               <li><a href="#">View interviews</a></li>
                                        </c:if>
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
