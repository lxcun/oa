package com.imooc.oa.materiel.service;
import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.materiel.entity.Materiel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaterielService {
    /**
     * 获取物料列表
     *
     * @return
     */
    List<Materiel> getMaterielList();

    /**
     * 通过Id获取物料信息
     *
     * @param materielId
     * @return
     */
   Materiel getMaterielById(int materielId);

    /**
     * 通过物料编码获取库存物料信息
     * @param MateielCode
     * @return
     */
     Materiel getMaterielByMaterielCode(String MateielCode);
    /**
     * 增加物料信息或者更新
     *
     * @param materiel
     * @return
     */
    boolean addNewMateriel(Materiel materiel);
    /**
     * 修改物料信息
     *
     * @param materiel
     * @return
     */
    boolean modifyMateriel(Materiel materiel);

    /**
     * 删除库存的物料信息
     *
     * @param materielId
     * @return
     */
    boolean deleteMateriel(int materielId);

    /**
     * 批量添加物料信息
     * @param materiel
     * @return
     */
  //  boolean addMaterielList(List<Materiel> materiel);

    /**
     * 批量将入库转换为库存
     * @param inputMateriels
     * @return
     */
     boolean inputMaterielToMateriel(List<InputMateriel> inputMateriels);
    /**
     * 将入库转换为库存
     * @param inputMateriel
     * @return
     */
    boolean inputMaterielToMateriel(InputMateriel inputMateriel);

}
