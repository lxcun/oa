package com.imooc.oa.controller;


import com.imooc.oa.generalcategory.dao.GeneralCategoryDao;
import com.imooc.oa.generalcategory.entity.GeneralCategory;
import com.imooc.oa.seller.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 物料分类的大类
 */
@EnableAutoConfiguration
@RestController

public class GeneralCategoryController {
    @Autowired
    private GeneralCategoryDao generalCategoryDao;

    /**
     * 获取数据库的大类清单
     * @return
     */
    @RequestMapping(value = "/listgeneralcategory", method = RequestMethod.GET)
    List<GeneralCategory> listGeneralCategory() {
        List<GeneralCategory> list = generalCategoryDao.findAll();
        //  list = materielService.getMaterielList();
        return list;
    }

    /**
     * 根据传入的大类信息添加新的大类
     * @param generalCategory
     * @return
     */
    @RequestMapping(value = "/addgeneralcategory", method = RequestMethod.POST,consumes = "application/json")
    public boolean addGeneralCategory(GeneralCategory generalCategory) {
        GeneralCategory oldGeneralCategory = generalCategoryDao.findByGeneralCategoryName(generalCategory.getGeneralCategoryName());
        if(oldGeneralCategory==null)
            try {
                generalCategoryDao.save(generalCategory);
                return true;
            }catch (Exception ex)
            {
                ex.printStackTrace();
                throw new RuntimeException("插入大类信息失败");
            }
        else
            throw new RuntimeException("已经存在这个大类的信息，若需修改请在修改处");

    }

    /**
     * 根据传入的Id修改大类名称
     * @param list
     * @return
     */
    @RequestMapping(value = "/updategeneralcategory", method = RequestMethod.POST,consumes = "application/json")
    public boolean updateGeneralCategory(GeneralCategory list) {
        try {
            generalCategoryDao.updateGeneralCategoryNameByGeneralCategoryId(list.getGeneralCategoryId(),list.getGeneralCategoryName());
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("更新大类信息失败");
        }
    }

    /**
     * 根据传入的Id删除库存大类
     * @param generalCategoryId
     * @return
     */
    @RequestMapping(value = "/deletegeneralcategory", method = RequestMethod.POST,consumes = "application/json")
    public boolean deleteGeneralCategory(Integer generalCategoryId) {
        try {
            generalCategoryDao.delete(generalCategoryId);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("删除大类失败");
        }
    }
}
