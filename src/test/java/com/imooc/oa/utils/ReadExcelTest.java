package com.imooc.oa.utils;

import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ReadExcelTest {
  /*  @Autowired
    private MaterielService materielService;


    //读取单个单元格
    @Test
    public void testRead() throws Exception {
        //Excel文件
        HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(ResourceUtils.getFile("classpath:web-info.xls")));
        //Excel工作表
        HSSFSheet sheet = wb.getSheetAt(0);

        //表头那一行
        HSSFRow titleRow = sheet.getRow(0);

        //表头那个单元格
        HSSFCell titleCell = titleRow.getCell(0);

        String title = titleCell.getStringCellValue();

        System.out.println("标题是："+title);
    }

    //读取到列表
    @Test
    public void testReadList() throws Exception {
        List<Materiel> list=materielService.getMaterielList();
        list = materielService.getMaterielList();

        HSSFWorkbook book = new HSSFWorkbook(new FileInputStream(ResourceUtils.getFile("classpath:web-info-template.xls")));

        HSSFSheet sheet = book.getSheetAt(0);

        for(int i=2; i<sheet.getLastRowNum()+1; i++) {
            HSSFRow row = sheet.getRow(i);
            Integer materielId= (int) row.getCell(0).getNumericCellValue(); //物料Id
            String materielCodingPrefix=row.getCell(1).getStringCellValue();//物料编码前缀
            String materielCode = row.getCell(2).getStringCellValue(); //url
            String productName= row.getCell(3).getStringCellValue();
            String rohs= row.getCell(4).getStringCellValue();
            String materielState= row.getCell(5).getStringCellValue();
            String ds= row.getCell(6).getStringCellValue();
            String materielDescription= row.getCell(7).getStringCellValue();
            String serialNumber= row.getCell(8).getStringCellValue();
            String manufacturer= row.getCell(9).getStringCellValue();
            String encapsulation= row.getCell(10).getStringCellValue();
            String temperature= row.getCell(11).getStringCellValue();
            String remarks= row.getCell(12).getStringCellValue();
            String pn = row.getCell(13).getStringCellValue();
            String batchNumber =  row.getCell(14).getStringCellValue();
            String seller= row.getCell(15).getStringCellValue();
            Integer inventoryQuantity= (int)row.getCell(16).getNumericCellValue();
            Integer productPrice= (int)row.getCell(17).getNumericCellValue();
            String generalCategory= row.getCell(18).getStringCellValue();
            String smallClass= row.getCell(19).getStringCellValue();
            String codingRules= row.getCell(20).getStringCellValue();
            Date shelfLife= (Date) row.getCell(21).getDateCellValue();
            Date storageData= (Date)row.getCell(22).getDateCellValue();
            String materialReceivingWarehouse= row.getCell(23).getStringCellValue();
            String managementPersonne= row.getCell(24).getStringCellValue();
            String unit= row.getCell(25).getStringCellValue();
            list.add(new Materiel(materielCodingPrefix,materielCode,productName,rohs,materielState,
                   ds,materielDescription,serialNumber,manufacturer,encapsulation,
                    temperature,remarks,pn,batchNumber,seller, inventoryQuantity,
                   productPrice,generalCategory, smallClass, codingRules,shelfLife,
                   storageData, unit, materialReceivingWarehouse,managementPersonne));
        }

        System.out.println("共有 " + list.size() + " 条数据：");
        for(Materiel wd : list) {
            System.out.println(wd);
        }
    }*/
}
