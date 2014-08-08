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
    @Qualifier("studentDao")
    private StudentDao studentDao;

    @Autowired
    @Qualifier("roleDao")
    private RoleDao roleDao;

    private UserDao getUserDao() {
        return userDao;
    }


    private RoleDao getRoleDao() {
        return roleDao;
    }

    @Secured({"ROLE_ADMIN", "ROLE_MODERATOR"})
    @Transactional
    @Override
    public Integer saveUser(UserDTO userDto) {

        List<Integer> rolesId = userDto.getRoles();
        List<Role> roles = new ArrayList<Role>();
        for (Integer id : rolesId) {
            roles.add(getRoleDao().load(id));
        }

        User user = userDto.getUser();
        Integer id = userDao.save(user);
        user.setRoles(roles);
        for (Role role : roles) {
            String roleName = role.getName();
            if ("ROLE_INTERVIEWER".equals(roleName)) {
                Interviewer interviewer = new Interviewer();
                interviewer.setUser(user);
                interviewerDao.save(interviewer);
            }
            if ("ROLE_TUTOR".equals(roleName)) {
                Tutor tutor = new Tutor();
                tutor.setUser(user);
                tutorDao.save(tutor);
            }
            if ("ROLE_STUDENT".equals(roleName)) {
                Student student = new Student();
                student.setUser(user);
                studentDao.save(student);
            }

        }
        return id;

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
    public List<User> getUsersByRole(Integer roleId) {
        return getRoleDao().getUsersByRole(roleId);
    }

}
