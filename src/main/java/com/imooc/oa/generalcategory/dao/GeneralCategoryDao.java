package com.imooc.oa.generalcategory.dao;

import com.imooc.oa.generalcategory.entity.GeneralCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface GeneralCategoryDao extends JpaRepository< GeneralCategory,Integer> {
    /**
     * 根据大类的ID修改分类的大类名字
     * @param generalCategoryId
     * @param generalCategoryName
     */
    @Modifying
    @Query(value = "update GeneralCategory  g set g.generalCategoryName =:generalCategoryName  where g.generalCategoryId =:generalCategoryId")
    void updateGeneralCategoryNameByGeneralCategoryId(@Param("generalCategoryId")  Integer generalCategoryId, @Param("generalCategoryName") String generalCategoryName);

    /**
     * 通过大类的名字查询大类的信息
     * @param generalCategoryName
     * @return
     */
    public GeneralCategory findByGeneralCategoryName(String generalCategoryName);
}
