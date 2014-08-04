package com.exadel.service.serviceImpl;

import com.exadel.dao.UserDao;
import com.exadel.dao.daoImpl.UserDaoImpl;
import com.exadel.entity.User;
import com.exadel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    private UserDao getUserDao(){
        return userDao;
    }

    @Override
    @Transactional
    public Integer saveUser(User user){
        return getUserDao().save(user);
    }

    @Override
    @Transactional
    public List<User> getUserList() {
        return getUserDao().getAll();
    }

    @Override
    @Transactional
    public void delete(User user) {
        getUserDao().delete(user);
    }

    @Override
    @Transactional
    public User getUserByLogin(String login) {
        return getUserDao().loadUserByUsername(login);
    }


}
