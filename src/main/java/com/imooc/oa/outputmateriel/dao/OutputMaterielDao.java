package com.imooc.oa.outputmateriel.dao;

import com.imooc.oa.outputmateriel.entity.OutputMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OutputMaterielDao extends JpaRepository<OutputMateriel, Integer>{
    /**
     * 通过物料编码查找出库信息
     * @param MaterielCode
     * @return
     */
    public OutputMateriel findByMaterielCode(String MaterielCode);

    /**
     * 通过物料名称查找出库信息
     * @param productName
     * @return
     */
   // public OutputMateriel findByProductName(String productName);
}
