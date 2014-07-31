package com.exadel.service;

import com.exadel.entity.Project;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface ProjectService {

    public Integer saveProject(Project project);
    public List<Project> getProjectList();
    public void delete(Project project);
}
