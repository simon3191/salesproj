package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.ProductOrderMonthlyReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductOrderMonthlyReportDao {
    /**
     * 生成商品订单月报
     * @param month 月份（格式：YYYY-MM）
     * @return 月报数据列表
     */
    List<ProductOrderMonthlyReport> generateReport(@Param("month") String month);
}

