package com.exadel.service;

import com.exadel.entity.Mark;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface MarkService {

    public Integer saveMark(Mark mark);
    public List<Mark> getMarkList();
    public void delete(Mark mark);
}
