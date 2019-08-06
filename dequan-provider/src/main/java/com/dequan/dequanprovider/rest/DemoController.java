package com.dequan.dequanprovider.rest;

import com.dequan.common.annotation.log.SystemLog;
import com.dequan.dequanprovider.entity.User;
import com.dequan.dequanprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @SystemLog("获取用户列表")
    public List<User> getUser(){
        return userService.getList();
    }
}
