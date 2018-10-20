package com.imooc.oa.smallclass.dao;


import com.imooc.oa.smallclass.entity.SmallClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional//执行修改方法时一定要添加这个注解和@Modifying注解
public interface SmallClassDao extends JpaRepository<SmallClass, Integer> {
    /**
     * 通过分类的小类ID来修改小类信息
     * @param smallClassId
     * @param smallClassName
     */
    @Modifying

    @Query(value = "update SmallClass  s set s.smallClassName =:smallClassName where s.smallClassId=:smallClassId")
    void updateSmallClassNameBysmallClassId(@Param("smallClassId")  Integer smallClassId, @Param("smallClassName") String smallClassName);

    /**
     * 通过小类的名字查看小类信息
     * @param smallClassName
     * @return
     */
    public SmallClass findBysmallClassName(String smallClassName);

}
