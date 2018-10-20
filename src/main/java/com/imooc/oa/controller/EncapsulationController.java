package com.imooc.oa.controller;

import com.imooc.oa.encapsulation.dao.EncapsulationDao;
import com.imooc.oa.encapsulation.entity.Encapsulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 封装形式的增删改查
 */
@EnableAutoConfiguration
@RestController
public class EncapsulationController {
    @Autowired
    private EncapsulationDao encapsulationDao;

    /**
     * 查询数据库中所有的封装形式
     * @return为一个封装形式的list
     */
    @RequestMapping(value = "/listencapsulation", method = RequestMethod.GET)
    List<Encapsulation> listEncapsulation() {
        List<Encapsulation> list = encapsulationDao.findAll();
        //  list = materielService.getMaterielList();
        return list;
    }

    /**
     * @param encapsulation
     * 添加新的封装形式，自动识别库里是否有相应的封装形式，没有就添加，有就不能添加
     * 需要传递新的封装过来
     * @return
     */
    @RequestMapping(value = "/addencapsulation", method = RequestMethod.POST,consumes = "application/json")
    public boolean addEncapsulation(Encapsulation encapsulation) {
        Encapsulation oldEncapsulation = encapsulationDao.findByEncapsulationName(encapsulation.getEncapsulationName());
        if(oldEncapsulation==null)
            try {
                encapsulationDao.save(encapsulation);
                return true;
            }catch (Exception ex)
            {
                ex.printStackTrace();
                throw new RuntimeException("插入封装形式信息失败");
            }
        else
            throw new RuntimeException("已经存在这个封装形式的信息，若需修改请在修改处");

    }

    /**
     * @param list
     * 传一个封装信息过来，对对应的ID和名字进行库存封装的修改
     * @return
     */
    @RequestMapping(value = "/updateencapsulation", method = RequestMethod.POST,consumes = "application/json")
    public boolean updateEncapsulation(Encapsulation list) {
        try {
            encapsulationDao.updatEencapsulationNameByEncapsulationId(list.getEncapsulationId(),list.getEncapsulationName());
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("更新封装形式信息失败");
        }
    }

    /**
     * @param encapsulationId
     * 根据传递的Id删除相应的库存封装
     * @return
     */
    @RequestMapping(value = "/deleteencapsulation", method = RequestMethod.POST,consumes = "application/json")
    public boolean deleteEncapsulation(Integer encapsulationId) {
        try {
            encapsulationDao.delete(encapsulationId);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("删除封装形式失败");
        }
    }
}
