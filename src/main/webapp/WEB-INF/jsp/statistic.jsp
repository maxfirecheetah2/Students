<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Statistic</title>
</head>
<body>
<form:form commandName="statisticsDto" action="/statistics" method="POST">
<div class="container">

    <div class="row">
        <div class="col-md-8">
            <div class="well well-sm">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <strong>Basic</strong>
                            <div class="basic" id="basic">
                                <div class="checkbox">
                                    <label>
                                        <form:checkbox path="university"/> Univercity
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <form:checkbox path="faculty"/> Faculty
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <form:checkbox path="course"/> Course
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <form:checkbox path="billable"/> Billable
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <form:checkbox path="notbillable"/> Time when not billable
                                    </label>
                                </div>
                                <form:button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> Save .PDF</form:button>

                            </div>
                        </div>
                    </div>
                    <%--<div class="form-group form-group-multiple-selects col-md-6">--%>
                        <%--<strong>Aditional</strong>--%>
                        <%--<div class="input-group input-group-multiple-select col-xs-12">--%>
                            <%--<select id="select" class="form-control" name="values[]">--%>
                                <%--<option value="">Select one</option>--%>
                                <%--<option value="1">Option 1</option>--%>
                                <%--<option value="2">Option 2</option>--%>
                                <%--<option value="3">Option 3</option>--%>
                                <%--<option value="4">Option 4</option>--%>
                            <%--</select>--%>
                                <%--<span class="input-group-addon input-group-addon-remove">--%>
                                    <%--<span class="glyphicon glyphicon-remove"></span>--%>
                                <%--</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                </div>
            </div>
        </div>

    </div>

</div>
    <%--<form:button class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> Save .PDF</form:button>--%>
</form:form>
</body>
</html>
