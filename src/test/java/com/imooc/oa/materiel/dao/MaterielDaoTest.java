package com.imooc.oa.materiel.dao;

import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class MaterielDaoTest {

    @Autowired
    private MaterielDao materielDao;

    @Test
    public void findByProductName() throws Exception {
        Materiel oldMateriel=materielDao.findByProductName("点解电容");
        if(oldMateriel.getProductName()=="点解电容")
            System.out.println("chengg");


    }

    @Test
    public void testAdd() {
        Materiel materiel = new Materiel();
        materiel.setMaterielCodingPrefix("ATO33");
        materiel.setMaterielCode("1348d165dsf");
        materiel.setProductName("点解电容");
        materiel.setRohs("有 RoHSsdf");
        materiel.setMaterielState("ACTIVEsd");
        materiel.setDs("有DS");
        materiel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        materiel.setManufacturer("富士康A区sdfg");
        materiel.setEncapsulation("贴片gsd");
        materiel.setTemperature("50度以下dsfg");
        materiel.setRemarks("低频硬件dfsg");
        materiel.setPn("A项目");
        materiel.setSerialNumber("5d53f-f");
        materiel.setSeller("阿里巴巴");
        materiel.setInventoryQuantity(20);
        materiel.setProductPrice(8.0);
        materiel.setGeneralCategory("无源器件");
        materiel.setSmallClass("易耗品");
        materiel.setCodingRules("按用途和频段划分");
        materiel.setUnit("台");
        materiel.setManagementPersonne("物管");
        materiel.setMaterielCode("7721054l");
        materiel.setMaterialReceivingWarehouse("物料管理部门");
        materiel.setBatchNumber("第5批");
        materiel.setFirstCustom("第一个定义");
        materiel.setSecondCustom("第二个自定义");
        materiel.setThirdCustom("第三个自定义");
        materiel.setFourthCustom("第四个自定义");
        materiel.setFifthCustom("第五个自定义");
        materiel.setSixthCustom("第六个自定义");
        materiel.setSeventhCustom("第七个自定义");
        materielDao.save(materiel);
    }
    @Test
    public void updateMateriel() throws Exception {
        Materiel materiel=  materielDao.findOne(1);
        materiel.setMaterielCodingPrefix("AEO");
        materiel.setMaterielCode("1365");
        materiel.setProductName("电容22");
        materiel.setRohs("无 RoHS");
        materiel.setMaterielState("ACTIVE");
        materiel.setDs("无DS");
        materiel.setMaterielDescription("贴片电容，10pf,封装000603，容差10%,额定电压50V,材质COG");
        materiel.setCodingRules("CC0603KRNPO9BN10000");
        materiel.setManufacturer("富士康B区");
        materiel.setEncapsulation("焊盘");
        materiel.setTemperature("80度以下");
        materiel.setRemarks("中频硬件");
        materiel.setPn("A11项目");
        materiel.setSerialNumber("5d3f-f");
        materiel.setSeller("腾讯");
        materiel.setInventoryQuantity(20);
        materiel.setProductPrice(9.0);
        materiel.setGeneralCategory("无源器件");
        materiel.setSmallClass("易耗品");
        materiel.setCodingRules("按用途和频段划分");
        materiel.setUnit("台");
        materiel.setManagementPersonne("物管");
        materiel.setMaterialReceivingWarehouse("物料管理部门");
        materiel.setBatchNumber("第5批");
       materielDao.save(materiel);
    }




}