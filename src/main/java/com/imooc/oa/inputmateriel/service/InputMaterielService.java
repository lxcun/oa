package com.imooc.oa.inputmateriel.service;

import com.imooc.oa.inputmateriel.entity.InputMateriel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InputMaterielService {
    /**
     * 查询入库记录
     * @return
     */
    List<InputMateriel> getInputMaterielList();
    /**
     * 通过入库Id查询入库信息
     * @param inputMaterielId
     * @return
     */
    InputMateriel findInputMaterilById(Integer inputMaterielId);

    /**
     * 新增入库
     * @param
     * @return
     */
    boolean addInputMateriel(InputMateriel inputMateriel);

    /**
     * 删除入库信息
     *
     * @param inputMaterielId
     * @return
     */
    boolean removeInputMateriel(int inputMaterielId);

    /**
     * 新增批量入库
     * @param list
     * @return
     */
    boolean addInputMaterielList(List<InputMateriel> list);
}
