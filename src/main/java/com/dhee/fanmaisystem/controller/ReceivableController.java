package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.Customer;
import com.dhee.fanmaisystem.entity.Order;
import com.dhee.fanmaisystem.entity.Receivable;
import com.dhee.fanmaisystem.service.CustomerService;
import com.dhee.fanmaisystem.service.OrderService;
import com.dhee.fanmaisystem.service.ReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ReceivableController {
    @Autowired
    private ReceivableService receivableService;
    
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private OrderService orderService;
    
    /**
     * 应收款列表
     */
    @RequestMapping("/receivable/list")
    public String list(Receivable receivable, Model model) {
        List<Receivable> list = receivableService.search(receivable);
        model.addAttribute("receivableList", list);
        model.addAttribute("receivable", receivable);
        return "receivable/list";
    }
    
    /**
     * 跳转到应收款登记页面
     */
    @RequestMapping("/receivable/toAdd")
    public String toAdd(Model model) {
        // 加载顾客列表
        List<Customer> customerList = customerService.search(new Customer());
        model.addAttribute("customerList", customerList);
        
        // 加载订单列表
        List<Order> orderList = orderService.search(new Order());
        model.addAttribute("orderList", orderList);
        
        return "receivable/add";
    }
    
    /**
     * 保存应收款登记
     */
    @RequestMapping("/receivable/save")
    public String save(Receivable receivable, Model model) {
        try {
            // 生成应收款编号
            if (receivable.getrNumber() == null || receivable.getrNumber().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                receivable.setrNumber("REC" + sdf.format(new Date()));
            }
            // 设置登记日期
            if (receivable.getrDate() == null || receivable.getrDate().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                receivable.setrDate(sdf.format(new Date()));
            }
            
            receivableService.addReceivable(receivable);
            model.addAttribute("msg", "应收款登记成功！");
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("msg", "应收款登记失败：" + e.getMessage());
            model.addAttribute("success", false);
        }
        
        // 重新加载数据
        List<Customer> customerList = customerService.search(new Customer());
        model.addAttribute("customerList", customerList);
        List<Order> orderList = orderService.search(new Order());
        model.addAttribute("orderList", orderList);
        
        return "receivable/add";
    }
}

