package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * 插入订单
     */
    int insert(Order order);
    
    /**
     * 根据ID查询订单
     */
    Order findById(Integer oId);
    
    /**
     * 查询所有订单（支持条件查询）
     */
    List<Order> findAll(Order order);
    
    /**
     * 更新订单
     */
    int update(Order order);
    
    /**
     * 删除订单
     */
    int delete(Integer oId);
}

