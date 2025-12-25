package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.Product;
import com.dhee.fanmaisystem.entity.Supplier;
import com.dhee.fanmaisystem.service.ProductService;
import com.dhee.fanmaisystem.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @Autowired
    private SupplierService supplierService;
    
    /**
     * 商品列表查询页面
     */
    @RequestMapping("/product/list")
    public String list(Product product, Model model) {
        List<Product> productList = productService.search(product);
        model.addAttribute("productList", productList);
        model.addAttribute("product", product);
        return "product/list";
    }
    
    /**
     * 跳转到商品添加/编辑页面
     */
    @RequestMapping("/product/toEdit")
    public String toEdit(@RequestParam(required = false) Integer pId, Model model) {
        // 加载供货商列表
        List<Supplier> supplierList = supplierService.search(new Supplier());
        model.addAttribute("supplierList", supplierList);
        
        if (pId != null) {
            // 编辑模式，加载商品信息
            Product product = productService.findById(pId);
            model.addAttribute("product", product);
        } else {
            // 新增模式
            model.addAttribute("product", new Product());
        }
        
        return "product/edit";
    }
    
    /**
     * 保存商品（新增或更新）
     */
    @RequestMapping("/product/save")
    public String save(Product product, Model model) {
        try {
            if (product.getpId() != null) {
                // 更新
                productService.update(product);
                model.addAttribute("msg", "商品更新成功！");
            } else {
                // 新增
                productService.addProduct(product);
                model.addAttribute("msg", "商品添加成功！");
            }
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("msg", "操作失败：" + e.getMessage());
            model.addAttribute("success", false);
        }
        
        // 重新加载数据
        List<Supplier> supplierList = supplierService.search(new Supplier());
        model.addAttribute("supplierList", supplierList);
        
        return "product/edit";
    }
    
    /**
     * 删除商品
     */
    @RequestMapping("/product/delete")
    public String delete(@RequestParam Integer pId, Model model) {
        try {
            productService.delete(pId);
            model.addAttribute("msg", "商品删除成功！");
        } catch (Exception e) {
            model.addAttribute("msg", "删除失败：" + e.getMessage());
        }
        
        // 返回列表页面
        List<Product> productList = productService.search(new Product());
        model.addAttribute("productList", productList);
        return "product/list";
    }
}

