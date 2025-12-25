package com.dhee.fanmaisystem.dao;

import com.dhee.fanmaisystem.entity.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierDao {
    Supplier findById(int sId);
    List<Supplier> find(Supplier supplier);
    int insert(Supplier supplier);
    int update(Supplier supplier);
    int delete(int sId);
}

