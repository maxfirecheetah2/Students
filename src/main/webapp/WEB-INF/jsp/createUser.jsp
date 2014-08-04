<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<title>Create User</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style type="text/css">
    body {
        background-color: #f8f8f8;
    }

    @media (min-width: 768px) {
        .affix-content .container {
            width: 700px;
        }


        .affix-content .container .page-header {
            margin-top: 0;
        }

        .affix-sidebar {
            padding-right: 0;
            font-size: small;
            padding-left: 0;
        }

        .affix-row, .affix-container, .affix-content {
            height: 100%;
            overflow: scroll;
            margin-left: 0;
            margin-right: 0;
        }

        .affix-content {
            background-color: white;
        }

        .sidebar-nav .navbar .navbar-collapse {
            padding: 0;
            max-height: none;
        }

        .sidebar-nav .navbar {
            border-radius: 0;
            margin-bottom: 0;
            border: 0;
        }

        .sidebar-nav .navbar ul {
            float: none;
            display: block;
        }

        .sidebar-nav .navbar li {
            float: none;
            display: block;
        }

        .sidebar-nav .navbar li a {
            padding-top: 12px;
            padding-bottom: 12px;
        }
    }

    @media (min-width: 769px) {
        .affix-content .container {
            width: 600px;
        }

        .affix-content .container .page-header {
            margin-top: 0;
        }
    }

    @media (min-width: 992px) {
        .affix-content .container {
            width: 900px;
        }

        .affix-content .container .page-header {
            margin-top: 0;
        }
    }

    @media (min-width: 1220px) {
        .affix-row {
            overflow: hidden;
        }

        .affix-content {
            overflow: auto;
        }

        .affix-content .container {
            width: 1000px;
        }

        .affix-content .container .page-header {
            margin-top: 0;
        }

        .affix-content {
            padding-right: 30px;
            padding-left: 30px;
        }

        .affix-title {
            border-bottom: 1px solid #ecf0f1;
            padding-bottom: 10px;
        }

        .navbar-nav {
            margin: 0;
        }

        .navbar-collapse {
            padding: 0;
        }

        .sidebar-nav .navbar li a:hover {
            background-color: #428bca;
            color: white;
        }

        .sidebar-nav .navbar li a > .caret {
            margin-top: 8px;
        }
    }
</style>
<style type="text/css">
    /*!
* bootstrap-select v1.5.4
* http://silviomoreto.github.io/bootstrap-select/
*
* Copyright 2013 bootstrap-select
* Licensed under the MIT license
*/ .bootstrap-select.btn-group:not(.input-group-btn), .bootstrap-select.btn-group[class*="span"] {
    float: none;
    display: inline-block;
    margin-bottom: 10px;
    margin-left: 0;
}

.form-search .bootstrap-select.btn-group, .form-inline .bootstrap-select.btn-group, .form-horizontal .bootstrap-select.btn-group {
    margin-bottom: 0;
}

.bootstrap-select.form-control {
    margin-bottom: 0;
    padding: 0;
    border: 0;
}

.bootstrap-select.btn-group.pull-right, .bootstrap-select.btn-group[class*="span"].pull-right, .row-fluid .bootstrap-select.btn-group[class*="span"].pull-right {
    float: right;
}

.input-append .bootstrap-select.btn-group {
    margin-left: -1px;
}

.input-prepend .bootstrap-select.btn-group {
    margin-right: -1px;
}

.bootstrap-select:not([class*="span"]):not([class*="col-"]):not([class*="form-control"]):not(.input-group-btn) {
    width: 220px;
}

.bootstrap-select {
    width: 220px\0;
}

.bootstrap-select.form-control:not([class*="span"]) {
    width: 100%;
}

.bootstrap-select > .btn {
    width: 100%;
    padding-right: 25px;
}

.error .bootstrap-select .btn {
    border: 1px solid #b94a48;
}

.bootstrap-select.show-menu-arrow.open > .btn {
    z-index: 2051;
}

