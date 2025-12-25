package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.StockInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockInfoDao {
    /**
     * 查询所有库存信息
     */
    List<StockInfo> findAll(StockInfo stockInfo);
    
    /**
     * 根据商品ID查询库存信息
     */
    StockInfo findByProductId(Integer pId);
    
    /**
     * 查询库存不足的商品
     */
    List<StockInfo> findLowStock();
}

