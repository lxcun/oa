package com.imooc.oa.manufacturer.entity;

import javax.persistence.*;

/**
 * 生产商实体类
 */
@Entity
//自动建表的表名
@Table(name = "manufacturer")
public class Manufacturer {
    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键，采用自动递增的方式
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer manufacturerId;
    //Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    //建立相应的数据库，变量如下
    @Column(nullable = false,name="manufacturer_name",unique=true)
    private String manufacturerName;//制造商名称

    @Column(nullable = true,name="manufacturer_address")
    private String manufacturerAddress;//制造商地址

    public Manufacturer(){}
    public Manufacturer(String manufacturerName,String manufacturerAddress){
        this.manufacturerAddress=manufacturerAddress;
        this.manufacturerName=manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}
