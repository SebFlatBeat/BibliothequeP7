package com.BibliothequeP7.book.proxies;

import com.BibliothequeP7.book.beans.UserBean;
import com.BibliothequeP7.book.configurations.FeignConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zuul-server", contextId="userProxy", configuration= FeignConfig.class, url = "http://localhost:9004" )
@RibbonClient(name = "user")
public interface UserProxy {

   /** @GetMapping(value = "/user/compte/{id}/moncompte")
    UserBean getUser(@PathVariable("id") Long id);*/
}
