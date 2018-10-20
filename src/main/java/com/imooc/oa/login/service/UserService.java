package com.imooc.oa.login.service;

import com.imooc.oa.login.dao.UserRepository;
import com.imooc.oa.login.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 用户登录，验证用户名和密码是否正确
     * @param user
     * @return
     */
    //验证用户
    public boolean verifyUser(User user) {
     //两者相同，返回true，否则返回false
        if (userRepository.findByNameAndPassword(user.getName(), user.getPassword()).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 注册用户
     * @param user
     * @return
     */
    //注测用户
    public String registerUser(User user) {
        if (userRepository.findByName(user.getName()).isEmpty()) {
            userRepository.save(user);
            return "用户名  " + user.getName() + " 注册成功";

        } else {

            return "用户名 " + user.getName() + "已被占用！";
        }
    }
    //确定用户可以访问的页面

}
