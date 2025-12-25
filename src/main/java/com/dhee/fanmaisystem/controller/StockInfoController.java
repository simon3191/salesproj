package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.StockInfo;
import com.dhee.fanmaisystem.service.StockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StockInfoController {
    @Autowired
    private StockInfoService stockInfoService;
    
    /**
     * 库存信息确认页面
     */
    @RequestMapping("/stock/info")
    public String stockInfo(StockInfo stockInfo, Model model) {
        List<StockInfo> stockList = stockInfoService.search(stockInfo);
        model.addAttribute("stockList", stockList);
        model.addAttribute("stockInfo", stockInfo);
        return "stock/info";
    }
    
    /**
     * 库存不足预警
     */
    @RequestMapping("/stock/lowstock")
    public String lowStock(Model model) {
        List<StockInfo> lowStockList = stockInfoService.findLowStock();
        model.addAttribute("lowStockList", lowStockList);
        return "stock/lowstock";
    }
}

