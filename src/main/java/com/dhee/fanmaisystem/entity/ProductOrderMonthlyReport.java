package com.dhee.fanmaisystem.entity;

/**
 * 商品订单月报实体类
 */
public class ProductOrderMonthlyReport {
    private String reportMonth;      // 报表月份（YYYY/MM）
    private Integer pId;             // 商品ID
    private String pName;            // 商品名称
    private String pCode;            // 商品编码
    private String pCategory;        // 商品类别
    private String pUnit;            // 单位
    private Integer orderCount;       // 订单数量
    private Integer totalQuantity;    // 总销售数量
    private Double totalAmount;       // 总销售金额
    private Double avgPrice;         // 平均单价
    private Integer customerCount;   // 顾客数量

    public ProductOrderMonthlyReport() {
    }

    public String getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(String reportMonth) {
        this.reportMonth = reportMonth;
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

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public String getpUnit() {
        return pUnit;
    }

    public void setpUnit(String pUnit) {
        this.pUnit = pUnit;
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

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Integer getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(Integer customerCount) {
        this.customerCount = customerCount;
    }
}

