package com.BibliothequeP7.user.controller;

import com.BibliothequeP7.user.dao.UserDao;
import com.BibliothequeP7.user.entities.UserBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/all-account")
    public List<UserBook> userBookList (){
        List<UserBook> userBooks = userDao.findAll();

        return userBooks;
    }

    @GetMapping("/{userName}/login")
    public Optional<UserBook> login (@PathVariable String userName){
       Optional<UserBook> userBook = userDao.findByUserName(userName);
        return userBook;
    }

    @PostMapping(value = "/register")
    public UserBook register() {
        UserBook newUserBook = new UserBook();
        userDao.save(newUserBook);
        return newUserBook;
    }


}
