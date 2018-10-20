package com.imooc.oa.controller;

import com.imooc.oa.login.entity.User;
import com.imooc.oa.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
@Controller

@EnableAutoConfiguration
public class UserController {
/*
    @Autowired
    private UserService userService;

    //直接访问端口跳入此处
    @RequestMapping("/")
    //@RequestMapping后，返回值通常解析为跳转路径。加上@responsebody后，返回结果直接写入HTTP response body中，不会被解析为跳转路径。比如异步请求，希望响应的结果是json数据，那么加上@responsebody后，就会直接返回json数据。
    @ResponseBody
    String welcome() {
        return "welcome my first spring boot project";
    }

    //访问notVerify，当密码错误时显示
    @RequestMapping("/notVerify")
    @ResponseBody
    String notVerify() {
        return "username or password NOT correct";
    }
    //登录
    @RequestMapping("/login")
    String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
    //注册
    @RequestMapping("/register")
    String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    @ResponseBody
    String registerUser(User user, Model model) {
        return userService.registerUser(user);
    }
    //登录显示页面
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    String userLogin(User user, Model model) {
        boolean verify = userService.verifyUser(user);//用户验证
        //如果登录成功，返回结果页面
        if (verify) {
            model.addAttribute("name", user.getName());
            model.addAttribute("password", user.getPassword());
            return "result";
        } //如果登录失败，显示失败
        else {
            return "redirect:/notVerify";
        }
    }*/
    }
