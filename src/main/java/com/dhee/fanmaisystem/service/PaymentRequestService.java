package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.PaymentRequest;

import java.util.List;

public interface PaymentRequestService {
    int addPaymentRequest(PaymentRequest paymentRequest) throws Exception;
    List<PaymentRequest> search(PaymentRequest paymentRequest);
    PaymentRequest findById(Integer prId);
    int update(PaymentRequest paymentRequest) throws Exception;
    int delete(Integer prId) throws Exception;
    // 发送付款请求
    int sendRequest(Integer prId) throws Exception;
}

