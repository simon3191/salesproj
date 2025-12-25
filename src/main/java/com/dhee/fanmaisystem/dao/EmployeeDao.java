package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao {
    Employee findById(int eId);
}

