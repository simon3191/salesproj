package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.StockInfo;

import java.util.List;

public interface StockInfoService {
    /**
     * 查询所有库存信息
     */
    List<StockInfo> search(StockInfo stockInfo);
    
    /**
     * 根据商品ID查询库存信息
     */
    StockInfo findByProductId(Integer pId);
    
    /**
     * 查询库存不足的商品
     */
    List<StockInfo> findLowStock();
}

