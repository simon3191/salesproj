package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.ReceivableDao;
import com.dhee.fanmaisystem.entity.Receivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceivableServiceImpl implements ReceivableService {
    @Autowired
    private ReceivableDao receivableDao;
    
    @Override
    public int addReceivable(Receivable receivable) throws Exception {
        // 初始化已收金额和余额
        if (receivable.getReceivedAmount() == null) {
            receivable.setReceivedAmount(0.0);
        }
        if (receivable.getBalanceAmount() == null && receivable.getrAmount() != null) {
            receivable.setBalanceAmount(receivable.getrAmount() - receivable.getReceivedAmount());
        }
        // 设置默认状态
        if (receivable.getrStatus() == null || receivable.getrStatus().isEmpty()) {
            receivable.setrStatus("未收款");
        }
        return receivableDao.insert(receivable);
    }
    
    @Override
    public List<Receivable> search(Receivable receivable) {
        return receivableDao.findAll(receivable);
    }
    
    @Override
    public Receivable findById(Integer rId) {
        return receivableDao.findById(rId);
    }
    
    @Override
    public int update(Receivable receivable) throws Exception {
        // 重新计算余额
        if (receivable.getrAmount() != null && receivable.getReceivedAmount() != null) {
            receivable.setBalanceAmount(receivable.getrAmount() - receivable.getReceivedAmount());
            // 更新状态
            if (receivable.getBalanceAmount() <= 0) {
                receivable.setrStatus("已收款");
            } else if (receivable.getReceivedAmount() > 0) {
                receivable.setrStatus("部分收款");
            } else {
                receivable.setrStatus("未收款");
            }
        }
        return receivableDao.update(receivable);
    }
    
    @Override
    public int delete(Integer rId) throws Exception {
        return receivableDao.delete(rId);
    }
}

