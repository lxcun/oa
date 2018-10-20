package com.imooc.oa.outputmateriel.dao;
import com.imooc.oa.outputmateriel.entity.OutputMateriel;

public interface OutputMaterielDaoMapper {
    /**
     * 插入新的物料信息
     *
     * @param outputMateriel
     * @return
     */
    int insertNewOutputMateriel(OutputMateriel outputMateriel);
}
