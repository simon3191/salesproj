package com.dhee.fanmaisystem.entity;

/**
 * 应收账款实体类
 */
public class Receivable {
    private Integer rId;              // 应收款ID
    private String rNumber;           // 应收款编号
    private String rDate;             // 登记日期
    private Integer cId;               // 顾客ID
    private String cName;             // 顾客名称（关联查询）
    private Integer oId;               // 关联订单ID
    private String oNumber;            // 订单编号（关联查询）
    private Double rAmount;           // 应收金额
    private Double receivedAmount;    // 已收金额
    private Double balanceAmount;      // 余额
    private String rStatus;           // 状态（未收款/部分收款/已收款）
    private String dueDate;           // 到期日期
    private String remark;            // 备注
    private String eId;               // 登记员工ID

    public Receivable() {
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
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

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoNumber() {
        return oNumber;
    }

    public void setoNumber(String oNumber) {
        this.oNumber = oNumber;
    }

    public Double getrAmount() {
        return rAmount;
    }

    public void setrAmount(Double rAmount) {
        this.rAmount = rAmount;
    }

    public Double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getrStatus() {
        return rStatus;
    }

    public void setrStatus(String rStatus) {
        this.rStatus = rStatus;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }
}

