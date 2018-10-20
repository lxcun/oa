package com.imooc.oa.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户实体类
 */
@Entity
public class User {
    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键
    @GeneratedValue
    private Long id;
//Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    @Column(nullable = false)
    private String name;//用户名

    @Column(nullable = false)
    private String password;//密码

    @Column(nullable = true)
    private String userIdentity;//用户身份/权限

    @Column(nullable = true)
    private String mail;//用户邮箱

    @Column(nullable=true)
    private  String department;//用户部门

    public User() {}

    public User(String name, String password,String userIdentity,String mail,String department) {
        this.name = name;
        this.password = password;
        this.userIdentity=userIdentity;
        this.mail=mail;
        this.department=department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
