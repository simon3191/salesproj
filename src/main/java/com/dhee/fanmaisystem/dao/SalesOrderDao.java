package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.SalesOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesOrderDao {
    int insert(SalesOrder salesOrder);
    SalesOrder findById(Integer soId);
    List<SalesOrder> findAll(SalesOrder salesOrder);
    int update(SalesOrder salesOrder);
    int delete(Integer soId);
    // 查询指定月份的销售订单
    List<SalesOrder> findByMonth(String month);
}

