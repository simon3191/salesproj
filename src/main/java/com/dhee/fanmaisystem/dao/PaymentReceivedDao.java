package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.PaymentReceived;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentReceivedDao {
    int insert(PaymentReceived paymentReceived);
    PaymentReceived findById(Integer prId);
    List<PaymentReceived> findAll(PaymentReceived paymentReceived);
    int update(PaymentReceived paymentReceived);
    int delete(Integer prId);
}

