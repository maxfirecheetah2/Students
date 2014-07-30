package com.exadel.dao.daoImpl;

import com.exadel.dao.UserDao;
import com.exadel.entity.User;
import org.hibernate.Criteria;

public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }


    @Override
    public User loadUserByUsername(String login) {
        String hql = "select user from User user where user.login = :login";
        return (User) getCurrentSession().createQuery(hql)
                .setString("login", login)
                .uniqueResult();

    }


}
