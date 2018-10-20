package com.imooc.oa.manufacturer.dao;

import com.imooc.oa.manufacturer.entity.Manufacturer;
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
public class ManufacturerDaoTest {
    @Autowired
    private ManufacturerDao manufacturerDao;
    @Test
    public void updatemanufacturerNameBymanufacturerId() throws Exception {

    }

    @Test
    public void findByManufacturerName() throws Exception {
    }

    @Test
    public void findByManufacturerId() throws Exception {
        Manufacturer manufacturer=new Manufacturer();
        manufacturer=manufacturerDao.findByManufacturerId(1);
        System.out.println(manufacturer);
    }


    @Test
    public void testAdd() {
        Manufacturer manufacturer=new Manufacturer();
        //manufacturer.setManufacturerId(1);
        manufacturer.setManufacturerName("奥特为");
        manufacturer.setManufacturerAddress("高新区");
        manufacturerDao.save(manufacturer);
    }
    @Test
    public void testupdate() {
        Manufacturer manufacturer=new Manufacturer();
        manufacturer.setManufacturerId(1);
        manufacturer.setManufacturerName("奥特为2");
        manufacturer.setManufacturerAddress("高新区f");
        manufacturerDao.save(manufacturer);
    }
    @Test
    public void testdelete() {
        manufacturerDao.delete(1);
    }


}