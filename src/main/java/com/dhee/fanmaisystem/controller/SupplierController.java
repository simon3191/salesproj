package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.Supplier;
import com.dhee.fanmaisystem.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    
    @RequestMapping("/supplierlist")
    public String supplierList(Supplier supplier, Model model) {
        List<Supplier> list = supplierService.search(supplier);
        model.addAttribute("supplierList", list); //存数据
        return "supplier/list";
    }
}

