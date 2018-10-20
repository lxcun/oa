package com.imooc.oa.controller;

import com.imooc.oa.manufacturer.dao.ManufacturerDao;
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
public class ManufacturerControllerTest {


    @Autowired
    private ManufacturerController manufacturerController;
    @Autowired
    private ManufacturerDao manufacturerDao;
    @Test
    public void addmanufacturer() throws Exception {
       Manufacturer manufacturer=new Manufacturer();
       manufacturer.setManufacturerAddress("成都郫县");
       manufacturer.setManufacturerName("森泰制衣");
       manufacturerController.addManufacturer(manufacturer);
    }
    @Test
    public void updateManufacturer() throws Exception {
        Manufacturer manufacturer=new Manufacturer();
        manufacturer.setManufacturerId(1);
        manufacturer.setManufacturerAddress("成都郫县GY");
        manufacturer.setManufacturerName("森泰制衣GHF");
        manufacturerController.updateManufacturer(manufacturer);
    }
    @Test
    public void deletManufacturer() throws Exception {
        manufacturerController.deleteManufacturer(3);
    }
}