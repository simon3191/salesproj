package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDao {
    /**
     * 插入商品
     */
    int insert(Product product);
    
    /**
     * 根据ID查询商品
     */
    Product findById(Integer pId);
    
    /**
     * 查询所有商品（支持条件查询）
     */
    List<Product> findAll(Product product);
    
    /**
     * 更新商品
     */
    int update(Product product);
    
    /**
     * 删除商品
     */
    int delete(Integer pId);
}

