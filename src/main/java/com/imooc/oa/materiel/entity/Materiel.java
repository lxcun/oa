package com.imooc.oa.materiel.entity;

import javax.persistence.GeneratedValue;
import com.imooc.oa.utils.ExcelResources;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 物料实体类
 */
@Entity
//自动建表的表名
@Table(name = "materiel")
public class Materiel implements Serializable
{
    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键，采用自动递增的方式
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer materielId;
    //Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    //建立相应的数据库，变量如下

    @Column(nullable = false,name="product_name")
    private String productName;//物料名称

    @Column(nullable = true,name="materiel_coding_prefix",length = 255,unique = true)
    private String  materielCodingPrefix;//物料编码前缀

    @Column(nullable=true)
    private String materielCode;//物料编码

    @Column(nullable=true)
    private String rohs;//RoHS

    @Column(nullable=true)
    private String materielState;//物料状态

    @Column(nullable=true)
    private String ds;//DS

    @Column(nullable=true)
    private String materielDescription;//物料描述

    @Column(nullable = true)
    private String serialNumber;//规格或者型号

   @Column(nullable = true)
    private String manufacturer;//生产厂商

    @Column(nullable = true)
    private String encapsulation;//封装形式

    @Column(nullable = true)
    private String temperature;//工作温度

    @Column(nullable=true)
    private String remarks;//备注

    @Column(nullable=true)
    private String pn;//项目PN

    @Column(nullable=true)
    private String batchNumber;//批次号

    @Column(nullable = true)
    private String seller;//销售厂商

    @Column(nullable = true)
    private Integer inventoryQuantity;//库存数量

    @Column(nullable = true)
    private Double productPrice;//产品价格

    @Column(nullable = true)
    private String generalCategory;//产品大类

    @Column(nullable = true)
    private String smallClass;//产品小类

