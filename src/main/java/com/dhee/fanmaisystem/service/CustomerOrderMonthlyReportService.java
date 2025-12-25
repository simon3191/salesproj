package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.CustomerOrderMonthlyReport;

import java.util.List;

public interface CustomerOrderMonthlyReportService {
    /**
     * 生成顾客订单月报
     * @param month 月份（格式：YYYY-MM）
     * @return 月报数据列表
     */
    List<CustomerOrderMonthlyReport> generateReport(String month);
}

