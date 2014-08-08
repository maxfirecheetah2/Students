package com.exadel.util;

import com.exadel.entity.Student;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 08.08.14
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
public class StudentCopier {

    public static void copy(Student s1, Student s2){
        s1.setGeneralInfo(s2.getGeneralInfo());
        s1.setId(s2.getId());
        s1.setUser(s2.getUser());
        s1.setTutors(s2.getTutors());
        s1.setFeedbacks(s2.getFeedbacks());
        s1.setInterviews(s2.getInterviews());
        s1.setPractices(s2.getPractices());
        s1.setProjects(s2.getProjects());
        s1.setGeneralInfo(s2.getGeneralInfo());

    }
}
