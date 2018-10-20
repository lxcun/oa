package com.imooc.oa.utils;

import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ExportExcelTest {
    @Autowired
    private MaterielService materielService;

    @Test
    public void test() throws Exception {
        List<Materiel> list=materielService.getMaterielList();
        list = materielService.getMaterielList();

        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "物料");
        map.put("total",list.size()+" 条");
        map.put("date", getDate());
        ExcelUtil.getInstance().exportObj2ExcelByTemplate(map, "web-info-template.xls", new FileOutputStream("D:/temp.xls"),
                list, Materiel.class, true);
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date());
    }
}
