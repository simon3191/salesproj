package com.dhee.fanmaisystem.entity;

/**
 * 请求付款实体类
 */
public class PaymentRequest {
    private Integer prId;             // 请求付款ID
    private String prNumber;          // 请求编号
    private String prDate;            // 请求日期
    private Integer rId;               // 应收款ID
    private String rNumber;           // 应收款编号（关联查询）
    private Integer cId;               // 顾客ID
    private String cName;             // 顾客名称（关联查询）
    private Double requestAmount;     // 请求金额
    private String requestStatus;     // 请求状态（待处理/已发送/已确认/已拒绝）
    private String sendDate;          // 发送日期
    private String confirmDate;        // 确认日期
    private String remark;            // 备注
    private String eId;               // 请求员工ID

    public PaymentRequest() {
    }

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public String getPrNumber() {
        return prNumber;
    }

    public void setPrNumber(String prNumber) {
        this.prNumber = prNumber;
    }

    public String getPrDate() {
        return prDate;
    }

    public void setPrDate(String prDate) {
        this.prDate = prDate;
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

    public Double getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(Double requestAmount) {
        this.requestAmount = requestAmount;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
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

