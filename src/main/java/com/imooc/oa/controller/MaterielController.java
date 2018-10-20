package com.imooc.oa.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import com.imooc.oa.utils.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 库存物料的增删改查
 */
@CrossOrigin
@RestController
public class MaterielController {
    @Autowired
    private MaterielService materielService;
    @Autowired
    private ExcelService excelService;
    /**
     * 查询数据库中的所有物料
     * 返回的是一个物料清单List
     * @return
     */
    @RequestMapping(value = "/listmateriel", method = RequestMethod.GET)
    List<Materiel> listMateriel() {
        List<Materiel> list = materielService.getMaterielList();
        return list;
    }

    /**
     * 通过传递的Id进行物料信息的查询
     *需要传入Id
     *
     * @param materielId
     * @return
     */
    @RequestMapping(value = "/getmaterielbyid", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    Materiel getMaterielById(int materielId) {
        Materiel materiel = materielService.getMaterielById(materielId);
        return materiel;
    }

    /**
     * 通过传递的物料编码进行物料信息的查询
     *需要传入物料编码
     * @param materielCode
     * @return
     */
    @RequestMapping(value = "/getmaterielbymaterielcode", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    Materiel getmaterielbymaterielcode(String materielCode) {
        Materiel materiel = materielService.getMaterielByMaterielCode(materielCode);
        return materiel;
    }
    //请求地址映射，限制请求，value放的是url，method则是查询服务的时候用get，向后台提交数据时用post
    /**
     * 根据传入的添加的物料进行判断是否重复添加，如果传入物料的名称原来有，将物料的数量更新
     * 需要传入物料信息
     * @param materiel
     * @return
     */
  /*  @RequestMapping(value = "/addnewmateriel", method = RequestMethod.POST,consumes = "application/json")
        private Map<String, Object> addMateriel(@RequestBody Materiel materiel) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", materielService.addNewMateriel(materiel));
      return modelMap;
   }*/

    /**
     * @param materiel
     * @return根据传入的物料Id修改物料信息，根据传入的物料进行库存物料的修改
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    //请求地址映射，限制请求，value放的是url，method则是查询服务的时候用get，向后台提交数据时用post
    @RequestMapping(value = "/modifymateriel", method = RequestMethod.POST,consumes = "application/json")
    private Map<String, Object> modifyMateriel(@RequestBody Materiel materiel)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改信息
        modelMap.put("success", materielService.modifyMateriel(materiel));
        return modelMap;
    }

    /**
     * 根据传入的物料Id进行数据库库存物料的删除
     * @param materielId
     * @return
     */
    //请求地址映射，限制请求，value放的是url，method则是查询服务的时候用get，向后台提交数据时用post
    @RequestMapping(value = "/removemateriel", method = RequestMethod.POST,consumes = "application/json")
    private Map<String, Object> removeMateriel(Integer materielId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 删除库存信息
        modelMap.put("success", materielService.deleteMateriel(materielId));
        return modelMap;
    }

    /**
     * 根据传入的物料List按列表进行物料的添加
     * @param materiel
     * @return

    @RequestMapping(value = "/addlistmateriel", method = RequestMethod.POST,consumes = "application/json")
    private Map<String, Object> addListMateriel(@RequestBody List<Materiel> materiel) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", materielService.addMaterielList(materiel));
        return modelMap;
    }*/
    /**
     * 通过访问入库的URL进行入库清单的导出
     * @return
     * @throws FileNotFoundException
     */
    @RequestMapping(value = "/downloadallinputmaterielexcel", method = RequestMethod.POST)
    private Object downloadAllMaterielExcel() throws FileNotFoundException {
        try {
            List<Materiel> materiel=materielService.getMaterielList();
            String title="所有库存物料导出";
            String address="D:/allMateriel.xls";
            String name="库存物料";
            excelService.exportBillOfMaterial(materiel,title,address,name);
            excelService.getDate();
            return "success";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return "error";
        }
    }

}
