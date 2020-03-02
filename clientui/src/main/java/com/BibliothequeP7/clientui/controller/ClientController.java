package com.BibliothequeP7.clientui.controller;

import com.BibliothequeP7.clientui.beans.UserBean;
import com.BibliothequeP7.clientui.proxies.UserProxy;
import com.BibliothequeP7.clientui.service.UserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClientController {

    @Autowired
    private UserProxy userProxy;

    @GetMapping("/index")
    public String homePage() {

        return "index";
    }

    @GetMapping("/espacePerso")
    public String spaceHome(){

        return "espacePerso";
    }


}
