package com.imooc.oa.login.dao;


import com.imooc.oa.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.security.Permissions;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 通过用户名查找用户信息
     * @param name
     * @return
     */
    public List<User> findByName(String name);

    /**
     * 通过用户名和密码查找用户信息
     * @param name
     * @param password
     * @return
     */
    public List<User> findByNameAndPassword(String name, String password);

    /**
     * 通过name从数据库查找用户信息
     * @param name
     * @return
     */
    //从数据库查询东西
    @Query("from User u where u.name=:name")
    //@param是参数的解释。
    public List<User> findUser(@Param("name") String name);

}