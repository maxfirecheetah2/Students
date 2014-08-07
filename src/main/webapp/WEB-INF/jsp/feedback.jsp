<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>FeedbackForm</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <div class="well well-sm">
                <form>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="aptitude">
                                    Aptitude
                                </label>
                                <input type="text" class="form-control" id="aptitude" placeholder="Type here"/>
                            </div>
                            <div class="form-group">
                                <label for="attitude">
                                    Attitude to work
                                </label>
                                <input type="text" class="form-control" id="attitude" placeholder="Type here"/>
                            </div>
                            <div class="form-group">
                                <label for="sociability">
                                    Sociability
                                </label>
                                <input type="text" class="form-control" id="sociability" placeholder="Type here"/>
                            </div>
                            <div class="form-group">
                                <label for="progress">
                                    Progress in professional questions
                                </label>
                                <input type="text" class="form-control" id="progress" placeholder="Type here"/>
                            </div>
                            <div class="form-group">
                                <label for="hours">
                                    Do need more work hours
                                </label>

                                <div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <input type="radio" name="options" id="option1"> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <input type="radio" name="options" id="option2"> NO
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="project">
                                    Working on project right now?
                                </label>

                                <div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <input type="radio" name="options" id="option1"> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <input type="radio" name="options" id="option2"> NO
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="project">
                                    Billable
                                </label>

                                <div class="bs-example">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary">
                                            <input type="radio" name="options" id="option1"> YES
                                        </label>
                                        <label class="btn btn-primary">
                                            <input type="radio" name="options" id="option2"> NO
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="feedback">
                                    Feedback
                                </label>
                                <textarea name="message" id="feedback" class="form-control" rows="9" cols="25"
                                          placeholder="Feedback"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="date">
                                    Date
                                </label>
                                <input type="date" class="form-control" id="date" placeholder="Enter date here"/>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary pull-right" id="btnContactUs">
                                Send Feedback
                            </button>
                        </div>

                    </div>
                </form>
            </div>
        </div>
        <div class="col-md-12 ">
            <form>
                <h3><span class="glyphicon glyphicon-user"></span> Student info</h3>
                <hr/>
                <address>
                    <strong>Aaron Ramsey</strong><br>
                    BSU, FAMCS<br>
                    3rd course, 8th group<br/>
                    Application Math <br/>
                    Graduation: 2017 <br/><br/>
                    <strong>Curators:</strong><br/>
                    Arsene Wenger<br/>
                    Mikel Arteta<br/>
                </address>
            </form>
        </div>
    </div>
</div>
</body>
</html>
