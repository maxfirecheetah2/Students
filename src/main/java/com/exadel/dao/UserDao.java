package com.exadel.dao;

import com.exadel.entity.Role;
import com.exadel.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends GenericDao<User, Integer> {

    public User loadUserByUsername(String login);

}
