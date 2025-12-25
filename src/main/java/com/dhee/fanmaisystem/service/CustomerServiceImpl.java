package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.CustomerDao;
import com.dhee.fanmaisystem.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    
    @Override
    public int addCustomer(Customer customer) throws Exception {
        if (customer.getcStatus() == null || customer.getcStatus().isEmpty()) {
            customer.setcStatus("有效");
        }
        return customerDao.insert(customer);
    }
    
    @Override
    public List<Customer> search(Customer customer) {
        return customerDao.findAll(customer);
    }
    
    @Override
    public Customer findById(Integer cId) {
        return customerDao.findById(cId);
    }
    
    @Override
    public int update(Customer customer) throws Exception {
        return customerDao.update(customer);
    }
    
    @Override
    public int delete(Integer cId) throws Exception {
        return customerDao.delete(cId);
    }
}

