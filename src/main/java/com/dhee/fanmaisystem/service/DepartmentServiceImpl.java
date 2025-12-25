package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.DepartmentDao;
import com.dhee.fanmaisystem.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired //自动装配  DI-》依赖注入
    private DepartmentDao departmentDao;
    
    @Override
    public List<Department> searchAll() {
        //调用dao层获取数据
        return departmentDao.findAll();
    }
}

