package com.imooc.oa.controller;

import com.imooc.oa.outputmateriel.dao.OutputMaterielDao;
import com.imooc.oa.outputmateriel.entity.OutputMateriel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class OutputMaterielController {
    @Autowired
    private OutputMaterielDao outputMaterielDao;

    public List<OutputMateriel> getOutputMaterielList(){
        return outputMaterielDao.findAll();
    }


    public OutputMateriel getOutputMaterielById(int outputMaterielId){
        return outputMaterielDao.findOne(outputMaterielId);
    }

    public OutputMateriel getOutputMaterielByMaterielCode(String materielCode){
        return outputMaterielDao.findByMaterielCode(materielCode);
    }
    @Transactional//使用事务管理

    public boolean addNewOutputMateriel(OutputMateriel outputMateriel){
        try {
            outputMateriel.setTotalAmount((outputMateriel.getOutputQuantity()) * (outputMateriel.getProductPrice()));
            outputMaterielDao.save(outputMateriel);
            return true;
        }catch (Exception e) {
            throw new RuntimeException("添加出库信息失败:" + e.toString());
        }
    }

    public boolean modifyOutputMateriel(OutputMateriel outputMateriel){
        // 空值判断，主要是materielId不为空
        if (outputMateriel.getOutputMaterielId()!=null &&outputMateriel.getOutputMaterielId()>0)
            // 设置默认值
            try {
                // 更新信息
                outputMaterielDao.save(outputMateriel);
                return true;
            }catch (Exception e){
                throw new RuntimeException("修改出库信息失败:" + e.toString());
            }
        else
            throw new RuntimeException("修改Id为空，请选择修改内容:" );
    }
    @Transactional//使用事务管理

    public boolean deleteOutputMateriel(int outputMaterielId){
        try{
            outputMaterielDao.delete(outputMaterielId);
            return true;
        }catch (Exception e)
        {
            throw new RuntimeException("删除出库信息失败:" + e.toString());
        }
    }

    public boolean addOutputMaterielList(List<OutputMateriel> outputMateriel){
        try {
            for (OutputMateriel outputMateriel1:outputMateriel){
                addNewOutputMateriel(outputMateriel1);
            }return true;
        }catch (Exception e){
            throw new RuntimeException("批量出库失败:" + e.toString());
        }
    }
}
