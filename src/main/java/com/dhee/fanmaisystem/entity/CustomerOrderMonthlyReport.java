package com.dhee.fanmaisystem.entity;

/**
 * 顾客订单月报实体类
 */
public class CustomerOrderMonthlyReport {
    private String reportMonth;      // 报表月份（YYYY/MM）
    private Integer cId;             // 顾客ID
    private String cName;            // 顾客名称
    private String cCode;            // 顾客编码
    private String cAddress;         // 顾客地址
    private Integer orderCount;       // 订单数量
    private Integer totalQuantity;   // 总数量
    private Double totalAmount;      // 总金额
    private String firstOrderDate;   // 首次订单日期
    private String lastOrderDate;    // 最后订单日期

    public CustomerOrderMonthlyReport() {
    }

    public String getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(String reportMonth) {
        this.reportMonth = reportMonth;
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

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getFirstOrderDate() {
        return firstOrderDate;
    }

    public void setFirstOrderDate(String firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public String getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }
}

