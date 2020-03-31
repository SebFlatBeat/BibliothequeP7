package com.BibliothequeP7.clientui.proxies;

import com.BibliothequeP7.clientui.beans.UserBean;
import com.BibliothequeP7.clientui.configurations.FeignConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "zuul-server", contextId="userProxy", configuration= FeignConfig.class, url = "http://localhost:9004")
@RibbonClient(name = "user")
@Component
public interface UserProxy {

    @GetMapping(value = "/user/{username}/login")
    UserBean login(@PathVariable String username);

    @PostMapping(value = "/user/registerPost")
    UserBean register(@RequestBody UserBean userBean);

    }