    @Column(nullable = true)
    private String codingRules;//编码规则

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable=true)
    private Date shelfLife;//产品有效期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable=true)
    private Date storageData;//入库日期

    @Column(nullable = true)
    private String materialReceivingWarehouse;//收料仓库

    @Column(nullable=true)
    private String managementPersonne;//管理人员

    @Column(nullable = true)
    private String unit;//单位

    @Column(nullable=true)
    private String firstCustom;//第一个自定义

    @Column(nullable=true)
    private String secondCustom;//第二个自定义

    @Column(nullable=true)
    private String thirdCustom;//第三个自定义

    @Column(nullable=true)
    private String fourthCustom;//第四个自定义

    @Column(nullable=true)
    private String fifthCustom;//第五个自定义

    @Column(nullable=true)
    private String sixthCustom;//第六个自定义

    @Column(nullable=true)
    private String seventhCustom;//第七个自定义

    @Column(nullable=true)
    private String eighthCustom;

    @Column(nullable=true)
    private String ninthCustom;

    @Column(nullable=true)
    private String tenthCustom;

    public Materiel() {}

    public Materiel(String  materielCodingPrefix, String materielCode,String productName,String rohs,String materielState,
                    String ds, String materielDescription, String serialNumber,String manufacturer,String encapsulation,
                    String temperature,String remarks,String pn,String batchNumber,String seller, Integer inventoryQuantity,
                    Double productPrice,String generalCategory, String smallClass, String codingRules,Date shelfLife,
                    Date storageData, String unit, String materialReceivingWarehouse,String managementPersonne,String firstCustom,
                    String secondCustom,String thirdCustom,String fourthCustom,String fifthCustom,String sixthCustom,
                    String seventhCustom,String eighthCustom,String ninthCustom,String tenthCustom) {
        this.materielCodingPrefix=materielCodingPrefix;//物料编码前缀
        this.materielCode=materielCode;//物料编码
        this.productName = productName;//物料名称
        this.rohs=rohs;//ROHS
        this.materielState=materielState;//物料状态
        this.ds=ds;//DS
        this.materielDescription=materielDescription;//物料描述
        this.serialNumber=serialNumber;//型号规格
        this.manufacturer =manufacturer;//生产厂商
        this.encapsulation=encapsulation;//封装形式
        this.temperature=temperature;//工作温度
        this.remarks=remarks;//备注
        this.pn=pn;//项目PN
        this.batchNumber=batchNumber;//批次号
        this.seller=seller;//销售商
        this.inventoryQuantity=inventoryQuantity;//库存数量
        this.productPrice=productPrice;//单价
        this.generalCategory=generalCategory;//大类
        this.smallClass=smallClass;//小类
        this.codingRules=codingRules;//编码规则
        this.shelfLife=shelfLife;//有效期
        this.storageData=storageData;//入库日期
        this.materialReceivingWarehouse=materialReceivingWarehouse;//存放仓库
        this.managementPersonne=managementPersonne;//管理人员
        this.unit=unit;//单位
        this.firstCustom=firstCustom;//第一个自定义
        this.secondCustom=secondCustom;//第二个自定义
        this.thirdCustom=thirdCustom;//第三个自定义
        this.fourthCustom=fourthCustom;//第四个自定义
        this.fifthCustom=fifthCustom;//第五个自定义
        this.sixthCustom=sixthCustom;//第六个自定义
        this.seventhCustom=seventhCustom;//第七个自定义
        this.eighthCustom=eighthCustom;
        this.ninthCustom=ninthCustom;
        this.tenthCustom=tenthCustom;
    }
    @Override
    public String toString() {
        return "materiel{" +
                "materielId='" + materielId + '\'' +
                ", productName='" + productName + '\'' +
                ", materielCodingPrefix='" +materielCodingPrefix + '\'' +
                ", inventoryQuantity='" + inventoryQuantity + '\'' +
                ", materielDescription='" + materielDescription + '\'' +
                ",productPrice=" + productPrice +
                '}';
    }

    @ExcelResources(title="库存物料ID",order=1)
    public Integer getMateriel_id() {
        return materielId;
    }

    public void setMateriel_id(Integer materielId) {
        this.materielId = materielId;
    }

    @ExcelResources(title="物料编码前缀",order=2)
    public String getMaterielCodingPrefix() {
        return materielCodingPrefix;
    }

    public void setMaterielCodingPrefix(String materielCodingPrefix) { this.materielCodingPrefix = materielCodingPrefix; }

    @ExcelResources(title="物料编码",order=3)
    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    @ExcelResources(title="物料名称",order=4)
    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    @ExcelResources(title="RoHS",order=5)
    public String getRohs() {
        return rohs;
    }

    public void setRohs(String rohs) {
        this.rohs = rohs;
    }

    @ExcelResources(title="物料状态",order=6)
    public String getMaterielState() {
        return materielState;
    }

    public void setMaterielState(String materielState) {
        this.materielState = materielState;
    }

    @ExcelResources(title="DS",order=7)
    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @ExcelResources(title="物料描述",order=8)
    public String getMaterielDescription() {
        return materielDescription;
    }

    public void setMaterielDescription(String materielDescription) { this.materielDescription = materielDescription; }

    @ExcelResources(title="规格型号",order=9)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber){this.serialNumber=serialNumber;}

   // @OneToMany
    //@JoinColumn(name = "manufacturer_id",referencedColumnName = "manufacturer_name")
    @ExcelResources(title="制造商",order=10)
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @ExcelResources(title="封装形式",order=11)
    public String getEncapsulation() {
        return encapsulation;
    }

    public void setEncapsulation(String encapsulation) {
        this.encapsulation = encapsulation;
    }

    @ExcelResources(title="工作温度",order=12)
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @ExcelResources(title="备注",order=13)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @ExcelResources(title="项目PN",order=14)
    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    @ExcelResources(title="物料批次号",order=15)
    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @OneToMany
    @JoinColumn(name = "seller_id",referencedColumnName = "seller_name")
    @ExcelResources(title="物料销售商",order=16)
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @ExcelResources(title="库存数量",order=17)
    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @ExcelResources(title="物料单价",order=18)
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @ExcelResources(title="物料所属大类",order=19)
    public String getGeneralCategory() {
        return generalCategory;
    }

    public void setGeneralCategory(String generalCategory) {
        this.generalCategory = generalCategory;
    }

    @ExcelResources(title="物料所属小类",order=20)
    public String getSmallClass() {
        return smallClass;
    }

    public void setSmallClass(String smallClass) {
        this.smallClass = smallClass;
    }

    @ExcelResources(title="编码规则",order=21)
    public String getCodingRules() {
        return codingRules;
    }

    public void setCodingRules(String codingRules) {
        this.codingRules = codingRules;
    }

    @ExcelResources(title="保质期",order=22)
    public Date getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Date shelfLife) {
        this.shelfLife = shelfLife;
    }

    @ExcelResources(title="入库日期",order=23)
    public Date getStorageData() {
        return storageData;
    }

    public void setStorageData(Date storageData) {
        this.storageData = storageData;
    }

    @ExcelResources(title="管理仓库",order=24)
    public String getMaterialReceivingWarehouse() {
        return materialReceivingWarehouse;
    }

    public void setMaterialReceivingWarehouse(String materialReceivingWarehouse) { this.materialReceivingWarehouse = materialReceivingWarehouse; }

    @ExcelResources(title="物管人员",order=25)
    public String getManagementPersonne() {
        return managementPersonne;
    }

    public void setManagementPersonne(String managementPersonne) {
        this.managementPersonne = managementPersonne;
    }

    @ExcelResources(title="单位",order=26)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @ExcelResources(title="第一个自定义",order=27)
    public String getFirstCustom() {
        return firstCustom;
    }

    public void setFirstCustom(String firstCustom) {
        this.firstCustom = firstCustom;
    }

    public String getSecondCustom() {
        return secondCustom;
    }

    public void setSecondCustom(String secondCustom) {
        this.secondCustom = secondCustom;
    }

    public String getThirdCustom() {
        return thirdCustom;
    }

    public void setThirdCustom(String thirdCustom) {
        this.thirdCustom = thirdCustom;
    }

    public String getFourthCustom() {
        return fourthCustom;
    }

    public void setFourthCustom(String fourthCustom) {
        this.fourthCustom = fourthCustom;
    }

    public String getFifthCustom() {
        return fifthCustom;
    }

    public void setFifthCustom(String fifthCustom) {
        this.fifthCustom = fifthCustom;
    }

    public String getSixthCustom() {
        return sixthCustom;
    }

    public void setSixthCustom(String sixthCustom) {
        this.sixthCustom = sixthCustom;
    }

    public String getSeventhCustom() {
        return seventhCustom;
    }

    public void setSeventhCustom(String seventhCustom) {
        this.seventhCustom = seventhCustom;
    }

    public String getEighthCustom() {
        return eighthCustom;
    }

    public void setEighthCustom(String eighthCustom) {
        this.eighthCustom = eighthCustom;
    }

    public String getNinthCustom() {
        return ninthCustom;
    }

    public void setNinthCustom(String ninthCustom) {
        this.ninthCustom = ninthCustom;
    }

    public String getTenthCustom() {
        return tenthCustom;
    }

    public void setTenthCustom(String tenthCustom) {
        this.tenthCustom = tenthCustom;
    }
}
