package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.CustomerOrderMonthlyReportDao;
import com.dhee.fanmaisystem.entity.CustomerOrderMonthlyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderMonthlyReportServiceImpl implements CustomerOrderMonthlyReportService {
    @Autowired
    private CustomerOrderMonthlyReportDao reportDao;
    
    @Override
    public List<CustomerOrderMonthlyReport> generateReport(String month) {
        return reportDao.generateReport(month);
    }
}

