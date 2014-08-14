<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="tab-pane active" id="tab1">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">${student.user.name} ${student.user.surname}</h3>
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-edit"></span>
                        Edit
                    </button>
                </div>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-3 col-lg-3 " align="center">
                        <img alt="User Pic"
                             src="http://s020.radikal.ru/i717/1408/ae/013315d9d171.jpg"
                             class="img-circle" height="100" width="100">
                    </div>
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <form:input type="hidden" class="form-control" path="id" disabled="disabled"/>
                            <form:input type="hidden" class="form-control" path="generalInfo.id" disabled="disabled"/>
                            <form:input type="hidden" class="form-control" path="user.id" disabled="disabled"/>
                            <form:input type="hidden" class="form-control" path="user.name"/>
                            <form:input type="hidden" class="form-control" path="user.surname" />
                            <form:input type="hidden" class="form-control" path="user.login"/>
                            <form:input type="hidden" class="form-control" path="user.password" />
                            <tbody class="filters">
                            <tr>
                                <td>Skype</td>
                                <td><form:input type="text" class="form-control"
                                                path="user.skype"/></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td><form:input type="text" class="form-control"
                                                path="user.email"  /></td>
                            </tr>
                            <tr>
                                <td>Phone Number</td>
                                <td><form:input type="text" class="form-control"
                                                path="user.phone" /></td>
                            </tr>
                            <tr>
                            <td>Tutors</td>
                            <td>
                                <form:select cssClass="selectpicker" path="" id="tutorsSelector">
                                    <c:forEach items="${tutors}" var="tutor">
                                        <form:option value="${tutor.id}">${tutor.name} ${tutor.surname}</form:option>
                                    </c:forEach>
                                </form:select>
                            </td>
                            </tr>
                            </tbody>

                        </table>

                        <%--<a href="#myModal" class="btn btn-success pull-right" data-toggle="modal">Change password</a>--%>
                        <%--<div id="myModal" class="modal fade">--%>
                            <%--<div class="modal-dialog">--%>
                                <%--<div class="modal-content" style="background-color: #f8f8f8">--%>
                                    <%--<form  method="post" commandName="" action="">--%>
                                        <%--<div class="modal-header" style="background-color: #575757">--%>
                                            <%--<h4 class="modal-title" style="color: #ffffff">Change Password</h4>--%>
                                        <%--</div>--%>
                                        <%--<div class="modal-body">--%>
                                            <%--<label>Old password</label>--%>
                                            <%--<form:input type="password" class="form-control" path="" />--%>
                                            <%--<label>New password</label>--%>
                                            <%--<form:input type="password" class="form-control" path="" />--%>
                                            <%--<label>Repeat</label>--%>
                                            <%--<form:input type="password" class="form-control" path="" />--%>
                                        <%--</div>--%>
                                        <%--<div class="modal-footer">--%>
                                            <%--<form:button type="button" class="btn btn-default" data-dismiss="modal">Close</form:button>--%>
                                            <%--<form:button type="submit" class="btn btn-primary">Save changes</form:button>--%>
                                        <%--</div>--%>
                                    <%--</form>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>

                    </div>
                </div>
            </div>
        </div>
    </div>

</div>