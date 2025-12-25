package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.entity.Customer;

import java.util.List;

public interface CustomerService {
    int addCustomer(Customer customer) throws Exception;
    List<Customer> search(Customer customer);
    Customer findById(Integer cId);
    int update(Customer customer) throws Exception;
    int delete(Integer cId) throws Exception;
}

