package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.PaymentRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentRequestDao {
    int insert(PaymentRequest paymentRequest);
    PaymentRequest findById(Integer prId);
    List<PaymentRequest> findAll(PaymentRequest paymentRequest);
    int update(PaymentRequest paymentRequest);
    int delete(Integer prId);
}

