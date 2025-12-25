package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentDao {
    List<Department> findAll();
}

