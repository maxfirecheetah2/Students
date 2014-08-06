package com.exadel.dao.daoImpl;

import com.exadel.dao.ProjectDao;
import com.exadel.dao.RoleDao;
import com.exadel.entity.Project;
import com.exadel.entity.Role;

public class RoleDaoImpl extends GenericDaoImpl<Role, Integer> implements RoleDao {

    public RoleDaoImpl() {
        super(Role.class);
    }


}
