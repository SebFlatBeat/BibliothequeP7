package com.BibliothequeP7.user.service;

import com.BibliothequeP7.user.dao.UserDao;
import com.BibliothequeP7.user.entities.UserBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserBookService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<UserBook> userBook = userDao.findByUserName(userName);

        if (userBook.isPresent()){
            return (UserDetails) userBook.get();
        }else{
            throw new UsernameNotFoundException(String.format("Username[%s] not found"));
        }
    }
}
