package com.dhee.fanmaisystem.entity;

/**
 * 顾客实体类
 */
public class Customer {
    private Integer cId;           // 顾客ID
    private String cName;         // 顾客名称
    private String cCode;         // 顾客编码
    private String cAddress;      // 地址
    private String cPostalCode;   // 邮编
    private String cPhone;        // 电话
    private String cFax;          // 传真
    private String cContact;      // 联系人
    private String cEmail;        // 邮箱
    private String cStatus;       // 状态（有效/无效）

    public Customer() {
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

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcPostalCode() {
        return cPostalCode;
    }

    public void setcPostalCode(String cPostalCode) {
        this.cPostalCode = cPostalCode;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getcFax() {
        return cFax;
    }

    public void setcFax(String cFax) {
        this.cFax = cFax;
    }

    public String getcContact() {
        return cContact;
    }

    public void setcContact(String cContact) {
        this.cContact = cContact;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }
}

