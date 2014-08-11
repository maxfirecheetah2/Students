 <%@ page contentType="text/html;charset=UTF-8" language="java" %>

 <div class="tab-pane" id="tab2">
     <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
         <div class="panel panel-info filterable">
             <div class="panel-heading">
                 <h3 class="panel-title">Education</h3>

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
                                 <td>University</td>
                                 <td><form:input type="text" class="form-control" path="generalInfo.institution" disabled="true"/></td>
                             </tr>
                             <tr>
                                 <td>Faculty</td>
                                 <td><form:input type="text" class="form-control"
                                                 path="generalInfo.faculty" disabled="true"/></td>
                             </tr>
                             <tr>
                                 <td>Specialty</td>
                                 <td><form:input type="text" class="form-control"
                                                 path="generalInfo.speciality" disabled="true"/></td>
                             </tr>
                             <tr>
                                 <td>Course</td>
                                 <td><form:input type="text" class="form-control"
                                                 path="generalInfo.course" disabled="true"/></td>
                             </tr>
                             <tr>
                                 <td>Group</td>
                                 <td><form:input type="text" class="form-control"
                                                 path="generalInfo.group" disabled="true"/></td>
                             </tr>
                             <tr>
                                 <td>Graduation</td>
                                 <td><form:input type="text" class="form-control"
                                                 path="generalInfo.graduationYear" disabled="true"/></td>
                             </tr>


                             </tbody>
                         </table>
                     </div>
                 </div>
             </div>
         </div>
     </div>
 </div>