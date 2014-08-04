package com.exadel.dao.daoImpl;

import com.exadel.dao.UserDao;
import com.exadel.entity.Role;
import com.exadel.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }


    @Override
    @Transactional
    public User loadUserByUsername(String login) {

        String hql = "select user from User user where user.login = :login";
        User user = (User) getCurrentSession().createQuery(hql)
                .setString("login", login)
                .uniqueResult();
        Hibernate.initialize(user.getRoles());
        return user;
    }




}
