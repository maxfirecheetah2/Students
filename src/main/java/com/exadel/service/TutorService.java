package com.exadel.service;

import com.exadel.entity.Feedback;
import com.exadel.entity.Tutor;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface TutorService {

    public Integer saveTutor(Tutor tutor);
    public List<Tutor> getTutorList();
    public void delete(Tutor tutor);

}
