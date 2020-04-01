package com.BibliothequeP7.clientui.controller;

import com.BibliothequeP7.clientui.beans.UserBean;
import com.BibliothequeP7.clientui.proxies.BookProxy;
import com.BibliothequeP7.clientui.proxies.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClientController {

    @Autowired
    private UserProxy userProxy;

    @Autowired
    private BookProxy bookProxy;

    @GetMapping(value = {"/","/index"})
    public String index() {

        return "index";
    }

    @GetMapping("/espacePerso")
    public String espacePerso(){

        return "espacePerso";
    }

    @GetMapping("/register")
    public String register(){

        return "register";
    }

    @PostMapping("/registerPost")
    public String registerPost(@ModelAttribute UserBean userBean){
        userProxy.register(userBean);
        return "redirect:/registerSuccess";
    }

}
