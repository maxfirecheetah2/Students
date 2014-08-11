<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="tab-pane" id="tab5">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Work in Exadel</h3>

                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-edit"></span>
                        Edit
                    </button>
                </div>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-3 col-lg-3 " align="center">
                    </div>
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <tbody class="filters">
                            <tr>
                                <td>Hire date</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.acceptionDate" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Probation</td>
                                <td><form:input type="text" class="form-control"
                                                path="generalInfo.probationB4Acception" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Begin course</td>
                                <td><form:input type="text" class="form-control"
                                                path="generalInfo.courseWhenAccepted" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Billable</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.billable" disabled="true"/></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
