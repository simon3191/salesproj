package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.Order;

import java.util.List;

public interface OrderService {
    /**
     * 添加订单
     */
    int addOrder(Order order) throws Exception;
    
    /**
     * 查询订单列表
     */
    List<Order> search(Order order);
    
    /**
     * 根据ID查询订单
     */
    Order findById(Integer oId);
    
    /**
     * 更新订单
     */
    int update(Order order) throws Exception;
    
    /**
     * 删除订单
     */
    int delete(Integer oId) throws Exception;
}

