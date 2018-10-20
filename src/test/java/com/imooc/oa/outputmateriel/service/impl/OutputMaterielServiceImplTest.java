package com.imooc.oa.outputmateriel.service.impl;

import com.imooc.oa.outputmateriel.dao.OutputMaterielDao;
import com.imooc.oa.outputmateriel.dao.OutputMaterielDaoMapper;
import com.imooc.oa.outputmateriel.entity.OutputMateriel;
import com.imooc.oa.outputmateriel.service.OutputMaterielService;
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
public class OutputMaterielServiceImplTest {
    @Autowired
    private OutputMaterielService outputMaterielService;
    @Autowired
    private OutputMaterielDao outputMaterielDao;

    @Test
    public void getOutputMaterielList() throws Exception {

    }

    @Test
    public void getOutputMaterielById() throws Exception {
    }

    @Test
    public void getOutputMaterielByMaterielCode() throws Exception {
    }

    @Test
    public void addNewOutputMateriel() throws Exception {
        OutputMateriel outputMateriel=new OutputMateriel();
        outputMateriel.setProductName("电频");
        outputMateriel.setMaterielCodingPrefix("SHDF");
        outputMateriel.setMaterielCode("7721054l");
        outputMateriel.setRohs("jdhszo");
        outputMateriel.setMaterielState("hiad");
        outputMateriel.setMaterielState("ACTIVEsd");
        outputMateriel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        outputMateriel.setRemarks("低频硬件dfsg");
        outputMateriel.setSerialNumber("5d53f-f");
        outputMateriel.setInventoryQuantity(20);
        outputMateriel.setFifthCustom("sadhf");
        outputMateriel.setFirstApprover("ta shi");
        outputMateriel.setChecker("kufang");
        outputMateriel.setProductPrice(6.0);
        outputMateriel.setOutputQuantity(21);
        outputMateriel.setCategory("无源器件");
        outputMateriel.setUnit("台");
        outputMateriel.setWarehouse("物料管理部门");
        outputMaterielService.addNewOutputMateriel(outputMateriel);
    }

    @Test
    public void modifyOutputMateriel() throws Exception {
        OutputMateriel outputMateriel=new OutputMateriel();
        outputMateriel.setProductName("电频sadf");
        outputMateriel.setMaterielCodingPrefix("SHDFads");
        outputMateriel.setMaterielCode("6456df");
        outputMateriel.setRohs("jdhszoasf");
        outputMateriel.setMaterielState("hiadasdf");
        outputMateriel.setMaterielState("ACTIVEsdsadf");
        outputMateriel.setMaterielDescription("贴片电容，10pf,封装0603，容差10%,额定电压50V,材质COG");
        outputMateriel.setRemarks("低频硬件dfsg");
        outputMateriel.setOutputMaterielId(3);
        outputMateriel.setSerialNumber("5d53f-f");
        outputMateriel.setInventoryQuantity(20);
        outputMateriel.setFifthCustom("sadhf");
        outputMateriel.setFirstApprover("ta shi");
        outputMateriel.setChecker("kufang");
        outputMateriel.setProductPrice(6.0);
        outputMateriel.setCategory("无源器件asf");
        outputMateriel.setUnit("台");
        outputMateriel.setWarehouse("物料管理部门");
        outputMaterielService.modifyOutputMateriel(outputMateriel);
    }

    @Test
    public void deleteOutputMateriel() throws Exception {
        outputMaterielService.deleteOutputMateriel(1);
    }

    @Test
    public void addOutputMaterielList() throws Exception {
        List<OutputMateriel> outputMateriels=outputMaterielService.getOutputMaterielList();
        outputMaterielService.addOutputMaterielList(outputMateriels);
    }

}