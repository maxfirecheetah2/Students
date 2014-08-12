<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Feedback Form</title>

</head>
<body>
<div class="col-md-10">
    <div class="row">
        <div class="col-md-8">
            <div class="well well-sm">
                    <div class="row">
                        <form:form method="POST" commandName="feedback" action="add/${studId}">
                        <div class="col-md-6">
                        <div>
                            <div class="form-group">
                                <label for="aptitude">
                                    Aptitude
                                </label>
                                <form:input type="text" class="form-control" id="aptitude" placeholder="Type here" path="profLevel"/>
                            </div>
                            <div class="form-group">
                                <label for="attitude">
                                    Attitude to work
                                </label>
                                <form:input type="text" class="form-control" id="attitude" placeholder="Type here" path="diligence"/>
                            </div>
                            <div class="form-group">
                                <label for="sociability">
                                    Sociability
                                </label>
                                <form:input type="text" class="form-control" id="sociability" placeholder="Type here" path="sociability"/>
                            </div>

                            <div class="form-group">
                                <label for="progress">
                                    Progress in professional questions
                                </label>
                                <form:input type="text" class="form-control" id="progress" placeholder="Type here" path="profProgress"/>
                            </div>

                            <div class="form-group">
                                <label for="hours">
                                    Do need more work hours
                                </label>

                                <div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <form:radiobutton name="options" value="1" id="option1" path="promotionNecessity"/> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <form:radiobutton name="options" value="0" id="option2" path="promotionNecessity"/> NO
                                        </label>
                                    </div>
                                </div>
                            </div>



                            <div class="form-group">
                                <label for="project">
                                    Working on project right now?
                                </label>

                                <div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <form:radiobutton  name="options" value="1" id="option1" path="realPrj"/> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <form:radiobutton name="options" value="0" id="option2" path="realPrj"/> NO
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="project">
                                    Billable
                                </label>

                                <div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <form:radiobutton  name="options" value="1" id="option1" path="billable"/> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <form:radiobutton name="options" value="0" id="option2" path="billable"/> NO
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="feedback">
                                    Feedback
                                </label>
                                <form:textarea name="message" id="feedback" class="form-control" rows="9" cols="25"
                                          placeholder="Feedback" path="text"/>
                            </div>
                            <%--<div class="form-group">--%>
                                <%--<label for="date">--%>
                                    <%--Date--%>
                                <%--</label>--%>
                                <%--<form:input type="date" class="form-control" id="date" placeholder="Enter date here" path="date"/>--%>
                            <%--</div>--%>
                        </div>
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary pull-right" id="btnContactUs">
                                Send Feedback
                            </button>
                        </div>
                        </form:form>
                    </div>
            </div>
        </div>
        <div class="col-md-4">
                <h3><span class="glyphicon glyphicon-user"></span> Student info</h3>
                <hr/>
                <address>
                    <strong>Aaron Ramsey</strong><br>
                    BSU, FAMCS<br>
                    3rd course, 8th group<br/>
                    Application Math <br/>
                    Graduation: 2017 <br/><br/>
                    <strong>Curators:</strong><br/>
                    Arsene Wenger<br/>
                    Mikel Arteta<br/>
                </address>
        </div>
</div>
</div>
</body>
</html>
