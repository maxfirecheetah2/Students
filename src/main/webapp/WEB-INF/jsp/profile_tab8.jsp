<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="tab-pane" id="tab8">
    <div class="panel panel-info filterable">
        <div class="panel-body">
            <div class="row user-row">
                <div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">
                    <img class="img-circle"
                         src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
                         alt="User Pic">
                </div>
                <div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
                    <strong>User1</strong><br>
                    <span class="text-muted">User level: Administrator</span>
                </div>
                <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user1">
                    <i class="glyphicon glyphicon-chevron-down text-muted"></i>
                </div>
            </div>
            <div class="row user-infos user1">
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">
                    <textarea class="form-control" disabled>Feedback bla-bla-bla</textarea>
                </div>
            </div>

            <div class="row user-row">
                <div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">
                    <img class="img-circle"
                         src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
                         alt="User Pic">
                </div>
                <div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
                    <strong>User2</strong><br>
                    <span class="text-muted">User level: Administrator</span>
                </div>
                <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".user2">
                    <i class="glyphicon glyphicon-chevron-down text-muted"></i>
                </div>
            </div>
            <div class="row user-infos user2">
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">
                    <form:textarea class="form-control" disabled="true" path=""/>
                </div>
            </div>
        </div>
    </div>
</div>
