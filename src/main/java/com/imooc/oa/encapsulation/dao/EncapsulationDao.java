package com.imooc.oa.encapsulation.dao;

import com.imooc.oa.encapsulation.entity.Encapsulation;
import com.imooc.oa.generalcategory.entity.GeneralCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EncapsulationDao extends JpaRepository<Encapsulation,Integer> {
    /**
     * 根据封装形式的ID修改封装
     * @param encapsulationId
     * @param encapsulationName
     */
    @Modifying
    @Query(value = "update Encapsulation  e set e.encapsulationName =:encapsulationName where e.encapsulationId =:encapsulationId")
    void updatEencapsulationNameByEncapsulationId(@Param("encapsulationId")  Integer encapsulationId, @Param("encapsulationName") String encapsulationName);

    /**
     * 根据封装名字查看封装信息
     * @param encapsulationName
     * @return
     */
    public Encapsulation findByEncapsulationName(String encapsulationName);

}
