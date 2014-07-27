package com.exadel.dao.daoImpl;

import com.exadel.dao.UserDao;
import com.exadel.entity.User;

public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }



}
