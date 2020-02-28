package com.BibliothequeP7.clientui.controller;

import com.BibliothequeP7.clientui.beans.UserBean;
import com.BibliothequeP7.clientui.proxies.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ClientController {

    @Autowired
    private UserProxy userProxy;

    @GetMapping("/index")
    public String homePage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();

        Long idSession = (Long) session.getAttribute("id");

        if (session.getAttribute("id") != null ) {
            UserBean user = userProxy.getUser(idSession);
            model.addAttribute("user", user);
        }
        return "index";
    }


}
