package com.dhee.fanmaisystem.entity;

/**
 * 销售订单实体类（顾客订单）
 */
public class SalesOrder {
    private Integer soId;            // 销售订单ID
    private String soNumber;         // 销售订单编号
    private String soDate;           // 订单日期
    private Integer cId;              // 顾客ID
    private String cName;            // 顾客名称（关联查询）
    private Integer pId;             // 商品ID
    private String pName;            // 商品名称（关联查询）
    private Integer quantity;        // 数量
    private Double unitPrice;        // 单价
    private Double totalAmount;      // 总金额
    private String soStatus;         // 订单状态
    private String eId;              // 员工ID
    private String remark;           // 备注

    public SalesOrder() {
    }

    public Integer getSoId() {
        return soId;
    }

    public void setSoId(Integer soId) {
        this.soId = soId;
    }

    public String getSoNumber() {
        return soNumber;
    }

    public void setSoNumber(String soNumber) {
        this.soNumber = soNumber;
    }

    public String getSoDate() {
        return soDate;
    }

    public void setSoDate(String soDate) {
        this.soDate = soDate;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(String soStatus) {
        this.soStatus = soStatus;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

