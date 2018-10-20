package com.imooc.oa.controller;

import com.imooc.oa.smallclass.dao.SmallClassDao;
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
public class SmallClassControllerTest {
    @Autowired
    private SmallClassController smallClassController;
  //  @Autowired
    //private SmallClassDao smallClassDao;

    @Test
    public void listSmallClass() throws Exception {
    }

    @Test
    public void addSmallClass() throws Exception {
        SmallClass smallClass=new SmallClass();
        smallClass.setSmallClassName("绕线电感");
        smallClassController.addSmallClass(smallClass);
    }

    @Test
    public void updateSmallClass() throws Exception {
        SmallClass smallClass=new SmallClass();
        smallClass.setSmallClassId(1);
        smallClass.setSmallClassName("t电感");
        smallClassController.updateSmallClass(smallClass);
    }

    @Test
    public void deleteSmallClass() throws Exception {
        smallClassController.deleteSmallClass(1);
    }

}