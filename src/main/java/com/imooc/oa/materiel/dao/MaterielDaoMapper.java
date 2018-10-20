package com.imooc.oa.materiel.dao;

import com.imooc.oa.materiel.entity.Materiel;

import java.util.List;

public interface MaterielDaoMapper {
    /**
     * 插入新的物料信息
     *
     * @param materiel
     * @return
     */
    int insertnewMateriel(Materiel materiel);

    /**
     * 修改库存的物料信息
     *
     * @param materiel
     * @return
     */
    int updateMateriel(Materiel materiel);

    /**
     * 删除库存物料信息
     *
     * @param materiel_id
     * @return
     */
    int deleteMateriel(int materiel_id);

    /**
     * 批量添加库存物料
     * @param materiel
     * @return
     */
    int insertlistMateriel(List<Materiel> materiel);

    /**
     * 更新库存物料信息
     * @param materiel
     * @return
     */
    int addMateriel(Materiel materiel);

    /**
     * 库存减少，通过出库操作实现
     * @param materielId,inventortQuantity
     * @return
     */
    int reduceMateriel(Integer materielId,Integer inventoryQuantity);
}
