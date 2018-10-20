package com.imooc.oa.inputmateriel.config.dao;

import com.imooc.oa.common.config.dao.DataSourceConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 配置mybatis mapper的扫描路径
@MapperScan("com.imooc.oa.inputmateriel.dao")
public class InputMaterielDataSourceConfiguration extends DataSourceConfiguration {
}
