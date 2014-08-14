<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div class="col-sm-3 col-md-2 affix-sidebar">
    <div class="sidebar-nav">
        <div class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target=".sidebar-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <span class="visible-xs navbar-brand">Sidebar menu</span>
            </div>
            <div class="navbar-collapse collapse sidebar-navbar-collapse">
                <ul class="nav navbar-nav" id="sidenav01">
                    <li class="active">
                        <a href="#" data-toggle="collapse" data-target="#toggleDemo0" data-parent="#sidenav01"
                           class="collapsed">
                            <h4>
                                <img alt="User Pic"
                                     src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100"
                                     class="img-circle img-responsive">
                                <br/>
                                ${curUser.name} ${curUser.surname}
                                <br>
                                <small>Login as... <span class="caret"></span></small>
                            </h4>
                        </a>
                        <a href="/logout"/><span class="glyphicon glyphicon-log-out"></span> Logout</a>

                        <div class="collapse" id="toggleDemo0" style="height: 0px;">
                            <ul class="nav nav-list">
                                <li><a href="<c:url value="/student/${curUser.id}"/>"><span
                                        class="glyphicon glyphicon-user"></span> View my profile</a></li>
                                <%--<li><a href='<c:url value="/j_spring_security_logout"/>'><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>--%>
                            </ul>
                        </div>
                    </li>

                    <%--<sec:authorize access="hasRole('ROLE_ADMIN')">--%>


                        <li>
                            <a href="#" data-toggle="collapse" data-target="#toggleDemo" data-parent="#sidenav01"
                               id="userCats" class="collapsed">
                                <span class="glyphicon glyphicon-list"></span> User categories<span
                                    class="caret pull-right"></span>
                            </a>


                            <div class="collapse tab" id="toggleDemo" style="height: 0px;">
                                <ul class="nav nav-list">
                                    <sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_TUTOR','ROLE_INTERVIEWER')">
                                    <li><a href='<c:url value="/student/list"/>'><span
                                            class="glyphicon glyphicon-user"></span> Students</a></li>
                                    </sec:authorize>
                                    <sec:authorize access="hasRole('ROLE_TUTOR')">
                                        <%--<li><a href='<c:url value="/tutors"/>'><span--%>
                                                <%--class="glyphicon glyphicon-user"></span> Tutors</a></li>--%>
                                    </sec:authorize>
                                     <sec:authorize access="hasRole('ROLE_ADMIN')">
                                    <li><a href='<c:url value="/tutors"/>'><span
                                            class="glyphicon glyphicon-user"></span> Tutors</a></li>
                                    <li><a href='<c:url value="/interviewers"/>'><span
                                            class="glyphicon glyphicon-user"></span> Interviewers</a></li>
                                    <li><a href='<c:url value="/moderators"/>'><span
                                            class="glyphicon glyphicon-user"></span> Moderators</a></li>
                                    </sec:authorize>

                                </ul>
                            </div>
                        </li>
                        <li>

                            <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <a href="#" data-toggle="collapse" data-target="#toggleDemo2" data-parent="#sidenav01"
                               class="collapsed" id="actions">
                                <span class="glyphicon glyphicon-list"></span> Actions<span
                                    class="caret pull-right"></span>
                            </a>

                            <div class="collapse" id="toggleDemo2" style="height: 0px;">
                                <ul class="nav nav-list">
                                    <li><a href='<c:url value="/user"/>'><span class="glyphicon glyphicon-plus"></span>
                                        Create user</a></li>
                                    <li><a href='<c:url value="/email"/>'><span class="glyphicon glyphicon-envelope"></span>
                                        Send messages</a></li>
                                    <li><a href='<c:url value="/statistics"/>'><span class="glyphicon glyphicon-print"></span>
                                        PDF statistics</a></li>
                                </ul>
                            </div>
                            </sec:authorize>

                        </li>

                        <%--<li><a href="#"><span class="glyphicon glyphicon-envelope"></span> Messages <span--%>
                                <%--class="badge pull-right">42</span></a></li>--%>
                        <%--<li><a href="#"><span class="glyphicon glyphicon-search"></span> Advanced Search</a></li>--%>

                    <%--</sec:authorize>--%>

                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>
</div>




