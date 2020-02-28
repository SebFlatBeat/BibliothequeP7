package com.BibliothequeP7.user.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    /**
     *
     * @return redirect:/index"
     */
    @RequestMapping("/login?logout")
    public String logout() {
        return "redirect:/index";
    }

    /**
     *
     * @return redirect:/index
     */
    @RequestMapping("/login")
    public String login() {
        return "redirect:/index";
    }

}
