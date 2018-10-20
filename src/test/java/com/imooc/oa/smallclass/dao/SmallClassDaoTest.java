package com.imooc.oa.smallclass.dao;

import com.imooc.oa.smallclass.entity.SmallClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class SmallClassDaoTest {

    @Autowired
    private SmallClassDao smallClassDao;
    @Test
    public void findBysmallClassName() throws Exception {
        SmallClass oldSmallClass=smallClassDao.findBysmallClassName("df");
        if(oldSmallClass.getSmallClassName()=="df")
           System.out.println(oldSmallClass.getSmallClassName());


    }
    @Test
     public void testAdd() {
        SmallClass smallClass=new SmallClass();
        smallClass.setSmallClassName("ghfj");
        smallClassDao.save(smallClass);
    }

}