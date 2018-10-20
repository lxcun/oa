package com.imooc.oa.inputmateriel.dao;


import com.imooc.oa.inputmateriel.entity.InputMateriel;


import java.util.List;

public interface InputMaterielDaoMapper {
    /**
     * 新增入库
     *
     * @param inputMateriel
     * @return
     */
    int newInputMateriel(InputMateriel inputMateriel);
    /**
     * 修改入库
     *
     * @param inputMateriel
     * @return
     */
    int updateInputMateriel(InputMateriel inputMateriel);

    /**
     * 删除入库记录
     *
     * @param inputMaterielId
     * @return
     */
    int deletInputMateriel(Integer inputMaterielId);
    /**
     * 批量入库
     * @param inputMateriels
     * @return
     */
    int insertListInputMateriel(List<InputMateriel> inputMateriels);
}
