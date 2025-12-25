package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDao {
    int insert(Customer customer);
    Customer findById(Integer cId);
    List<Customer> findAll(Customer customer);
    int update(Customer customer);
    int delete(Integer cId);
}

