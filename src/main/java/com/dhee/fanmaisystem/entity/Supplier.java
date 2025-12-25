package com.dhee.fanmaisystem.entity;

public class Supplier {
    private Integer sId;
    private String sName;
    private String sAddress;
    private String sPostalCode;
    private String sPhone;
    private String sFax;
    private String sRDate;
    private String sEmployee;
    private Double outstandingPayment;

    public Supplier() {
    }

    public Supplier(Integer sId, String sName, String sAddress, String sPostalCode, String sPhone, String sFax, String sRDate, String sEmployee, Double outstandingPayment) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;
        this.sPostalCode = sPostalCode;
        this.sPhone = sPhone;
        this.sFax = sFax;
        this.sRDate = sRDate;
        this.sEmployee = sEmployee;
        this.outstandingPayment = outstandingPayment;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsPostalCode() {
        return sPostalCode;
    }

    public void setsPostalCode(String sPostalCode) {
        this.sPostalCode = sPostalCode;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsFax() {
        return sFax;
    }

    public void setsFax(String sFax) {
        this.sFax = sFax;
    }

    public String getsRDate() {
        return sRDate;
    }

    public void setsRDate(String sRDate) {
        this.sRDate = sRDate;
    }

    public String getsEmployee() {
        return sEmployee;
    }

    public void setsEmployee(String sEmployee) {
        this.sEmployee = sEmployee;
    }

    public Double getOutstandingPayment() {
        return outstandingPayment;
    }

    public void setOutstandingPayment(Double outstandingPayment) {
        this.outstandingPayment = outstandingPayment;
    }
}

