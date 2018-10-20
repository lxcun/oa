package com.imooc.oa.common.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
//用于指定配置信息的类上加上 @Configuration 注解，以明确指出该类是 Bean 配置的信息源。
@Configuration
//开启事务支持后，然后在访问数据库的Service方法上添加注解 @Transactional 便可。
@EnableTransactionManagement
public class TransacationMangementConfiguration implements TransactionManagementConfigurer {
    @Autowired
    private DataSource dataSource;
//告诉你说下面这个方法是从父类/接口 继承过来的，需要你重写一次，这样就可以方便你阅读，也不怕会忘记
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager(){
        return new DataSourceTransactionManager(dataSource);
    }
}
