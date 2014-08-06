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
                    <th><input type="text" class="form-control" placeholder="Hired" disabled></th>
                    <%--<th><input type="text" class="form-control" placeholder="Faculty" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Course" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Group" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Graduation" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Hours a day" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Billable" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Role" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="Techs" disabled></th>--%>
                    <%--<th><input type="text" class="form-control" placeholder="English" disabled></th>--%>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${students}" var="stud">
                    <tr>
                        <td><c:out value="${stud.name}"/></td>
                        <td><c:out value="${stud.surname}"/></td>
                        <td><c:out value="${stud.generalInfo.acceptionDate}"/></td>
                        <%--<td><c:out value="${stud.faculty}"/></td>--%>
                        <%--<td><c:out value="${user.course}"/></td>--%>
                        <%--<td><c:out value="${user.group}"/></td>--%>
                        <%--<td><c:out value="${user.graduationYear}"/></td>--%>
                        <%--<td><c:out value="${user.billable}"/></td>--%>
                        <%--<td><c:out value="${user.curPrjRole}"/></td>--%>
                        <%--<td><c:out value="${user.currentTechs}"/></td>--%>
                        <%--<td><c:out value="${user.enLevel}"/></td>--%>
                        <td>
                            <div class="dropdown">
                                <a role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                                    Operation <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
                                    <li><a href='#'>View profile</a></li>
                                    <li><a href="#">Send Notification</a></li>
                                    <li><a href="#">Add feedback</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Fire user</a></li>
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
