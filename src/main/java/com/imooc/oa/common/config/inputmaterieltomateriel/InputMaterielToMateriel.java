package com.imooc.oa.common.config.inputmaterieltomateriel;

import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


public class InputMaterielToMateriel {

    @Autowired
    private MaterielService materielService;
    public boolean inputMaterielToMateriel(InputMateriel inputMateriel){
        try{
            Materiel materiel=new Materiel();
            materiel.setProductName(inputMateriel.getProductName());
            materiel.setMaterielCodingPrefix(inputMateriel.getMaterielCodingPrefix());
            materiel.setMaterielCode(inputMateriel.getMaterielCode());
            materiel.setRohs(inputMateriel.getRohs());
            materiel.setMaterielState(inputMateriel.getMaterielState());
            materiel.setDs(inputMateriel.getDs());
            materiel.setMaterielDescription(inputMateriel.getMaterielDescription());
            materiel.setEncapsulation(inputMateriel.getEncapsulation());
            materiel.setTemperature(inputMateriel.getTemperature());
            materiel.setRemarks(inputMateriel.getRemarks());
            materiel.setPn(inputMateriel.getPn());
            materiel.setBatchNumber(inputMateriel.getBatchNumber());
            materiel.setSeller(inputMateriel.getSeller());
            materiel.setInventoryQuantity(inputMateriel.getQuantity());
            materiel.setProductPrice(inputMateriel.getProductPrice());
            materiel.setGeneralCategory(inputMateriel.getGeneralCategory());
            materiel.setSmallClass(inputMateriel.getSmallClass());
            materiel.setCodingRules(inputMateriel.getCodingRules());
            materiel.setShelfLife(inputMateriel.getShelfLife());
            materiel.setStorageData(inputMateriel.getStorageData());
            materiel.setMaterialReceivingWarehouse(inputMateriel.getMaterialReceivingWarehouse());
            materiel.setManagementPersonne(inputMateriel.getManagementPersonne());
            materiel.setUnit(inputMateriel.getUnit());
            if(materielService.addNewMateriel(materiel)) {
                return true;
            }
            else
                throw new RuntimeException("入库失败");
        }catch (Exception e)
        {
            throw new RuntimeException("入库失败：" + e.getMessage());
        }
    }
}
