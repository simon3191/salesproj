package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.ProductOrderMonthlyReportDao;
import com.dhee.fanmaisystem.entity.ProductOrderMonthlyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOrderMonthlyReportServiceImpl implements ProductOrderMonthlyReportService {
    @Autowired
    private ProductOrderMonthlyReportDao reportDao;
    
    @Override
    public List<ProductOrderMonthlyReport> generateReport(String month) {
        return reportDao.generateReport(month);
    }
}

