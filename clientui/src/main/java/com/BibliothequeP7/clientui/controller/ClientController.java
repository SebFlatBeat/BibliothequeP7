package com.BibliothequeP7.clientui.controller;

import com.BibliothequeP7.clientui.proxies.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @Autowired
    private UserProxy userProxy;

    @GetMapping("/index")
    public String homePage() {

        return "index";
    }


}
