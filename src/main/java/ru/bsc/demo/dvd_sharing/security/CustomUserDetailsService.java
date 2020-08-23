package ru.bsc.demo.dvd_sharing.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.bsc.demo.dvd_sharing.dao.model.User;
import ru.bsc.demo.dvd_sharing.dao.repository.UserRepository;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository ur;

    @Autowired
    public CustomUserDetailsService(UserRepository ur) {
        this.ur = ur;
    }


    @Override
    public UserDetails loadUserByUsername(String username) {
        User user;
        try {
            if ((user = ur.getFirstByUsername(username)) != null) {
                return new org.springframework.security.core.userdetails.User(user.getUsername(), "{noop}" + user.getPassword(), true, true, true
                        , true,new ArrayList<>());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new UsernameNotFoundException(username);
    }
}

