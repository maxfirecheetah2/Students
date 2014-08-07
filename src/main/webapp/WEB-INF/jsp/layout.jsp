<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="<c:url value="/resources/style/css/bootstrap.css"/> ">
    <link rel="stylesheet" href="<c:url value="/resources/style/css/bootstrap.min.css"/> ">
    <link rel="stylesheet" href="<c:url value="/resources/style/css/menuStyle.css"/> ">


    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="<c:url value="/resources/style/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/style/js/showFeedback.js" />"></script>
    <script src="<c:url value="/resources/style/js/tabHistory.js" />"></script>


</head>
<body>

<div>
    <tiles:insertAttribute name="menu"/>
    <tiles:insertAttribute name="body"/>
</div>


</body>
</html>