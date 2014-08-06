package com.exadel.dao.daoImpl;

import com.exadel.dao.ProjectDao;
import com.exadel.dao.RoleDao;
import com.exadel.entity.Project;
import com.exadel.entity.Role;
import com.exadel.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;

import java.util.List;

public class RoleDaoImpl extends GenericDaoImpl<Role, Integer> implements RoleDao {

    public RoleDaoImpl() {
        super(Role.class);
    }


    @Override
    public List<User> getUsersByRole(Integer roleId) {
        Role role = get(roleId);
        Hibernate.initialize(role.getUsers());
        return role.getUsers();
    }
}
