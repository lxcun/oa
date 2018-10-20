package com.imooc.oa.login.config.dao.impl;

public class UserRepositoryImpl {
    public Integer personnelIdentification(String userIdentity){
         Integer permissions;
        if( userIdentity=="ordinaryStaff")//普通员工
        { permissions=0;}
        else if(userIdentity=="purchaser")//购买者
        {  permissions=1;}
        else if( userIdentity=="projectDirector")//项目主管
        { permissions=2;}
        else if(userIdentity=="warehousing")//仓库管理人员
        {  permissions=3;}
        else if(userIdentity=="propertymanager")//财物管理人员
        {  permissions=4;}
        else if(userIdentity=="departmentHead")//部门主管
        {  permissions=5;}
        else if(userIdentity=="deputyGeneral")//副总经理
        {  permissions=6;}
        else if(userIdentity=="generalManager")//总经理
        {  permissions=7;}
        else if(userIdentity=="chairman ")//董事长
        {  permissions=8;}
        else
        {  permissions=9;}
        return  permissions;
    }
}
