<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="tab-pane" id="tab6">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Projects history</h3>

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
                        <table class="table table-user-information">
                            <tbody class="filters">
                            <tr>
                                <td>Previous projects</td>
                                <td><form:textarea path="listLastPrj" class="form-control"/></td>
                            </tr>
                            <tr>
                                <td>Current project</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.currentPrj"/></td>
                            </tr>

                            <tr>
                                <td>Begin course</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.courseWhenAccepted"/></td>
                            </tr>
                            <tr>
                                <td>Role</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.cur_prj_role" /></td>
                            </tr>
                            <tr>
                                <td>TeamLead</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.teamLead"/></td>
                            </tr>
                            <tr>
                                <td>Project manager</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.prjManager"/></td>
                            </tr>
                            <tr>
                                <td>Changing project</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.getWannaChangePrj"/></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>