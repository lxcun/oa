package com.imooc.oa.smallclass.entity;

import javax.persistence.*;

@Entity
//自动建表的表名
@Table(name = "smallclass")
public class SmallClass {
    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键，采用自动递增的方式
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name="small_class_id",unique=true)
    private Integer smallClassId;
    //Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    //建立相应的数据库，变量如下

    @Column(nullable = false,name="small_class_name",unique=true)
    private String smallClassName;//小类名称

    public SmallClass(){}

    public SmallClass(Integer smallClassId,String smallClassName){
        this.smallClassId=smallClassId;
        this.smallClassName=smallClassName;
    }

    public String getSmallClassName() {
        return smallClassName;
    }

    public void setSmallClassName(String smallClassName) {
        this.smallClassName = smallClassName;
    }

    public Integer getSmallClassId() {
        return smallClassId;
    }

    public void setSmallClassId(Integer smallClassId) {
        this.smallClassId = smallClassId;
    }
}
