package com.exadel.service.serviceImpl;

import com.exadel.dao.ProjectDao;
import com.exadel.entity.Project;
import com.exadel.service.ProjectService;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class ProjectServiceImpl implements ProjectService {

    private ProjectDao projectDao;

    public ProjectDao getProjectDao(){return this.projectDao;}

    @Override
    public Integer saveProject(Project project) {
        return getProjectDao().save(project);
    }

    @Override
    public List<Project> getProjectList() {
        return getProjectDao().getAll();
    }

    @Override
    public void delete(Project project) {
       getProjectDao().delete(project);
    }
}
