package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.OrderDao;
import com.dhee.fanmaisystem.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    
    @Override
    public int addOrder(Order order) throws Exception {
        // 计算总金额
        if (order.getQuantity() != null && order.getUnitPrice() != null) {
            order.setTotalAmount(order.getQuantity() * order.getUnitPrice());
        }
        // 设置默认状态
        if (order.getStatus() == null || order.getStatus().isEmpty()) {
            order.setStatus("待处理");
        }
        return orderDao.insert(order);
    }
    
    @Override
    public List<Order> search(Order order) {
        return orderDao.findAll(order);
    }
    
    @Override
    public Order findById(Integer oId) {
        return orderDao.findById(oId);
    }
    
    @Override
    public int update(Order order) throws Exception {
        // 重新计算总金额
        if (order.getQuantity() != null && order.getUnitPrice() != null) {
            order.setTotalAmount(order.getQuantity() * order.getUnitPrice());
        }
        return orderDao.update(order);
    }
    
    @Override
    public int delete(Integer oId) throws Exception {
        return orderDao.delete(oId);
    }
}

