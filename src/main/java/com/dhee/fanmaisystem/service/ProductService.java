package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.Product;

import java.util.List;

public interface ProductService {
    /**
     * 添加商品
     */
    int addProduct(Product product) throws Exception;
    
    /**
     * 查询商品列表
     */
    List<Product> search(Product product);
    
    /**
     * 根据ID查询商品
     */
    Product findById(Integer pId);
    
    /**
     * 更新商品
     */
    int update(Product product) throws Exception;
    
    /**
     * 删除商品
     */
    int delete(Integer pId) throws Exception;
}

