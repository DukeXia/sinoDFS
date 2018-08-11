package com.sinosoft.dfs.controller;

import com.sinosoft.dfs.pojo.User;
import com.sinosoft.dfs.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: controller
 * @Description: user Controller
 * @Author: lsh
 * @CreateDate: 2018/6/23 10:56
 * @Version: 1.0
 */
@RestController
public class UserController {
    @Autowired
    private IuserService userService;


    @RequestMapping("/user/save")
    public String save(String name){
        User user=new User(name);
        userService.save(user);
        return "saved successfully";
    }
    @RequestMapping("/user/get")
    public User get(Long id){
        return userService.get(id);
    }
}
