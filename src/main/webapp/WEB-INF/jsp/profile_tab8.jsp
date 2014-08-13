<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="tab-pane" id="tab8">
    <div class="panel panel-info filterable">
        <div class="panel-body">
        <c:forEach items="${feedbacks}" var="feedback">
            <div class="row user-row">
                <div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">
                    <img class="img-circle"
                         src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"
                         alt="User Pic">
                </div>
                <div class="col-xs-8 col-sm-9 col-md-10 col-lg-10">
                    <strong><c:out value="${feedback.tutor}"/></strong><br>
                    <span class="text-muted">Feedback Date: <c:out value="${feedback.date}"/></span>
                </div>
                <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for="<c:out value="${feedback.id}"/>">
                    <i class="glyphicon glyphicon-chevron-down text-muted"></i>
                </div>
            </div>
            <div class="row user-infos <c:out value="${feedback.id}"/>">
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-xs-offset-0 col-sm-offset-0 col-md-offset-1 col-lg-offset-1">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="skill">Real Project:</label>
                            <input id="skill" class="form-control" disabled value="<c:out value="${feedback.realPrj}"/>">
                        </div>
                        <div class="form-group">
                            <label for="skill2">Professional Progress:</label>
                            <input id="skill2" class="form-control" disabled value="<c:out value="${feedback.profProgress}"/>">
                        </div>
                        <div class="form-group">
                            <label for="skill3">Sociability:</label>
                            <input id="skill3" class="form-control" disabled value="<c:out value="${feedback.sociability}"/>">
                        </div>
                        <div class="form-group">
                            <label for="skill5">Billable:</label>
                            <input id="skill5" class="form-control" disabled value="<c:out value="${feedback.billable}"/>">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="feedback">Feedback:</label>
                        <textarea id="feedback" class="form-control" disabled><c:out value="${feedback.text}"/></textarea>
                    </div>
                </div>
            </div>
        </c:forEach>
        </div>
    </div>
</div>
