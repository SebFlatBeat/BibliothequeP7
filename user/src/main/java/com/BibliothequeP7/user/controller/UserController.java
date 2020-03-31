package com.BibliothequeP7.user.controller;

import com.BibliothequeP7.user.dao.UserDao;
import com.BibliothequeP7.user.entities.UserBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @GetMapping("/{username}/login")
    public Optional<UserBook> login (@PathVariable String username){
       Optional<UserBook> userBook = userDao.findByUsername(username);
        return userBook;
    }

    @PostMapping(value = "/registerPost")
    public UserBook register(@RequestBody UserBook userBook) {
        userDao.save(userBook);
        return userBook;
    }


}
