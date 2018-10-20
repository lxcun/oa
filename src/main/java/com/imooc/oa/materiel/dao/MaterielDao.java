package com.imooc.oa.materiel.dao;

import com.imooc.oa.materiel.entity.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterielDao  extends JpaRepository<Materiel, Integer> {
    /**
     * 通过物料编码查找信息
     * @param MaterielCode
     * @return
     */
    public Materiel findByMaterielCode(String MaterielCode);

    /**
     * 通过物料名称查找信息
     * @param productName
     * @return
     */
    public Materiel findByProductName(String productName);
}
