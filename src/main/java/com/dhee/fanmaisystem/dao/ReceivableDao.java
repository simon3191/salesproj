package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Receivable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReceivableDao {
    int insert(Receivable receivable);
    Receivable findById(Integer rId);
    List<Receivable> findAll(Receivable receivable);
    int update(Receivable receivable);
    int delete(Integer rId);
    // 更新已收金额和余额
    int updateReceivedAmount(Integer rId, Double receivedAmount);
}

