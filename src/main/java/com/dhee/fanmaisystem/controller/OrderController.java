package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.Order;
import com.dhee.fanmaisystem.entity.Product;
import com.dhee.fanmaisystem.entity.Supplier;
import com.dhee.fanmaisystem.service.OrderService;
import com.dhee.fanmaisystem.service.ProductService;
import com.dhee.fanmaisystem.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @Autowired
    private SupplierService supplierService;
    
    @Autowired
    private ProductService productService;
    
    /**
     * 跳转到订单输入页面
     */
    @RequestMapping("/order/input")
    public String toInput(Model model) {
        // 加载供货商列表
        List<Supplier> supplierList = supplierService.search(new Supplier());
        model.addAttribute("supplierList", supplierList);
        
        // 加载商品列表
        List<Product> productList = productService.search(new Product());
        model.addAttribute("productList", productList);
        
        return "order/input";
    }
    
    /**
     * 保存订单
     */
    @RequestMapping("/order/save")
    public String save(Order order, Model model) {
        try {
            // 生成订单编号（格式：ORD + 日期时间戳）
            if (order.getoNumber() == null || order.getoNumber().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                order.setoNumber("ORD" + sdf.format(new Date()));
            }
            // 设置订单日期
            if (order.getoDate() == null || order.getoDate().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                order.setoDate(sdf.format(new Date()));
            }
            
            orderService.addOrder(order);
            model.addAttribute("msg", "订单添加成功！");
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("msg", "订单添加失败：" + e.getMessage());
            model.addAttribute("success", false);
        }
        
        // 重新加载数据
        List<Supplier> supplierList = supplierService.search(new Supplier());
        model.addAttribute("supplierList", supplierList);
        List<Product> productList = productService.search(new Product());
        model.addAttribute("productList", productList);
        
        return "order/input";
    }
    
    /**
     * 订单列表查询
     */
    @RequestMapping("/order/list")
    public String list(Order order, Model model) {
        List<Order> orderList = orderService.search(order);
        model.addAttribute("orderList", orderList);
        model.addAttribute("order", order);
        return "order/list";
    }
}

