<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <title>UsersList</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../style/css/usersListStyle.css">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('.filterable .btn-filter').click(function () {
                var $panel = $(this).parents('.filterable'),
                        $filters = $panel.find('.filters input'),
                        $tbody = $panel.find('.table tbody');
                if ($filters.prop('disabled') == true) {
                    $filters.prop('disabled', false);
                    $filters.first().focus();
                } else {
                    $filters.val('').prop('disabled', true);
                    $tbody.find('.no-result').remove();
                    $tbody.find('tr').show();
                }
            });

            $('.filterable .filters input').keyup(function (e) {
                /* Ignore tab key */
                var code = e.keyCode || e.which;
                if (code == '9') return;
                /* Useful DOM data and selectors */
                var $input = $(this),
                        inputContent = $input.val().toLowerCase(),
                        $panel = $input.parents('.filterable'),
                        column = $panel.find('.filters th').index($input.parents('th')),
                        $table = $panel.find('.table'),
                        $rows = $table.find('tbody tr');
                /* Dirtiest filter function ever ;) */
                var $filteredRows = $rows.filter(function () {
                    var value = $(this).find('td').eq(column).text().toLowerCase();
                    return value.indexOf(inputContent) === -1;
                });
                /* Clean previous no-result if exist */
                $table.find('tbody .no-result').remove();
                /* Show all rows, hide filtered ones (never do that outside of a demo ! xD) */
                $rows.show();
                $filteredRows.hide();
                /* Prepend no-result row if all rows are filtered */
                if ($filteredRows.length === $rows.length) {
                    $table.find('tbody').prepend($('<tr class="no-result text-center"><td colspan="' + $table.find('.filters th').length + '">No result found</td></tr>'));
                }
            });
        });
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <h2>List of Exadel's staff</h2>
        <hr>
        <div class="panel panel-primary filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Students</h3>
                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                </div>
            </div>
            <table class="table">
                <thead>
                <tr class="filters">
                    <th><input type="text" class="form-control" placeholder="Surname" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Name" disabled></th>
                    <th><input type="text" class="form-control" placeholder="HireDate" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Faculty" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Course" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Group" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Graduation" disabled></th>
                    <th><input type="text" class="form-control" placeholder="WorkHours" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Billable" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Role" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Technologies" disabled></th>
                    <th><input type="text" class="form-control" placeholder="Endlish Level" disabled></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Walcott</td>
                    <td>Theo</td>
                    <td>12-11-1989</td>
                    <td>FAMCS</td>
                    <td>3rd</td>
                    <td>8th</td>
                    <td>2017</td>
                    <td>4</td>
                    <td>No</td>
                    <td>Junior</td>
                    <td>Java</td>
                    <td>Intermediate</td>
                    <td>
                        <div class="dropdown">
                            <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                                Operation <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
                                <li><a href="#">View profile</a></li>
                                <li><a href="#">Send Email</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Remove user</a></li>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>Ramsey</td>
                    <td>Aaron</td>
                    <td>23-01-1992</td>
                    <td>FAMCS</td>
                    <td>3rd</td>
                    <td>8th</td>
                    <td>2017</td>
                    <td>4</td>
                    <td>No</td>
                    <td>Junior</td>
                    <td>Java</td>
                    <td>Pre-Intermediate</td>
                    <td>
                        <div class="dropdown">
                            <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                                Operation <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
                                <li><a href="#">View profile</a></li>
                                <li><a href="#">Send Email</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Remove user</a></li>
                            </ul>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>Wilshere</td>
                    <td>Jack</td>
                    <td>24-03-1994</td>
                    <td>FAMCS</td>
                    <td>3rd</td>
                    <td>8th</td>
                    <td>2017</td>
                    <td>4</td>
                    <td>No</td>
                    <td>Junior</td>
                    <td>Java</td>
                    <td>Pre-Intermediate</td>
                    <td>
                        <div class="dropdown">
                            <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                                Operation <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
                                <li><a href="#">View profile</a></li>
                                <li><a href="#">Send Email</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Remove user</a></li>
                            </ul>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
</body>
</html>
