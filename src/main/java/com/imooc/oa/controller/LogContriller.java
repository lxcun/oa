package com.imooc.oa.controller;

import com.imooc.oa.login.entity.User;
import com.imooc.oa.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 登录和注册类
 */
@EnableAutoConfiguration
@CrossOrigin
@RestController
public class LogContriller {
    @Autowired
    private UserService userService;

    /**
     * 根据传入的信息进行登录
     * @param user
     * @return
     */
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    String userLogin(User user) {
        boolean verify = userService.verifyUser(user);//用户验证
        //如果登录成功，返回结果页面
        if (verify) {
            return "success";
        } //如果登录失败，显示失败
        else {
            return "error";
        }
    }

    /**
     * 根据传入的信息进行注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    @ResponseBody
    String registerUser(User user) {
        return userService.registerUser(user);
    }

}
