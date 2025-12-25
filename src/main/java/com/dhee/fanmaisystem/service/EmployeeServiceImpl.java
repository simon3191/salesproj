package com.dhee.fanmaisystem.service;

import com.dhee.fanmaisystem.dao.EmployeeDao;
import com.dhee.fanmaisystem.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    
    @Override
    public boolean login(Employee employee) throws Exception {
        //employee参数，存放的是画面传递过来的数据
        //调用dao层通过员工编号获取员工数据
        //e:是数据库查询出来的数据
        Employee e = employeeDao.findById(employee.geteId());
        //根据获得的数据进行登录逻辑的判断
        if (e == null) {
            throw new Exception("用户不存在");
        }
        if (!e.getdId().equals(employee.getdId())) {
            throw new Exception("该部门没有员工");
        }
        if (!e.getePassword().equals(employee.getePassword())) {
            throw new Exception("密码错误");
        }
        return true;
    }
}

