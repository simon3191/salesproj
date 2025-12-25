package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.CustomerOrderMonthlyReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerOrderMonthlyReportDao {
    /**
     * 生成顾客订单月报
     * @param month 月份（格式：YYYY-MM）
     * @return 月报数据列表
     */
    List<CustomerOrderMonthlyReport> generateReport(@Param("month") String month);
}

