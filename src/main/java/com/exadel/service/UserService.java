package com.exadel.service;


import com.exadel.dao.UserDao;
import com.exadel.entity.Role;
import com.exadel.entity.User;
import com.exadel.entity.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public Integer saveUser(UserDTO userDto);
    public List<User> getUserList();
    public void delete(User user);
    public User getUserByLogin(String login);

}
