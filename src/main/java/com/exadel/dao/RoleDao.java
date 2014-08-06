package com.exadel.dao;

import com.exadel.entity.Role;
import com.exadel.entity.User;

import java.io.Serializable;
import java.util.List;


public interface RoleDao extends GenericDao<Role, Integer>{

    public List<User> getUsersByRole(Integer roleId);


}
