package com.imooc.oa.controller;

import com.imooc.oa.inputmateriel.dao.InputMaterielDao;
import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.inputmateriel.service.InputMaterielService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class InputMaterielControllerTest {
    @Autowired
    private InputMaterielController inputMaterielController;
    @Autowired
    private InputMaterielService inputMaterielService;
    @Autowired
    private InputMaterielDao inputMaterielDao;
    @Test
    public void listInputMateriel() throws Exception {
        List<InputMateriel> inputMateriels=inputMaterielService.getInputMaterielList();
        // List<InputMateriel> inputMateriels=inputMaterielDao.findOne(1);
        inputMaterielController.addInputMaterielList(inputMateriels);
    }
    @Test
    public void addInputMateriel()throws Exception {
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
        inputMateriel.setOrderNumber("211541541");
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
        inputMaterielController.addInputMateriel(inputMateriel);
    }

}