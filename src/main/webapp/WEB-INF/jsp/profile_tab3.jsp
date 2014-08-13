<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="tab-pane" id="tab3">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
        <div class="panel panel-info filterable">
            <div class="panel-heading">
                <h3 class="panel-title">GPA</h3>

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
                                <td>Session 1</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session1" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 2</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session2" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 3</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session3" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 4</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session4" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 5</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session5" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 6</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session6" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 7</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session7" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 8</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session8" disabled="true"/></td>
                            </tr>
                            <tr>
                                <td>Session 9</td>
                                <td><form:input type="text" class="form-control" path="generalInfo.session9" disabled="true"/></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <form:button type="submit" class="btn btn-primary pull-right">Submit</form:button>
</div>
