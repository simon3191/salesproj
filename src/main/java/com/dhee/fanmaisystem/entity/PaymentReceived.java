package com.dhee.fanmaisystem.entity;

/**
 * 到款登录实体类
 */
public class PaymentReceived {
    private Integer prId;             // 到款ID
    private String prNumber;          // 到款编号
    private String prDate;            // 到款日期
    private Integer rId;               // 应收款ID
    private String rNumber;           // 应收款编号（关联查询）
    private Integer cId;               // 顾客ID
    private String cName;             // 顾客名称（关联查询）
    private Double receivedAmount;    // 到款金额
    private String paymentMethod;     // 付款方式（现金/银行转账/支票/其他）
    private String bankName;          // 银行名称
    private String accountNumber;     // 账户号码
    private String receiptNumber;     // 收据编号
    private String remark;            // 备注
    private String eId;               // 登记员工ID

    public PaymentReceived() {
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

    public Double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
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

