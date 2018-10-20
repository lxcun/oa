package com.imooc.oa.controller;
import com.imooc.oa.manufacturer.dao.ManufacturerDao;
import com.imooc.oa.manufacturer.entity.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *生产商增删改查类
 */
@EnableAutoConfiguration
@RestController

public class ManufacturerController {
    @Autowired
    private ManufacturerDao manufacturerDao;

    /**
     * 查询库存的所有生产商
     * 返回值是一个生产商的List
     * @return
     */
    @RequestMapping(value = "/listmanufacturer", method = RequestMethod.GET)
    List<Manufacturer> listManufacturer() {
        List<Manufacturer> list = manufacturerDao.findAll();
        return list;
    }

    /**
     * 添加新的生产商信息，如果存在则不能添加
     * @param manufacturer
     * @return
     */
    @RequestMapping(value = "/savemanufacturer", method = RequestMethod.POST)
    public boolean addManufacturer(Manufacturer manufacturer) {
        Manufacturer oldManufacturer = manufacturerDao.findByManufacturerName(manufacturer.getManufacturerName());
        if(oldManufacturer==null)
           try {
             manufacturerDao.save(manufacturer);
               return true;
             }catch (Exception ex)
              {
              ex.printStackTrace();
                  throw new RuntimeException("插入信息失败");
              }
        else
            throw new RuntimeException("已经存在这个生产商的信息，若需修改请在修改处");
    }

    /**
     * 根据传入的信息进行库存生产商信息的修改
     * @param list
     * @return
     */
    @RequestMapping(value = "/updatemanufacturer", method = RequestMethod.POST,consumes = "application/json")
    public boolean updateManufacturer(Manufacturer list) {
        try {
            manufacturerDao.updateManufacturerByManufacturerId(list.getManufacturerId(),list.getManufacturerAddress(),list.getManufacturerName());
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("修改信息失败");
        }
    }

    /**
     * 根据传入的id进行库存生产商的删除
     * @param manufacturerId
     * @return
     */
    @RequestMapping(value = "/deletemanufacturer", method = RequestMethod.POST,consumes = "application/json")
    public boolean deleteManufacturer(Integer manufacturerId) {
        try {
            manufacturerDao.delete(manufacturerId);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("删除失败");
        }
    }

    }
