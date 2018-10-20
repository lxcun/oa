package com.imooc.oa.controller;

import com.imooc.oa.generalcategory.dao.GeneralCategoryDao;
import com.imooc.oa.generalcategory.entity.GeneralCategory;
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
public class GeneralCategoryControllerTest {
    @Autowired
    private GeneralCategoryController generalCategoryController;
    @Test
    public void addGeneralCategory() throws Exception {
        GeneralCategory generalCategory=new GeneralCategory();
        generalCategory.setGeneralCategoryName("有源器件");
        generalCategoryController.addGeneralCategory(generalCategory);
    }

    @Test
    public void updateGeneralCategory() throws Exception {
        GeneralCategory generalCategory=new GeneralCategory();
        generalCategory.setGeneralCategoryId(1);
        generalCategory.setGeneralCategoryName("有源器件1");
        generalCategoryController.updateGeneralCategory(generalCategory);
    }

    @Test
    public void deleteGeneralCategory() throws Exception {
        generalCategoryController.deleteGeneralCategory(1);
    }

}