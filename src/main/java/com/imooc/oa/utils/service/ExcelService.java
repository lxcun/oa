package com.imooc.oa.utils.service;

import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import com.imooc.oa.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExcelService {
    @Autowired
    private MaterielService materielService;
    public void exportBillOfMaterial(List list,String title,String address,String name) throws FileNotFoundException {
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", title);
        map.put("total",list.size()+" 条");
        map.put(name+"date", getDate());
        ExcelUtil.getInstance().exportObj2ExcelByTemplate(map, "web-info-template.xls", new FileOutputStream(address),
                list, Materiel.class, true);
    }
    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date());
    }
}
