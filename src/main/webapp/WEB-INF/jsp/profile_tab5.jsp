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
                                <td>Acception Date</td>
                                <td>
                                    <form:input type="date" class="form-control" path="generalInfo.acceptionDate"/>
                                </td>
                            </tr>
                            <tr>
                            <td>Billable</td>
                            <td><div class="bs-example">
                                <div class="btn-group" data-toggle="buttons">
                                    <label class="btn btn-primary">
                                        <form:radiobutton  name="options" value="1" id="option1" path="generalInfo.billable"/> YES
                                    </label>
                                    <label class="btn btn-primary">
                                        <form:radiobutton name="options" value="0" id="option2" path="generalInfo.billable"/> NO
                                    </label>
                                </div>
                            </div></td>
                            </tr>
                            <tr>
                                <td>Billable since</td>
                                <td><form:input type="date" class="form-control" path="generalInfo.billableSince"/></td>
                            </tr>
                            <tr>
                                <td>Probation before acception</td>
                                <td><div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <form:radiobutton  name="options" value="1" id="option1" path="generalInfo.probationB4Acception"/> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <form:radiobutton name="options" value="0" id="option2" path="generalInfo.probationB4Acception"/> NO
                                        </label>
                                    </div>
                                </div>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>