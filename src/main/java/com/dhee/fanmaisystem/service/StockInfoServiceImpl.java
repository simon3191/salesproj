package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.StockInfoDao;
import com.dhee.fanmaisystem.entity.StockInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockInfoServiceImpl implements StockInfoService {
    @Autowired
    private StockInfoDao stockInfoDao;
    
    @Override
    public List<StockInfo> search(StockInfo stockInfo) {
        return stockInfoDao.findAll(stockInfo);
    }
    
    @Override
    public StockInfo findByProductId(Integer pId) {
        return stockInfoDao.findByProductId(pId);
    }
    
    @Override
    public List<StockInfo> findLowStock() {
        return stockInfoDao.findLowStock();
    }
}

