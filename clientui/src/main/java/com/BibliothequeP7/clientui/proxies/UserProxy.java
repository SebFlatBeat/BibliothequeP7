package com.BibliothequeP7.clientui.proxies;

import com.BibliothequeP7.clientui.beans.UserBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "zuul-server")
@RibbonClient(name = "user")
public interface UserProxy {

    @GetMapping(value = "/user/{userName}/login")
    UserBean login(@PathVariable String userName);

    @GetMapping(value = "/user/account/{id}/myaccount")
    UserBean getUser(@PathVariable("id") Long id);
    }

