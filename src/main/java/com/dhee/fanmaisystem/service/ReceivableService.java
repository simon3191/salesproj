package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.Receivable;

import java.util.List;

public interface ReceivableService {
    int addReceivable(Receivable receivable) throws Exception;
    List<Receivable> search(Receivable receivable);
    Receivable findById(Integer rId);
    int update(Receivable receivable) throws Exception;
    int delete(Integer rId) throws Exception;
}

