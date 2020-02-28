package com.BibliothequeP7.clientui.service;


import com.BibliothequeP7.clientui.beans.UserBean;
import com.BibliothequeP7.clientui.proxies.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserBookService implements UserDetailsService {
    @Autowired
    UserProxy userProxy;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserBean userBook = userProxy.login(userName);

        if (userBook != null){
            return (UserDetails) userBook;
        }else{
            throw new UsernameNotFoundException(String.format("Username[%s] not found"));
        }
    }
}
