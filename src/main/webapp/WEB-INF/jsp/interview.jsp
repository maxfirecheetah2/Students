<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Interview</title>
    <script src="<c:url value="/resources/style/js/addSkill.js" />"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-10">
            <div class="well well-sm">
            <form:form method="POST" commandName="interviewDto" action="/add/${studId}">
                    <div class="skills">
                        <label>Skills</label>
                        <div class="form-group multiple-form-group input-group">
                            <div class="input-group-btn input-group-select">
                                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                    <span class="concept">English Level</span> <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a id="#skill1">English Level</a></li>
                                    <li><a id="#skill2">HTML/CSS</a></li>
                                    <li><a id="#skill3">JavaScript</a></li>
                                    <li><a id="#skill4">Basic Java</a></li>
                                    <li><a id="#skill5">PHP</a></li>
                                    <li><a id="#skill6">Spring</a></li>
                                </ul>
                              </div>
                            <form:input type="text" class="form-control" path="marks[1]"/>
                                <span class="input-group-btn">
                                    <button type="button" class="btn btn-success btn-add">+</button>
                                </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="note">
                            Note
                        </label>
                        <form:textarea name="message" class="form-control" id="note" path="text" rows="6" cols="25"/>
                    </div>
                    <div class="form-group">
                        <form:button type="submit" class="btn btn-primary" id="btnSendInterview">
                            Send Interview
                        </form:button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    </div>
</body>
</html>
