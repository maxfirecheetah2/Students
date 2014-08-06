package com.exadel.service.serviceImpl;

import com.exadel.dao.*;
import com.exadel.dao.daoImpl.UserDaoImpl;
import com.exadel.entity.*;
import com.exadel.entity.dto.UserDTO;
import com.exadel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired
    @Qualifier("interviewerDao")
    private InterviewerDao interviewerDao;

    @Autowired
    @Qualifier("tutorDao")
    private TutorDao tutorDao;

    @Autowired
    @Qualifier("roleDao")
    private RoleDao roleDao;

    private UserDao getUserDao(){
        return userDao;
    }


    private RoleDao getRoleDao(){
        return roleDao;
    }

    @Secured({"ROLE_ADMIN", "ROLE_MODERATOR"})
    @Transactional
    @Override
    public Integer saveUser(UserDTO userDto){

        List<Integer> rolesId = userDto.getRoles();
        List<Role> roles = new ArrayList<Role>();
        for(Integer id : rolesId){
            roles.add(getRoleDao().load(id));
        }
        User user = userDto.getUser();
        user.setRoles(roles);

        getUserDao().save(userDto.getUser());
        interviewerDao.save((Interviewer)user);
        tutorDao.save((Tutor)user) ;
        return 0;

    }

    @Transactional
    @Override
    @Secured({"ROLE_ADMIN", "ROLE_MODERATOR"})
    public List<User> getUserList() {
        return getUserDao().getAll();
    }

    @Transactional
    @Override
    @Secured({"ROLE_ADMIN", "ROLE_MODERATOR"})
    public void delete(User user) {
        getUserDao().delete(user);
    }


    @Transactional
    @Override
    public User getUserByLogin(String login) {
        return getUserDao().loadUserByUsername(login);
    }

    @Override
    @Transactional
    public List<User> getUsersByRole(Integer roleId){
        return getRoleDao().getUsersByRole(roleId);
    }

}
