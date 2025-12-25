package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.ProductOrderMonthlyReport;

import java.util.List;

public interface ProductOrderMonthlyReportService {
    /**
     * 生成商品订单月报
     * @param month 月份（格式：YYYY-MM）
     * @return 月报数据列表
     */
    List<ProductOrderMonthlyReport> generateReport(String month);
}