.bootstrap-select .btn:focus {
    outline: thin dotted #333 !important;
    outline: 5px auto -webkit-focus-ring-color !important;
    outline-offset: -2px;
}

.bootstrap-select.btn-group .btn .filter-option {
    display: inline-block;
    overflow: hidden;
    width: 100%;
    float: left;
    text-align: left;
}

.bootstrap-select.btn-group .btn .caret {
    position: absolute;
    top: 50%;
    right: 12px;
    margin-top: -2px;
    vertical-align: middle;
}

.bootstrap-select.btn-group > .disabled, .bootstrap-select.btn-group .dropdown-menu li.disabled > a {
    cursor: not-allowed;
}

.bootstrap-select.btn-group > .disabled:focus {
    outline: none !important;
}

.bootstrap-select.btn-group[class*="span"] .btn {
    width: 100%;
}

.bootstrap-select.btn-group .dropdown-menu {
    min-width: 100%;
    z-index: 2000;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}

.bootstrap-select.btn-group .dropdown-menu.inner {
    position: static;
    border: 0;
    padding: 0;
    margin: 0;
    -webkit-border-radius: 0;
    -moz-border-radius: 0;
    border-radius: 0;
    -webkit-box-shadow: none;
    -moz-box-shadow: none;
    box-shadow: none;
}

.bootstrap-select.btn-group .dropdown-menu dt {
    display: block;
    padding: 3px 20px;
    cursor: default;
}

.bootstrap-select.btn-group .div-contain {
    overflow: hidden;
}

.bootstrap-select.btn-group .dropdown-menu li {
    position: relative;
}

.bootstrap-select.btn-group .dropdown-menu li > a.opt {
    position: relative;
    padding-left: 35px;
}

.bootstrap-select.btn-group .dropdown-menu li > a {
    cursor: pointer;
}

.bootstrap-select.btn-group .dropdown-menu li > dt small {
    font-weight: normal;
}

.bootstrap-select.btn-group.show-tick .dropdown-menu li.selected a i.check-mark {
    position: absolute;
    display: inline-block;
    right: 15px;
    margin-top: 2.5px;
}

.bootstrap-select.btn-group .dropdown-menu li a i.check-mark {
    display: none;
}

.bootstrap-select.btn-group.show-tick .dropdown-menu li a span.text {
    margin-right: 34px;
}

.bootstrap-select.btn-group .dropdown-menu li small {
    padding-left: .5em;
}

.bootstrap-select.btn-group .dropdown-menu li:not(.disabled) > a:hover small, .bootstrap-select.btn-group .dropdown-menu li:not(.disabled) > a:focus small, .bootstrap-select.btn-group .dropdown-menu li.active:not(.disabled) > a small {
    color: #64b1d8;
    color: rgba(255,255,255,0.4);
}

.bootstrap-select.btn-group .dropdown-menu li > dt small {
    font-weight: normal;
}

.bootstrap-select.show-menu-arrow .dropdown-toggle:before {
    content: '';
    display: inline-block;
    border-left: 7px solid transparent;
    border-right: 7px solid transparent;
    border-bottom: 7px solid #CCC;
    border-bottom-color: rgba(0,0,0,0.2);
    position: absolute;
    bottom: -4px;
    left: 9px;
    display: none;
}

.bootstrap-select.show-menu-arrow .dropdown-toggle:after {
    content: '';
    display: inline-block;
    border-left: 6px solid transparent;
    border-right: 6px solid transparent;
    border-bottom: 6px solid white;
    position: absolute;
    bottom: -4px;
    left: 10px;
    display: none;
}

.bootstrap-select.show-menu-arrow.dropup .dropdown-toggle:before {
    bottom: auto;
    top: -3px;
    border-top: 7px solid #ccc;
    border-bottom: 0;
    border-top-color: rgba(0,0,0,0.2);
}

