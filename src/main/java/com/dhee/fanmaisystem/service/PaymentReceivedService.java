package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.PaymentReceived;

import java.util.List;

public interface PaymentReceivedService {
    int addPaymentReceived(PaymentReceived paymentReceived) throws Exception;
    List<PaymentReceived> search(PaymentReceived paymentReceived);
    PaymentReceived findById(Integer prId);
    int update(PaymentReceived paymentReceived) throws Exception;
    int delete(Integer prId) throws Exception;
}

