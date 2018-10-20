package com.imooc.oa.materiel.config.service.impl;

import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterielServiceImplTest {

    @Autowired
    private MaterielService materielService;
    @Test
    public void getMaterielList1() throws Exception {
        List<Materiel> materielList=materielService.getMaterielList();
        assertEquals(3,materielList.size());
    }

    @Test
    public void getMaterielById1() throws Exception {
        Materiel materiel=materielService.getMaterielById(3);
        materiel.setMaterielCodingPrefix("ATO");
        materiel.setMaterielCode("1348d165");
        materiel.setProductName("电容");
        materiel.setRohs("有 RoHS");
        materiel.setMaterielState("ACTIVE");
        materiel.setDs("有DS");
        materiel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        materiel.setManufacturer("富士康");
        materiel.setEncapsulation("贴片");
        materiel.setTemperature("50度以下");
        materiel.setRemarks("低频硬件");
        materiel.setPn("A项目");
        materiel.setSerialNumber("5d53f-f");
        materiel.setSeller("阿里巴巴");
        materiel.setInventoryQuantity(20);
        materiel.setProductPrice(2.0);
        materiel.setGeneralCategory("无源器件");
        materiel.setSmallClass("易耗品");
        materiel.setCodingRules("按用途和频段划分");
        materiel.setUnit("台");
        materiel.setManagementPersonne("物管");
        materiel.setMaterialReceivingWarehouse("物料管理部门");
        materiel.setBatchNumber("第5批");

    }

    @Test
    public void addNewMateriel1() throws Exception {
        Materiel materiel=new Materiel();
        materiel.setMaterielCodingPrefix("ATO");
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
        materiel.setProductPrice(3.0);
        materiel.setGeneralCategory("无源器件");
        materiel.setSmallClass("易耗品");
        materiel.setCodingRules("按用途和频段划分");
        materiel.setUnit("台");
        materiel.setManagementPersonne("物管");
        materiel.setMaterielCode("7721054l");
        materiel.setMaterialReceivingWarehouse("物料管理部门");
        materiel.setBatchNumber("第5批");
        boolean effectedNum=materielService.addNewMateriel(materiel);
        assertEquals(true,effectedNum);

    }
    @Test
    public void modifyMateriel() throws Exception {
        Materiel materiel=new Materiel();
        materiel.setMateriel_id(2);
        materiel.setMaterielCodingPrefix("AEO");
        materiel.setMaterielCode("1365");
        materiel.setProductName("电容22sdg");
        materiel.setRohs("无 RoHS");
        materiel.setMaterielState("ACTIVE");
        materiel.setDs("无DS");
        materiel.setMaterielDescription("贴片电容，10pf,封装000603，容差10%,额定电压50V,材质COG");
        materiel.setCodingRules("CC0603KRNPO9BN10000");
        materiel.setManufacturer("富士康B区");
        materiel.setEncapsulation("焊盘");
        materiel.setTemperature("80度以下gf");
        materiel.setRemarks("中频硬件sg");
        materiel.setPn("A11项目dfg");
        materiel.setSerialNumber("5d3f-fsfg");
        materiel.setSeller("腾讯gf");
        materiel.setInventoryQuantity(20);
        materiel.setProductPrice(4.1);
        materiel.setGeneralCategory("无源器件sdfg");
        materiel.setSmallClass("易耗品dh");
        materiel.setCodingRules("按用途和频段划分");
        materiel.setUnit("台");
        materiel.setManagementPersonne("物管");
        materiel.setMaterialReceivingWarehouse("物料管理部门");
        materiel.setBatchNumber("第5批");
       boolean effectedNum=materielService.modifyMateriel(materiel);
        assertEquals(true,effectedNum);
    }
    @Test
    public void deleteMateriel() throws Exception {
        boolean effectedNum=materielService.deleteMateriel(3);
        assertEquals(true,effectedNum);
    }
}