package com.imooc.oa.controller;

import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.inputmateriel.service.InputMaterielService;
import com.imooc.oa.materiel.service.MaterielService;
import com.imooc.oa.utils.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 入库信息的增删改查
 */
@CrossOrigin
@RestController
public class InputMaterielController {
    @Autowired
    private ExcelService excelService;
    @Autowired
    private InputMaterielService inputMaterielService;
    @Autowired
    private MaterielService materielService;

    /**
     * 查询入库记录
     * @return
     */
    @RequestMapping(value = "/listinputmateriel", method = RequestMethod.GET)
    List<InputMateriel> listInputMateriel() {
        List<InputMateriel> list =inputMaterielService.getInputMaterielList();
        return list;
    }

    @RequestMapping(value = "/addinputmateriel", method = RequestMethod.POST,consumes = "application/json")
    public Map<String, Object> addInputMateriel(@RequestBody InputMateriel inputMateriel) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",(inputMaterielService.addInputMateriel(inputMateriel)&&materielService.inputMaterielToMateriel(inputMateriel)));
        return modelMap;
    }
    /**
     * 进行入库操作的同时更新库存
     * @param inputMateriels
     * @return
     */
    @RequestMapping(value = "/addinputmateriellist", method = RequestMethod.POST,consumes = "application/json")
    public Map<String, Object> addInputMaterielList(@RequestBody List<InputMateriel> inputMateriels) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",(inputMaterielService.addInputMaterielList(inputMateriels)&&materielService.inputMaterielToMateriel(inputMateriels)));
        return modelMap;
    }
    /**
     * 删除入库信息
     * @param inputMaterielId
     * @return
     */
    @RequestMapping(value ="/removeinputmateriel",method = RequestMethod.POST,consumes = "application/json")
    public Map<String,Object> removeInputMateriel(Integer inputMaterielId){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        // 修改信息
        modelMap.put("success", inputMaterielService.removeInputMateriel(inputMaterielId));
        return modelMap;
    }
    /**
     * 通过访问入库的URL进行当前入库清单的导出
     * @return
     * @throws FileNotFoundException
     */
    @RequestMapping(value = "/downloadcurrentinputmaterielexcel", method = RequestMethod.GET)
    private Object downloadCurrentInputMaterielExcel(List<InputMateriel> inputMateriel) throws FileNotFoundException {
        try {
            String title="入库单导出";
            String address="D:/currentInputMateriel.xls";
            String name="入库单";
            excelService.exportBillOfMaterial(inputMateriel,title,address,name);
            excelService.getDate();
            return "success";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return "error";
        }
    }
    /**
     * 通过访问入库的URL进行所有入库清单的导出
     * @return
     * @throws FileNotFoundException
     */
    @RequestMapping(value = "/downloadallinputmaterielexcel", method = RequestMethod.GET)
    private Object downloadAllInputMaterielExcel() throws FileNotFoundException {
        try {
            List<InputMateriel> inputMateriel=inputMaterielService.getInputMaterielList();
            String title="所有入库单导出";
            String address="D:/allInputMateriel.xls";
            String name="入库单";
            excelService.exportBillOfMaterial(inputMateriel,title,address,name);
            excelService.getDate();
            return "success";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return "error";
        }
    }
}
