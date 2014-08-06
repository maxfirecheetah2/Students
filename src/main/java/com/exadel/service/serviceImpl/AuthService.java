package com.exadel.service.serviceImpl;

import com.exadel.dao.UserDao;
import com.exadel.entity.Role;
import com.exadel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;


@Service
public class AuthService implements UserDetailsService {

    @Autowired
    @Qualifier("userDao")
    UserDao userDao;

    private UserDao getUserDao(){
        return userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        User user = getUserDao().loadUserByUsername(username);
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();

        System.out.println(user.getLogin() + user.getPassword());

        List<Role>roles = user.getRoles();
        for(Role role : roles){
            System.out.println(role.getName());
            authList.add(new SimpleGrantedAuthority(role.getName()));
        }

        System.out.println(authList.size());



        return new org.springframework.security.core.userdetails.User(
                user.getLogin(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                authList
        );
    }


}
