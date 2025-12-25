package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.PaymentReceivedDao;
import com.dhee.fanmaisystem.dao.ReceivableDao;
import com.dhee.fanmaisystem.entity.PaymentReceived;
import com.dhee.fanmaisystem.entity.Receivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PaymentReceivedServiceImpl implements PaymentReceivedService {
    @Autowired
    private PaymentReceivedDao paymentReceivedDao;
    
    @Autowired
    private ReceivableDao receivableDao;
    
    @Override
    @Transactional
    public int addPaymentReceived(PaymentReceived paymentReceived) throws Exception {
        // 设置到款日期
        if (paymentReceived.getPrDate() == null || paymentReceived.getPrDate().isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            paymentReceived.setPrDate(sdf.format(new Date()));
        }
        
        int result = paymentReceivedDao.insert(paymentReceived);
        
        // 更新应收款的已收金额
        if (paymentReceived.getrId() != null && paymentReceived.getReceivedAmount() != null) {
            Receivable receivable = receivableDao.findById(paymentReceived.getrId());
            if (receivable != null) {
                Double newReceivedAmount = (receivable.getReceivedAmount() == null ? 0.0 : receivable.getReceivedAmount()) 
                                         + paymentReceived.getReceivedAmount();
                receivableDao.updateReceivedAmount(paymentReceived.getrId(), newReceivedAmount);
                
                // 更新应收款状态
                receivable.setReceivedAmount(newReceivedAmount);
                receivable.setBalanceAmount(receivable.getrAmount() - newReceivedAmount);
                if (receivable.getBalanceAmount() <= 0) {
                    receivable.setrStatus("已收款");
                } else {
                    receivable.setrStatus("部分收款");
                }
                receivableDao.update(receivable);
            }
        }
        
        return result;
    }
    
    @Override
    public List<PaymentReceived> search(PaymentReceived paymentReceived) {
        return paymentReceivedDao.findAll(paymentReceived);
    }
    
    @Override
    public PaymentReceived findById(Integer prId) {
        return paymentReceivedDao.findById(prId);
    }
    
    @Override
    public int update(PaymentReceived paymentReceived) throws Exception {
        return paymentReceivedDao.update(paymentReceived);
    }
    
    @Override
    public int delete(Integer prId) throws Exception {
        return paymentReceivedDao.delete(prId);
    }
}

