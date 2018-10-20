package com.imooc.oa.outputmateriel.service.impl;

import com.imooc.oa.materiel.dao.MaterielDaoMapper;
import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import com.imooc.oa.outputmateriel.dao.OutputMaterielDao;
import com.imooc.oa.outputmateriel.dao.OutputMaterielDaoMapper;
import com.imooc.oa.outputmateriel.entity.OutputMateriel;
import com.imooc.oa.outputmateriel.service.OutputMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@EnableAutoConfiguration
@Service
public class OutputMaterielServiceImpl implements OutputMaterielService {
    @Autowired
    private OutputMaterielDao outputMaterielDao;
    @Autowired
    private OutputMaterielDaoMapper outputMaterielDaoMapper;
    @Autowired
    private MaterielService materielService;
    @Autowired
    private MaterielDaoMapper materielDaoMapper;
    @Override
    public List<OutputMateriel> getOutputMaterielList(){
        return outputMaterielDao.findAll();
    }
    @Override
    public OutputMateriel getOutputMaterielById(int outputMaterielId){
        return outputMaterielDao.findOne(outputMaterielId);
    }
    @Override
    public OutputMateriel getOutputMaterielByMaterielCode(String materielCode){
        return outputMaterielDao.findByMaterielCode(materielCode);
    }
     @Transactional
    @Override
    public boolean addNewOutputMateriel(OutputMateriel outputMateriel){
        boolean flag=false;
        try {
            Materiel oldmateriel=materielService.getMaterielByMaterielCode(outputMateriel.getMaterielCode());
            if(oldmateriel!=null&&oldmateriel.getInventoryQuantity()>=outputMateriel.getOutputQuantity()){
                int effectedNum1 =outputMaterielDaoMapper.insertNewOutputMateriel(outputMateriel);
                int effectedNum2=materielDaoMapper.reduceMateriel(oldmateriel.getMateriel_id(),outputMateriel.getOutputQuantity());
              if(effectedNum1>0&&effectedNum2>0)
                flag=true;
              else if(effectedNum1>0&&effectedNum2<=0)
              {
                 flag=false;
              }
              else
                 flag=false;
            }else
                flag=false;
       return flag;
        }catch (Exception e) {
            throw new RuntimeException("添加出库信息失败:" + e.toString());
        }
    }
    @Override
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

    @Override
    public boolean deleteOutputMateriel(int outputMaterielId){
        try{
            outputMaterielDao.delete(outputMaterielId);
            return true;
        }catch (Exception e)
        {
            throw new RuntimeException("删除出库信息失败:" + e.toString());
        }
    }@Override
    public boolean addOutputMaterielList(List<OutputMateriel> outputMateriel){
        Boolean flag=true;
        try {
        for (OutputMateriel outputMateriel1:outputMateriel){
            OutputMateriel oldoutputMateriel =outputMaterielDao.findByMaterielCode(outputMateriel1.getMaterielCode());
            if(oldoutputMateriel!=null) {
                if (addNewOutputMateriel(outputMateriel1) && materielDaoMapper.reduceMateriel(oldoutputMateriel.getOutputMaterielId(),oldoutputMateriel.getOutputQuantity())>0)
                    flag = true;
                else
                    flag = false;
            }
            else {
                throw new RuntimeException("库存中没有批量出库失败:");
            }
        }

            return flag;
        }catch (Exception e){
            throw new RuntimeException("批量出库失败:" + e.toString());
        }
    }
}
