<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistic</title>
</head>
<body>
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
                                        <input type="checkbox"> Univercity
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> Faculty
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> Course
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> Billable
                                    </label>
                                </div>
                                <button class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> Save .PDF</button>
                            </div>
                        </div>
                    </div>
                    <div class="form-group form-group-multiple-selects col-md-6">
                        <strong>Aditional</strong>
                        <div class="input-group input-group-multiple-select col-xs-12">
                            <select id="select" class="form-control" name="values[]">
                                <option value="">Select one</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                                <option value="4">Option 4</option>
                            </select>
                                <span class="input-group-addon input-group-addon-remove">
                                    <span class="glyphicon glyphicon-remove"></span>
                                </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
