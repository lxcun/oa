package com.imooc.oa.outputmateriel.entity;

import com.imooc.oa.utils.ExcelResources;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
//自动建表的表名
@Table(name = "outputmateriel")
public class OutputMateriel {

    //@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @Id
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键(JPA要求每一个实体Entity,必须有且只有一个主键，采用自动递增的方式
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer outputMaterielId;
    //Column注解来标识实体类中属性与数据表中字段的对应关系。nullable属性表示该字段是否可以为null值，默认为true。
    //建立相应的数据库，变量如下

    @Column(nullable = true,name="product_name")
    private String productName;//出库物料名称

    @Column(nullable = true,name="materiel_coding_prefix",length = 255)
    private String  materielCodingPrefix;//出库物料编码前缀

    @Column(nullable=true)
    private String materielCode;//出库物料编码

    @Column(nullable=true)
    private String rohs;//RoHS

    @Column(nullable=true)
    private String materielState;//物料状态

    @Column(nullable=true)
    private String materielDescription;//物料描述

    @Column(nullable = true)
    private String serialNumber;//规格或者型号

    @Column(nullable = true)
    private String approvalRating;//审批等级

    @Column(nullable = true)
    private String applicant;//申请人

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable=true)
    private Date outageTime;//出库时间

    @Column(nullable = true)
    private String unit;//单位

    @Column(nullable = true)
    private Integer outputQuantity;//出库数量

    @Column(nullable = true)
    private Double productPrice;//单格

    @Column(nullable = true)
    private String category;//类型

    @Column(nullable=true)
    private String remarks;//备注

    @Column(nullable = true)
    private Double totalAmount;//出库总金额

    @Column(nullable = true)
    private String warehouse;//仓库

    @Column(nullable = true)
    private Integer inventoryQuantity;//库存数量

    @Column(nullable = true)
    private String outputPlace;//出库地点

    @Column(nullable = true)
    private String checker;//核对人

    @Column(nullable = true)
    private String packingPerson;//装箱人

    @Column(nullable = true)
    private String outputUse;//出库用途

    @Column(nullable = true)
    private String approvalStatus;//审批状态

    @Column(nullable = true)
    private String firstApprover;//审批人1

    @Column(nullable = true)
    private String secondApprover;//审批人2

    @Column(nullable = true)
    private String thirdApprover;//审批人3

    @Column(nullable = true)
    private String fourthApprover;//审批人4

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

    public OutputMateriel() {}

    public OutputMateriel(String productName,String  materielCodingPrefix, String materielCode,
                          String rohs,String materielState, String materielDescription,
                          String serialNumber,String approvalRating, String  applicant,
                          Date outageTime, Integer outputQuantity,String remarks,Double totalAmount,
                          Integer inventoryQuantity,Double productPrice,String category,String unit,
                          String warehouse,String checker,String outputPlace, String packingPerson,
                          String outputUse,String approvalStatus, String firstApprover,
                          String secondApprover,String thirdApprover,String fourthApprover,
                          String firstCustom,String secondCustom,String thirdCustom,
                          String fourthCustom,String fifthCustom) {
        this.materielCodingPrefix=materielCodingPrefix;//物料编码前缀
        this.materielCode=materielCode;//物料编码
        this.productName =productName;//物料名称
        this.rohs=rohs;//ROHS
        this.materielState=materielState;//物料状态
        this.materielDescription=materielDescription;//物料描述
        this.serialNumber=serialNumber;//型号规格
        this.approvalRating=approvalRating;//审批等级
        this.applicant=applicant;//申请人
        this.outageTime=outageTime;//出库时间
        this.unit=unit;//单位
        this.outputQuantity=outputQuantity;//出库数量
        this.productPrice=productPrice;//单价
        this.category=category;//类型
        this.remarks=remarks;//备注
        this.totalAmount=totalAmount;//总金额
        this.warehouse=warehouse;//存放仓库
        this.inventoryQuantity=inventoryQuantity;//库存数量
        this.outputPlace=outputPlace;//出库地
        this.checker=checker;//核对人
        this.packingPerson=packingPerson;//装箱人
        this.outputUse=outputUse;//出库用途
        this.approvalStatus=approvalStatus;//审批状态
        this.firstApprover=firstApprover;//审批人1
        this.secondApprover=secondApprover;//审批人2
        this.thirdApprover=thirdApprover;//审批人3
        this.fourthApprover=fourthApprover;//审批人4
        this.firstCustom=firstCustom;//第一个自定义
        this.secondCustom=secondCustom;//第二个自定义
        this.thirdCustom=thirdCustom;//第三个自定义
        this.fourthCustom=fourthCustom;//第四个自定义
        this.fifthCustom=fifthCustom;//第五个自定义

    }

    @ExcelResources(title="出库产品名称",order=2)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @ExcelResources(title="出库产品编码前缀",order=3)
    public String getMaterielCodingPrefix() {
        return materielCodingPrefix;
    }

