package com.BibliothequeP7.clientui.proxies;

import com.BibliothequeP7.clientui.beans.UserBean;
import com.BibliothequeP7.clientui.configurations.FeignConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "zuul-server", contextId="userProxy", configuration= FeignConfig.class)
@RibbonClient(name = "user")
@Component
public interface UserProxy {


    @GetMapping(value = "/user/{userName}/login")
    UserBean login(@PathVariable String userName);

    @GetMapping(value = "/user/account/{id}/myaccount")
    UserBean getUser(@PathVariable("id") Long id);
    }

