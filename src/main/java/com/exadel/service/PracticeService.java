package com.exadel.service;

import com.exadel.entity.Practice;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface PracticeService {

    public Integer savePractice(Practice practice);
    public List<Practice> getPracticeList();
    public void delete(Practice practice);
}
