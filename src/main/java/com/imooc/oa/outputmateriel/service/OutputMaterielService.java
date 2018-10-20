package com.imooc.oa.outputmateriel.service;

import com.imooc.oa.outputmateriel.entity.OutputMateriel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OutputMaterielService {
    /**
     * 获取物料出库列表
     *
     * @return
     */
    List<OutputMateriel> getOutputMaterielList();

    /**
     * 通过Id获取物料出库信息
     *
     * @param outputMaterielId
     * @return
     */
    OutputMateriel getOutputMaterielById(int outputMaterielId);

    /**
     * 通过物料编码获取物料出库信息
     * @param materielCode
     * @return
     */
    OutputMateriel getOutputMaterielByMaterielCode(String materielCode);
    /**
     * 增加物料出库信息
     *
     * @param outputMateriel
     * @return
     */
    boolean addNewOutputMateriel(OutputMateriel outputMateriel);
    /**
     * 修改物料出库信息
     *
     * @param outputMateriel
     * @return
     */
   boolean modifyOutputMateriel(OutputMateriel outputMateriel);

    /**
     * 删除物料出库信息
     *
     * @param outputMaterielId
     * @return
     */
    boolean deleteOutputMateriel(int outputMaterielId);

    /**
     * 批量添加物料出库信息
     * @param outputMateriel
     * @return
     */
    boolean addOutputMaterielList(List<OutputMateriel> outputMateriel);


}
