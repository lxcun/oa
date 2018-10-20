package com.imooc.oa.inputmateriel.dao;

import com.imooc.oa.inputmateriel.entity.InputMateriel;
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

public class InputMaterielDaoMapperTest {
    @Autowired
    private InputMaterielDaoMapper inputMaterielDaoMapper;

    @Test
    public void newInputMateriel() throws Exception {
        InputMateriel inputMateriel=new InputMateriel();
        inputMateriel.setMaterielCodingPrefix("ATO33");
        inputMateriel.setMaterielCode("1348d165dsf");
        inputMateriel.setProductName("点解电容");
        inputMateriel.setRohs("有 RoHSsdf");
        inputMateriel.setMaterielState("ACTIVEsd");
        inputMateriel.setDs("有DS");
        inputMateriel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        inputMateriel.setManufacturer("富士康A区sdfg");
        inputMateriel.setEncapsulation("贴片gsd");
        inputMateriel.setTemperature("50度以下dsfg");
        inputMateriel.setRemarks("低频硬件dfsg");
        inputMateriel.setPn("A项目");
        inputMateriel.setSerialNumber("5d53f-f");
        inputMateriel.setSeller("阿里巴巴");
        inputMateriel.setQuantity(20);
        inputMateriel.setProductPrice(6.0);
        inputMateriel.setGeneralCategory("无源器件");
        inputMateriel.setSmallClass("易耗品");
        inputMateriel.setCodingRules("按用途和频段划分");
        inputMateriel.setUnit("台");
        inputMateriel.setManagementPersonne("物管");
        inputMateriel.setMaterialReceivingWarehouse("物料管理部门");
        inputMateriel.setBatchNumber("第5批");
        inputMateriel.setDeliverer("小张");
        inputMateriel.setFirstCustom("第一个自定义");
        inputMateriel.setSecondCustom("第二个自定义");
        inputMateriel.setThirdCustom("第三个自定义");
        inputMateriel.setFourthCustom("第四个自定义");
        inputMateriel.setFifthCustom("第五个自定义");
        inputMateriel.setSixthCustom("第六个自定义");
        inputMateriel.setSeventhCustom("第七个自定义");
        inputMateriel.setEighthCustom("第八个自定义");
        inputMateriel.setNinthCustom("第九个自定义");
        inputMateriel.setTenthCustom("第十个自定义");
        inputMateriel.setOrderNumber("211541541");
        inputMaterielDaoMapper.newInputMateriel(inputMateriel);
    }

    @Test
    public void updateInputMateriel() throws Exception {
        InputMateriel inputMateriel=new InputMateriel();
        inputMateriel.setMaterielCodingPrefix("ATO33");
        inputMateriel.setMaterielCode("1348d165dsf");
        inputMateriel.setProductName("点解电容");
        inputMateriel.setRohs("有 RoHSsdf");
        inputMateriel.setMaterielState("ACTIVEsd");
        inputMateriel.setDs("有DS");
        inputMateriel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        inputMateriel.setManufacturer("富士康A区sdfg");
        inputMateriel.setEncapsulation("贴片gsd");
        inputMateriel.setTemperature("50度以下dsfg");
        inputMateriel.setRemarks("低频硬件dfsg");
        inputMateriel.setPn("A项目");
        inputMateriel.setSerialNumber("5d53f-f");
        inputMateriel.setInputMaterielId(1);
        inputMateriel.setSeller("阿里巴巴");
        inputMateriel.setQuantity(20);
        inputMateriel.setProductPrice(0.56);
        inputMateriel.setGeneralCategory("无源器件");
        inputMateriel.setSmallClass("易耗品");
        inputMateriel.setCodingRules("按用途和频段划分");
        inputMateriel.setUnit("台");
        inputMateriel.setManagementPersonne("物管");
        inputMateriel.setMaterialReceivingWarehouse("物料管理部门");
        inputMateriel.setBatchNumber("第5批");
        inputMateriel.setDeliverer("小张");
        inputMateriel.setOrderNumber("211541541");
        inputMateriel.setFirstCustom("第一个自定义1");
        inputMateriel.setSecondCustom("第二个自定义2");
        inputMateriel.setThirdCustom("第三个自定义3");
        inputMateriel.setFourthCustom("第四个自定义4");
        inputMateriel.setFifthCustom("第五个自定义5");
        inputMateriel.setSixthCustom("第六个自定义6");
        inputMateriel.setSeventhCustom("第七个自定义7");
        inputMateriel.setEighthCustom("第八个自定义8");
        inputMateriel.setNinthCustom("第九个自定义9");
        inputMateriel.setTenthCustom("第十个自定义10");
        inputMaterielDaoMapper.updateInputMateriel(inputMateriel);
    }
    @Test
    public void deletInputMateriel() throws Exception {
        inputMaterielDaoMapper.deletInputMateriel(1);
    }

    @Test
    public void insertListInputMateriel() throws Exception {

    }

}