<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<title>Create User</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<c:url value="/resources/style/css/bootstrap-select.css"/> ">
<script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="<c:url value="/resources/style/js/selectRoles.js" />"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.5.4/bootstrap-select.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <hr />
        <form:form method="POST" commandName="userDto" action="user">
            <div class="col-md-8">
                <table class="table table-user-information">
                    <tbody class="filters">
                    <tr>
                        <td>Login</td>
                        <td><form:input path="user.login" type="text" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><form:input path="user.name" type="text" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td><form:input path="user.surname" type="text" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Skype</td>
                        <td><form:input path="user.skype" type="text" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><form:input path="user.email" type="text" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><form:input path="user.phone" type="text" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Select roles</td>
                        <td>
                            <form:select cssClass="selectpicker" path="roles" id="roleOptions">

                                <form:option value="1">Student</form:option>
                                <form:option value="2">Tutor</form:option>
                                <form:option value="3">Interviewer</form:option>
                                <form:option value="4">Moderator</form:option>

                            </form:select>
                        </td>
                    </tr>
                    </tbody>
                </table>
                <form:button type="submit" class="btn btn-primary pull-right">Submit</form:button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>