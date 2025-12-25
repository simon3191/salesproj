package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.SupplierDao;
import com.dhee.fanmaisystem.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
   @Autowired
   private SupplierDao supplierDao;
   
    @Override
    public List<Supplier> search(Supplier supplier) {
        return supplierDao.find(supplier);
    }
}

