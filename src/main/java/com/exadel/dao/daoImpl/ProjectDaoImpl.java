package com.exadel.dao.daoImpl;

import com.exadel.dao.ProjectDao;
import com.exadel.entity.Project;

/**
 * Created by Вадим on 28.07.2014.
 */
public class ProjectDaoImpl extends GenericDaoImpl<Project, Integer> implements ProjectDao {

    public ProjectDaoImpl() {
        super(Project.class);
    }
}
