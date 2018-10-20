package com.imooc.oa.controller;

import com.imooc.oa.seller.entity.Seller;
import com.imooc.oa.smallclass.dao.SmallClassDao;
import com.imooc.oa.smallclass.entity.SmallClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 物料小类的增删改查
 */
@EnableAutoConfiguration
@RestController

public class SmallClassController {
    @Autowired
    private SmallClassDao smallClassDao;

    /**
     * 查询库存的物料小类信息
     * @return
     */
    @RequestMapping(value = "/listsmallClass", method = RequestMethod.GET)
    List<SmallClass> listSmallClass() {
        List<SmallClass> list = smallClassDao.findAll();
        //  list = materielService.getMaterielList();
        return list;
    }

    /**
     * 增加新的物料小类
     * @param smallClass
     * @return
     */
    @RequestMapping(value = "/addsmallClass", method = RequestMethod.GET)
    public boolean addSmallClass(SmallClass smallClass) {
        SmallClass oldSmallClass=smallClassDao.findBysmallClassName(smallClass.getSmallClassName());
        if(oldSmallClass==null)
        {
            try {
            smallClassDao.save(smallClass);
                //throw new RuntimeException("插入产品小类成功");
            return true;
             }catch (Exception ex)
            {
                ex.printStackTrace();
                throw new RuntimeException("插入产品小类失败");
            }
        }
        else
            throw new RuntimeException("已经存在这个小类的信息，若需修改请在修改处");
        }

    /**
     * 根据传入的信息进行物料库存小类信息的修改
     * @param list
     * @return
     */
    @RequestMapping(value = "/updatesmallClass", method = RequestMethod.POST,consumes = "application/json")
    public boolean updateSmallClass(SmallClass list) {
        try {
            smallClassDao.updateSmallClassNameBysmallClassId(list.getSmallClassId(),list.getSmallClassName());
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("修改小类失败");
        }
    }

    /**
     * 根据传入的物料小类Id进行库存小类的删除
     * @param smallClassId
     * @return
     */
    @RequestMapping(value = "/deletesmallClass", method = RequestMethod.POST,consumes = "application/json")
    public boolean deleteSmallClass(Integer smallClassId) {
        try {
            smallClassDao.delete(smallClassId);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("删除小类失败");
        }
    }

}
