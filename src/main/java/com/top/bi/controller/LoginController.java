package com.top.bi.controller;

import com.top.bi.entity.User;
import com.top.bi.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    private LoginService loginService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