    public void setMaterielCodingPrefix(String materielCodingPrefix) {
        this.materielCodingPrefix = materielCodingPrefix;
    }

    @ExcelResources(title="出库产品编码",order=4)
    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    @ExcelResources(title="出库产品的Rohs",order=5)
    public String getRohs() {
        return rohs;
    }

    public void setRohs(String rohs) {
        this.rohs = rohs;
    }

    @ExcelResources(title="出库产品状态",order=6)
    public String getMaterielState() {
        return materielState;
    }

    public void setMaterielState(String materielState) {
        this.materielState = materielState;
    }

    @ExcelResources(title="出库产品描述",order=7)
    public String getMaterielDescription() {
        return materielDescription;
    }

    public void setMaterielDescription(String materielDescription) {
        this.materielDescription = materielDescription;
    }

    @ExcelResources(title="规格型号",order=8)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @ExcelResources(title="审批等级",order=9)
    public String getApprovalRating() {
        return approvalRating;
    }

    public void setApprovalRating(String approvalRating) {
        this.approvalRating = approvalRating;
    }

    @ExcelResources(title="申请人",order=10)
    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    @ExcelResources(title="出库时间",order=11)
    public Date getOutageTime() {
        return outageTime;
    }

    public void setOutageTime(Date outageTime) {
        this.outageTime = outageTime;
    }

    @ExcelResources(title="单位",order=12)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @ExcelResources(title="出库数量",order=14)
    public Integer getOutputQuantity() {
        return outputQuantity;
    }

    public void setOutputQuantity(Integer outputQuantity) {
        this.outputQuantity = outputQuantity;
    }

    @ExcelResources(title="单价",order=15)
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @ExcelResources(title="出库产品所属类别",order=16)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @ExcelResources(title="备注",order=17)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @ExcelResources(title="出库物品总价",order=18)
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @ExcelResources(title="仓库",order=19)
    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    @ExcelResources(title="剩余库存",order=20)
    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @ExcelResources(title="出库地点",order=21)
    public String getOutputPlace() {
        return outputPlace;
    }

    public void setOutputPlace(String outputPlace) {
        this.outputPlace = outputPlace;
    }

    @ExcelResources(title="核对人",order=22)
    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    @ExcelResources(title="装箱人",order=23)
    public String getPackingPerson() {
        return packingPerson;
    }

    public void setPackingPerson(String packingPerson) {
        this.packingPerson = packingPerson;
    }

    @ExcelResources(title="出库用途",order=24)
    public String getOutputUse() {
        return outputUse;
    }

    public void setOutputUse(String outputUse) {
        this.outputUse = outputUse;
    }

    @ExcelResources(title="审批状态",order=25)
    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @ExcelResources(title="审批人1",order=26)
    public String getFirstApprover() {
        return firstApprover;
    }

    public void setFirstApprover(String firstApprover) {
        this.firstApprover = firstApprover;
    }

    @ExcelResources(title="审批人2",order=27)
    public String getSecondApprover() {
        return secondApprover;
    }

    public void setSecondApprover(String secondApprover) {
        this.secondApprover = secondApprover;
    }

    @ExcelResources(title="审批人3",order=28)
    public String getThirdApprover() {
        return thirdApprover;
    }

    public void setThirdApprover(String thirdApprover) {
        this.thirdApprover = thirdApprover;
    }

    @ExcelResources(title="审批人4",order=29)
    public String getFourthApprover() {
        return fourthApprover;
    }

    public void setFourthApprover(String fourthApprover) {
        this.fourthApprover = fourthApprover;
    }

    @ExcelResources(title="自定义1",order=30)
    public String getFirstCustom() {
        return firstCustom;
    }

    public void setFirstCustom(String firstCustom) {
        this.firstCustom = firstCustom;
    }

    @ExcelResources(title="自定义2",order=31)
    public String getSecondCustom() {
        return secondCustom;
    }

    public void setSecondCustom(String secondCustom) {
        this.secondCustom = secondCustom;
    }

    @ExcelResources(title="自动义3",order=32)
    public String getThirdCustom() {
        return thirdCustom;
    }

    public void setThirdCustom(String thirdCustom) {
        this.thirdCustom = thirdCustom;
    }

    @ExcelResources(title="自定义4",order=33)
    public String getFourthCustom() {
        return fourthCustom;
    }

    public void setFourthCustom(String fourthCustom) {
        this.fourthCustom = fourthCustom;
    }

    @ExcelResources(title="自定义5",order=34)
    public String getFifthCustom() {
        return fifthCustom;
    }

    public void setFifthCustom(String fifthCustom) {
        this.fifthCustom = fifthCustom;
    }

    @ExcelResources(title="出库记录ID",order=1)
    public Integer getOutputMaterielId() {
        return outputMaterielId;
    }

    public void setOutputMaterielId(Integer outputMaterielId) {
        this.outputMaterielId = outputMaterielId;
    }
}
