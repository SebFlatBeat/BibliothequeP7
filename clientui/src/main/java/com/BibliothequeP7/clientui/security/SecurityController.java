package com.BibliothequeP7.clientui.security;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    /**
     *
     * @return redirect:/index"
     */
    @GetMapping("/login?logout")
    public String logout() {

        return "redirect:/index";
    }


    @GetMapping("/login")
    public String login() {

        return "login";
    }

}