.bootstrap-select.show-menu-arrow.dropup .dropdown-toggle:after {
    bottom: auto;
    top: -3px;
    border-top: 6px solid #fff;
    border-bottom: 0;
}

.bootstrap-select.show-menu-arrow.pull-right .dropdown-toggle:before {
    right: 12px;
    left: auto;
}

.bootstrap-select.show-menu-arrow.pull-right .dropdown-toggle:after {
    right: 13px;
    left: auto;
}

.bootstrap-select.show-menu-arrow.open > .dropdown-toggle:before, .bootstrap-select.show-menu-arrow.open > .dropdown-toggle:after {
    display: block;
}

.bootstrap-select.btn-group .no-results {
    padding: 3px;
    background: #f5f5f5;
    margin: 0 5px;
}

.bootstrap-select.btn-group .dropdown-menu .notify {
    position: absolute;
    bottom: 5px;
    width: 96%;
    margin: 0 2%;
    min-height: 26px;
    padding: 3px 5px;
    background: #f5f5f5;
    border: 1px solid #e3e3e3;
    box-shadow: inset 0 1px 1px rgba(0,0,0,0.05);
    pointer-events: none;
    opacity: .9;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}

.mobile-device {
    position: absolute;
    top: 0;
    left: 0;
    display: block !important;
    width: 100%;
    height: 100% !important;
    opacity: 0;
}

.bootstrap-select.fit-width {
    width: auto !important;
}

.bootstrap-select.btn-group.fit-width .btn .filter-option {
    position: static;
}

.bootstrap-select.btn-group.fit-width .btn .caret {
    position: static;
    top: auto;
    margin-top: -1px;
}

.control-group.error .bootstrap-select .dropdown-toggle {
    border-color: #b94a48;
}

.bootstrap-select-searchbox, .bootstrap-select .bs-actionsbox {
    padding: 4px 8px;
}

.bootstrap-select .bs-actionsbox {
    float: left;
    width: 100%;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}

.bootstrap-select-searchbox + .bs-actionsbox {
    padding: 0 8px 4px;
}

.bootstrap-select-searchbox input {
    margin-bottom: 0;
}

.bootstrap-select .bs-actionsbox .btn-group button {
    width: 50%;
}


</style>
<script type="text/javascript">
    window.onload = function () {
        $('.selectpicker').selectpicker();
        $('.rm-mustard').click(function () {
            $('.remove-example').find('[value=Mustard]').remove();
            $('.remove-example').selectpicker('refresh');
        });
        $('.rm-ketchup').click(function () {
            $('.remove-example').find('[value=Ketchup]').remove();
            $('.remove-example').selectpicker('refresh');
        });
        $('.rm-relish').click(function () {
            $('.remove-example').find('[value=Relish]').remove();
            $('.remove-example').selectpicker('refresh');
        });
        $('.ex-disable').click(function () {
            $('.disable-example').prop('disabled', true);
            $('.disable-example').selectpicker('refresh');
        });
        $('.ex-enable').click(function () {
            $('.disable-example').prop('disabled', false);
            $('.disable-example').selectpicker('refresh');
        });

        // scrollYou
        $('.scrollMe .dropdown-menu').scrollyou();

        prettyPrint();
    };
</script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.5.4/bootstrap-select.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <h2>Create User</h2>
        <hr />
        <div class="col-sm-9 col-md-10">
            <select class="selectpicker">
                <option>Student</option>
                <option>Tutor</option>
                <option>Moderator</option>
            </select>
        </div>
        <div class="col-md-8">
            <table class="table table-user-information">
                <thead>
                Basic user information:
                </thead>
                <tbody class="filters">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" class="form-control" value=""></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" class="form-control" value=""></td>
                </tr>
                <tr>
                    <td>Skype:</td>
                    <td><input type="text" class="form-control" value=""></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" class="form-control" value="" /></td>
                </tr>
                </tbody>
            </table>
            <button type="button" class="btn btn-primary pull-right">Create</button>
        </div>
    </div>
</div>
</body>
</html>