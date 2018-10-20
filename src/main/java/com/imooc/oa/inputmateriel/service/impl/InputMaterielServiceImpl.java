package com.imooc.oa.inputmateriel.service.impl;

import com.imooc.oa.inputmateriel.dao.InputMaterielDao;
import com.imooc.oa.inputmateriel.dao.InputMaterielDaoMapper;
import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.inputmateriel.service.InputMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableAutoConfiguration
@Service
public class InputMaterielServiceImpl implements InputMaterielService {
    @Autowired
    private InputMaterielDao inputMaterielDao;
    @Autowired
    private InputMaterielDaoMapper inputMaterielDaoMapper;

    /**
     * 查询入库情况
     * @return
     */
    @Override
    public List<InputMateriel> getInputMaterielList() {
        return inputMaterielDao.findAll();
    }


    /**
     * 通过入库Id查询入库记录
     * @param inputMaterielId
     * @return
     */
    @Override
    public InputMateriel findInputMaterilById(Integer inputMaterielId){
        return  inputMaterielDao.findOne(inputMaterielId);
    }


    /**
     * 新增入库
     * @param inputMateriel
     * @return
     */
    @Transactional//使用事务管理
    @Override
    public boolean addInputMateriel(InputMateriel inputMateriel) {
        if (inputMateriel.getProductName() != null)
            try {
                int effectedName = inputMaterielDaoMapper.newInputMateriel(inputMateriel);
                if (effectedName > 0) {
                    return true;
                } else {
                    throw new RuntimeException("入库失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("入库失败：" + e.getMessage());
            }
        else {
            throw new RuntimeException("入库物料信息不能为空！");
        }
    }

    /**
     * 删除入库信息
     * @param inputMaterielId
     * @return
     */
    @Transactional//使用事务管理
    @Override
    public boolean removeInputMateriel(int inputMaterielId){
        if (inputMaterielId > 0) {
            try {
                // 删除入库信息
                int effectedNum = inputMaterielDaoMapper.deletInputMateriel(inputMaterielId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除入库信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除入库信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("Id不能为空！");
        }
    }

    /**
     * 批量入库
     * @param list
     * @return
     */
    @Transactional//使用事务管理
    @Override
    public boolean addInputMaterielList(List<InputMateriel> list){
        try {
            // 批量入库
            int effectedNum = inputMaterielDaoMapper.insertListInputMateriel(list);
            if (effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("批量入库失败!");
            }
        } catch (Exception e) {
            throw new RuntimeException("批量入库失败:" + e.toString());
        }
    }
}