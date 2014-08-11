<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="tab-pane" id="tab4">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Skills information</h3>

                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-edit"></span>
                        Edit
                    </button>
                </div>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-3 col-lg-3 " align="center">
                    </div>
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table">
                            <tbody class="filters">
                            <%--<tr>--%>
                            <%--<td>Current technology</td>--%>
                            <%--<td><textarea class="form-control" disabled><c:out--%>
                            <%--value="${userForEdit.getCurrentTechs()}"/></textarea></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                            <%--<td>Future technology</td>--%>
                            <%--<td><textarea class="form-control" disabled><c:out--%>
                            <%--value="${userForEdit.getFutureTechs()}"/></textarea></td>--%>
                            <%--</tr>--%>
                            <tr>
                                <td>English level</td>
                                <td><form:input type="text" class="form-control"
                                                path="generalInfo.enLevel"/></td>
                            </tr>
                            <!--This is not an input!!!-->
                            <tr>
                                <td>Exadel's tranings</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.training"/></td>
                            </tr>
                            <tr>
                                <td>Certificates</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.certificates"/></td>
                            </tr>
                            <tr>
                                <td>English lessons</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.enCourses"/></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>