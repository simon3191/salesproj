package com.dhee.fanmaisystem.entity;

/**
 * 库存信息实体类
 */
public class StockInfo {
    private Integer pId;             // 商品ID
    private String pName;            // 商品名称
    private String pCode;            // 商品编码
    private String pCategory;        // 商品类别
    private String pUnit;            // 单位
    private Integer currentStock;    // 当前库存
    private Integer minStock;        // 最低库存（预警值）
    private Integer maxStock;        // 最高库存
    private Integer inQuantity;      // 入库数量（本月）
    private Integer outQuantity;     // 出库数量（本月）
    private String lastInDate;       // 最后入库日期
    private String lastOutDate;       // 最后出库日期
    private String stockStatus;      // 库存状态（充足/不足/缺货）
    private Integer sId;             // 供货商ID
    private String sName;            // 供货商名称（关联查询）

    public StockInfo() {
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

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public Integer getInQuantity() {
        return inQuantity;
    }

    public void setInQuantity(Integer inQuantity) {
        this.inQuantity = inQuantity;
    }

    public Integer getOutQuantity() {
        return outQuantity;
    }

    public void setOutQuantity(Integer outQuantity) {
        this.outQuantity = outQuantity;
    }

    public String getLastInDate() {
        return lastInDate;
    }

    public void setLastInDate(String lastInDate) {
        this.lastInDate = lastInDate;
    }

    public String getLastOutDate() {
        return lastOutDate;
    }

    public void setLastOutDate(String lastOutDate) {
        this.lastOutDate = lastOutDate;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
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
}

