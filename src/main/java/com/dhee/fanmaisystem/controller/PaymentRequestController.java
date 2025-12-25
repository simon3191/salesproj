package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.PaymentRequest;
import com.dhee.fanmaisystem.entity.Receivable;
import com.dhee.fanmaisystem.service.PaymentRequestService;
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
public class PaymentRequestController {
    @Autowired
    private PaymentRequestService paymentRequestService;
    
    @Autowired
    private ReceivableService receivableService;
    
    /**
     * 请求付款列表
     */
    @RequestMapping("/paymentrequest/list")
    public String list(PaymentRequest paymentRequest, Model model) {
        List<PaymentRequest> list = paymentRequestService.search(paymentRequest);
        model.addAttribute("requestList", list);
        model.addAttribute("paymentRequest", paymentRequest);
        return "paymentrequest/list";
    }
    
    /**
     * 跳转到请求付款页面
     */
    @RequestMapping("/paymentrequest/toAdd")
    public String toAdd(Model model) {
        // 加载应收款列表
        List<Receivable> receivableList = receivableService.search(new Receivable());
        model.addAttribute("receivableList", receivableList);
        return "paymentrequest/add";
    }
    
    /**
     * 保存请求付款
     */
    @RequestMapping("/paymentrequest/save")
    public String save(PaymentRequest paymentRequest, Model model) {
        try {
            // 生成请求编号
            if (paymentRequest.getPrNumber() == null || paymentRequest.getPrNumber().isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                paymentRequest.setPrNumber("REQ" + sdf.format(new Date()));
            }
            
            paymentRequestService.addPaymentRequest(paymentRequest);
            model.addAttribute("msg", "请求付款创建成功！");
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("msg", "请求付款创建失败：" + e.getMessage());
            model.addAttribute("success", false);
        }
        
        // 重新加载数据
        List<Receivable> receivableList = receivableService.search(new Receivable());
        model.addAttribute("receivableList", receivableList);
        
        return "paymentrequest/add";
    }
    
    /**
     * 发送付款请求
     */
    @RequestMapping("/paymentrequest/send")
    public String send(@RequestParam Integer prId, Model model) {
        try {
            paymentRequestService.sendRequest(prId);
            model.addAttribute("msg", "付款请求已发送！");
        } catch (Exception e) {
            model.addAttribute("msg", "发送失败：" + e.getMessage());
        }
        
        List<PaymentRequest> list = paymentRequestService.search(new PaymentRequest());
        model.addAttribute("requestList", list);
        return "paymentrequest/list";
    }
}

