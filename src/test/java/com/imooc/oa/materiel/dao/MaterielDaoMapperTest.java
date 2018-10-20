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
public class MaterielDaoMapperTest {
    @Autowired
    private MaterielDaoMapper materielDaoMapper;
    @Autowired
    private MaterielDao materielDao;
    @Autowired
    private MaterielService materielService;
    @Test
    public void insertlistMateriel() throws Exception {
           // List<Materiel> list=materielDao.findAll();
            List<Materiel> list=materielService.getMaterielList();
            materielDaoMapper.insertlistMateriel(list);
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
        materiel.setProductPrice(6.0);
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
        materielDaoMapper.addMateriel(materiel);
    }
    @Test
    public void testupdate() {
        Materiel materiel = new Materiel();
        materiel.setMaterielCodingPrefix("ATO33");
        materiel.setMateriel_id(1);
        materiel.setMaterielCode("1348d165");
        materiel.setProductName("电解电容");
        materiel.setRohs("有 RoHS");
        materiel.setMaterielState("ACTIVE");
        materiel.setDs("有DS");
        materiel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        materiel.setManufacturer("富士康A区");
        materiel.setEncapsulation("贴片");
        materiel.setTemperature("50度以下");
        materiel.setRemarks("低频硬件");
        materiel.setPn("A项目");
        materiel.setSerialNumber("5d53f-f");
        materiel.setSeller("阿里巴巴");
        materiel.setInventoryQuantity(200);
        materiel.setProductPrice(5.0);
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
        materielDaoMapper.updateMateriel(materiel);
    }
    @Test
    public void insertnew() {
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
        materiel.setProductPrice(7.0);
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
        materielDaoMapper.insertnewMateriel(materiel);
    }
}

