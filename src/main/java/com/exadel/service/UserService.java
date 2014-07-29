package com.exadel.service;


import com.exadel.dao.UserDao;
import com.exadel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public Integer saveUser(User user);
    public List<User> getUserList();
    public void delete(User user);

}
