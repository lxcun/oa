package com.imooc.oa;

import com.imooc.oa.common.createmysql.CreatManagementTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class OaApplication {
	public static void main(String[] args) {
		CreatManagementTable creatManagementTable=new CreatManagementTable();
		String tableName = "store_management";
		Connection con = null;
		// 获得数据库连接
		con = creatManagementTable.getConnection();
		System.out.println();
		// 创建表
		creatManagementTable.Create_Data(con, tableName);
		SpringApplication.run(OaApplication.class, args);
	}
}
