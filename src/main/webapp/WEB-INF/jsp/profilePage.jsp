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
    <link rel="stylesheet" href="<c:url value="/resources/style/css/bootstrap-select.css"/> ">
    <script src="<c:url value="/resources/style/js/selectRoles.js" />"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.5.4/bootstrap-select.js"></script>
    <script src="<c:url value="/resources/style/js/editFields.js" />"></script>
</head>

<body>
<div class="col-md-10">
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

<form:form  method="post" commandName="student" action="/student/edit">
<div class="tab-content">


 <%@ include file="profile_tab1.jsp" %>
 <%@ include file="profile_tab2.jsp" %>
 <%@ include file="profile_tab3.jsp" %>
 <%@ include file="profile_tab4.jsp" %>
 <%@ include file="profile_tab5.jsp" %>
 <%@ include file="profile_tab6.jsp" %>
 <%@ include file="profile_tab7.jsp" %>
 <%@ include file="profile_tab8.jsp" %>
 <%@ include file="profile_tab9.jsp" %>

</div>
    <form:button type="submit">Submit</form:button>
    <%--<button type="submit" class="btn btn-primary pull-right">Submit</button>--%>
</form:form>
</div>
</div>
</div>
</div>
</body>
</html>

