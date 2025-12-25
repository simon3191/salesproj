package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.PaymentReceived;
import com.dhee.fanmaisystem.entity.Receivable;
import com.dhee.fanmaisystem.service.PaymentReceivedService;
import com.dhee.fanmaisystem.service.ReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PaymentReceivedController {
    @Autowired
    private PaymentReceivedService paymentReceivedService;
    
    @Autowired
    private ReceivableService receivableService;
    
    /**
     * 到款登录列表
     */
    @RequestMapping("/paymentreceived/list")
    public String list(PaymentReceived paymentReceived, Model model) {
        List<PaymentReceived> list = paymentReceivedService.search(paymentReceived);
        model.addAttribute("receivedList", list);
        model.addAttribute("paymentReceived", paymentReceived);
        return "paymentreceived/list";
    }
    
    /**
     * 跳转到到款登录页面
     */
    @RequestMapping("/paymentreceived/toAdd")
    public String toAdd(Model model) {
        // 加载应收款列表
        List<Receivable> receivableList = receivableService.search(new Receivable());
        model.addAttribute("receivableList", receivableList);
        return "paymentreceived/add";
    }
    
    /**
     * 保存到款登录
     */
    @RequestMapping("/paymentreceived/save")
    public String save(PaymentReceived paymentReceived, Model model) {
        try {
            // 生成到款编号
            if (paymentReceived.getPrNumber() == null || paymentReceived.getPrNumber().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                paymentReceived.setPrNumber("PAY" + sdf.format(new Date()));
            }
            
            paymentReceivedService.addPaymentReceived(paymentReceived);
            model.addAttribute("msg", "到款登录成功！");
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("msg", "到款登录失败：" + e.getMessage());
            model.addAttribute("success", false);
        }
        
        // 重新加载数据
        List<Receivable> receivableList = receivableService.search(new Receivable());
        model.addAttribute("receivableList", receivableList);
        
        return "paymentreceived/add";
    }
}

