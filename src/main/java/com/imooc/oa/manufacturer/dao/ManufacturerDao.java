package com.imooc.oa.manufacturer.dao;

import org.springframework.data.jpa.repository.Modifying;
import com.imooc.oa.manufacturer.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


@Transactional//执行修改方法时一定要添加这个注解和@Modifying注解
public interface ManufacturerDao extends JpaRepository<Manufacturer,Integer> {
    /**
     * 根据生产商ID修改生产商信息
     * @param manufacturerId
     * @param manufacturerAddress
     * @param manufacturerName
     */
    @Modifying
    @Query(value = "update Manufacturer m set m.manufacturerName =:manufacturerName , m.manufacturerAddress=:manufacturerAddress where m.manufacturerId = :manufacturerId")
    void updateManufacturerByManufacturerId(@Param("manufacturerId")  Integer manufacturerId, @Param("manufacturerAddress") String manufacturerAddress,@Param("manufacturerName") String manufacturerName);

    /**
     * 通过生产商名字查看生产商信息
     * @param manufacturerName
     * @return
     */
    public Manufacturer findByManufacturerName(String manufacturerName);

    /**
     * 通过生产商Id查看生产商信息
     * @param manufacturerId
     * @return
     */
    public Manufacturer findByManufacturerId(Integer manufacturerId);
}
