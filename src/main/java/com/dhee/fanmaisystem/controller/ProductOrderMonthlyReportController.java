package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.ProductOrderMonthlyReport;
import com.dhee.fanmaisystem.service.ProductOrderMonthlyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class ProductOrderMonthlyReportController {
    @Autowired
    private ProductOrderMonthlyReportService reportService;
    
    /**
     * 商品订单月报页面
     */
    @RequestMapping("/report/product/monthly")
    public String monthlyReport(@RequestParam(required = false) String month, Model model) {
        // 如果未指定月份，使用当前月份
        if (month == null || month.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            Calendar cal = Calendar.getInstance();
            month = sdf.format(cal.getTime());
        }
        
        List<ProductOrderMonthlyReport> reportList = reportService.generateReport(month);
        model.addAttribute("reportList", reportList);
        model.addAttribute("reportMonth", month);
        
        return "report/product/monthly";
    }
    
    /**
     * 打印预览
     */
    @RequestMapping("/report/product/monthly/preview")
    public String preview(@RequestParam String month, Model model) {
        List<ProductOrderMonthlyReport> reportList = reportService.generateReport(month);
        model.addAttribute("reportList", reportList);
        model.addAttribute("reportMonth", month);
        return "report/product/monthly_preview";
    }
}

