package com.imooc.oa.inputmateriel.entity;

import com.imooc.oa.materiel.entity.Materiel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 新增入库操作对应的实体类
 */
@Entity
//自动建表的表名
@Table(name = "inputmateriel")
public class InputMateriel {
    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键，采用自动递增的方式
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer inputMaterielId;
    //Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    //建立相应的数据库，变量如下

    @Column(nullable = false,name="product_name")
    private String productName;//入库物料名称

    @Column(nullable = true,name = "input_materiel_coding_prefix")
    private String  materielCodingPrefix;//入库物料编码前缀

    @Column(nullable=true)
    private String materielCode;//入库物料编码

    @Column(nullable=true)
    private String rohs;//入库物料的RoHS

    @Column(nullable=true)
    private String materielState;//入库物料状态

    @Column(nullable=true)
    private String ds;//入库物料的DS

    @Column(nullable=true)
    private String materielDescription;//入库物料描述

    @Column(nullable = true)
    private String serialNumber;//入库物料的规格或者型号

    @Column(nullable = true)
    private String manufacturer;//入库物料的生产厂商

    @Column(nullable = true)
    private String encapsulation;//入库物料的封装形式

    @Column(nullable = true)
    private String temperature;//入库物料的工作温度

    @Column(nullable=true)
    private String remarks;//入库物料备注

    @Column(nullable=true)
    private String pn;//入库物料的项目PN

    @Column(nullable=true)
    private String batchNumber;//入库物料的批次号

    @Column(nullable = true)
    private String seller;//入库物料的销售厂商

    @Column(nullable = true)
    private Integer quantity;//入库数量

    @Column(nullable = true)
    private Double productPrice;//入库产品的单价

    @Column(nullable = true)
    private String generalCategory;//入库产品所属大类

    @Column(nullable = true)
    private String smallClass;//入库产品所属小类

    @Column(nullable = true)
    private String codingRules;//入库产品的编码规则

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable=true)
    private Date shelfLife;//入库产品的有效期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable=true)
    private Date storageData;//入库日期

    @Column(nullable = true)
    private String materialReceivingWarehouse;//入库的仓库

    @Column(nullable=true)
    private String managementPersonne;//管理人员

    @Column(nullable = true)
    private Double totalAmount;//入库总金额

    @Column(nullable = true)
    private String unit;//单位

    @Column(nullable = true)
    private String deliverer;//交货人

    @Column(nullable = true)
    private String inputPerson;//入库人员

    @Column(nullable = true)
    private String orderNumber;//订单号

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


    public InputMateriel(){}

    public InputMateriel(String  materielCodingPrefix, String materielCode,String productName,String rohs,String materielState,
                         String ds, String materielDescription, String serialNumber,String manufacturer,String encapsulation,
                         String temperature,String remarks,String pn,String batchNumber,String seller, Integer quantity,
                         Double productPrice,String generalCategory, String smallClass, String codingRules,Date shelfLife,
                         Date storageData, String unit, String materialReceivingWarehouse,String managementPersonne,Double totalAmount
                         ,String deliverer,String inputPerson,String orderNumber,String firstCustom,
                         String secondCustom,String thirdCustom,String fourthCustom,String fifthCustom,String sixthCustom,
                         String seventhCustom,String eighthCustom,String ninthCustom,String tenthCustom){
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
        this.quantity=quantity;//入库数量
        this.productPrice=productPrice;//单价
        this.generalCategory=generalCategory;//大类
        this.smallClass=smallClass;//小类
        this.codingRules=codingRules;//编码规则
        this.shelfLife=shelfLife;//有效期
        this.storageData=storageData;//入库日期
        this.materialReceivingWarehouse=materialReceivingWarehouse;//存放仓库
        this.managementPersonne=managementPersonne;//管理人员
        this.unit=unit;//单位
        this.totalAmount=totalAmount;//总金额
        this.deliverer=deliverer;//交货人
        this.inputPerson=inputPerson;//入库人员
        this.orderNumber=orderNumber;//订单号
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


    public Integer getInputMaterielId() {
        return inputMaterielId;
    }

    public void setInputMaterielId(Integer inputMaterielId) {
        this.inputMaterielId = inputMaterielId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaterielCodingPrefix() {
        return materielCodingPrefix;
    }

    public void setMaterielCodingPrefix(String materielCodingPrefix) {
        this.materielCodingPrefix = materielCodingPrefix;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getRohs() {
        return rohs;
    }

    public void setRohs(String rohs) {
        this.rohs = rohs;
    }

    public String getMaterielState() {
        return materielState;
    }

    public void setMaterielState(String materielState) {
        this.materielState = materielState;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getMaterielDescription() {
        return materielDescription;
    }

    public void setMaterielDescription(String materielDescription) {
        this.materielDescription = materielDescription;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEncapsulation() {
        return encapsulation;
    }

    public void setEncapsulation(String encapsulation) {
        this.encapsulation = encapsulation;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getGeneralCategory() {
        return generalCategory;
    }

    public void setGeneralCategory(String generalCategory) {
        this.generalCategory = generalCategory;
    }

    public String getSmallClass() {
        return smallClass;
    }

    public void setSmallClass(String smallClass) {
        this.smallClass = smallClass;
    }

    public String getCodingRules() {
        return codingRules;
    }

    public void setCodingRules(String codingRules) {
        this.codingRules = codingRules;
    }

    public Date getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Date shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Date getStorageData() {
        return storageData;
    }

    public void setStorageData(Date storageData) {
        this.storageData = storageData;
    }

    public String getMaterialReceivingWarehouse() {
        return materialReceivingWarehouse;
    }

    public void setMaterialReceivingWarehouse(String materialReceivingWarehouse) {
        this.materialReceivingWarehouse = materialReceivingWarehouse;
    }

    public String getManagementPersonne() {
        return managementPersonne;
    }

    public void setManagementPersonne(String managementPersonne) {
        this.managementPersonne = managementPersonne;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDeliverer() {
        return deliverer;
    }

    public void setDeliverer(String deliverer) {
        this.deliverer = deliverer;
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

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
