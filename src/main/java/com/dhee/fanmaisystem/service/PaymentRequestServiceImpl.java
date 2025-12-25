package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.PaymentRequestDao;
import com.dhee.fanmaisystem.entity.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PaymentRequestServiceImpl implements PaymentRequestService {
    @Autowired
    private PaymentRequestDao paymentRequestDao;
    
    @Override
    public int addPaymentRequest(PaymentRequest paymentRequest) throws Exception {
        // 设置默认状态
        if (paymentRequest.getRequestStatus() == null || paymentRequest.getRequestStatus().isEmpty()) {
            paymentRequest.setRequestStatus("待处理");
        }
        // 设置请求日期
        if (paymentRequest.getPrDate() == null || paymentRequest.getPrDate().isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            paymentRequest.setPrDate(sdf.format(new Date()));
        }
        return paymentRequestDao.insert(paymentRequest);
    }
    
    @Override
    public List<PaymentRequest> search(PaymentRequest paymentRequest) {
        return paymentRequestDao.findAll(paymentRequest);
    }
    
    @Override
    public PaymentRequest findById(Integer prId) {
        return paymentRequestDao.findById(prId);
    }
    
    @Override
    public int update(PaymentRequest paymentRequest) throws Exception {
        return paymentRequestDao.update(paymentRequest);
    }
    
    @Override
    public int delete(Integer prId) throws Exception {
        return paymentRequestDao.delete(prId);
    }
    
    @Override
    public int sendRequest(Integer prId) throws Exception {
        PaymentRequest request = paymentRequestDao.findById(prId);
        if (request == null) {
            throw new Exception("请求付款记录不存在");
        }
        request.setRequestStatus("已发送");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        request.setSendDate(sdf.format(new Date()));
        return paymentRequestDao.update(request);
    }
}

