package com.imooc.oa.encapsulation.entity;

import javax.persistence.*;

@Entity
//自动建表的表名
@Table(name = "encapsulation")
public class Encapsulation {
    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键，采用自动递增的方式
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer encapsulationId;
    //Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    //建立相应的数据库，变量如下

    @Column(nullable = false,name="encapsulation_name")
    private String encapsulationName;//封装形式名称

    public Encapsulation(){};

    public Encapsulation(Integer encapsulationId,String encapsulationName){
        this.encapsulationId=encapsulationId;
        this.encapsulationName=encapsulationName;
    };

    public Integer getEncapsulationId() {
        return encapsulationId;
    }

    public void setEncapsulationId(Integer encapsulationId) {
        this.encapsulationId = encapsulationId;
    }

    public String getEncapsulationName() {
        return encapsulationName;
    }

    public void setEncapsulationName(String encapsulationName) {
        this.encapsulationName = encapsulationName;
    }
}
