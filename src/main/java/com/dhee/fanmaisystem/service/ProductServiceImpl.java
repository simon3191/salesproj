package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.ProductDao;
import com.dhee.fanmaisystem.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    
    @Override
    public int addProduct(Product product) throws Exception {
        // 设置默认状态
        if (product.getpStatus() == null || product.getpStatus().isEmpty()) {
            product.setpStatus("在售");
        }
        // 设置默认库存
        if (product.getStock() == null) {
            product.setStock(0);
        }
        return productDao.insert(product);
    }
    
    @Override
    public List<Product> search(Product product) {
        return productDao.findAll(product);
    }
    
    @Override
    public Product findById(Integer pId) {
        return productDao.findById(pId);
    }
    
    @Override
    public int update(Product product) throws Exception {
        return productDao.update(product);
    }
    
    @Override
    public int delete(Integer pId) throws Exception {
        return productDao.delete(pId);
    }
}

