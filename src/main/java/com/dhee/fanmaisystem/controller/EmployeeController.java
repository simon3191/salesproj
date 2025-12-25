package com.dhee.fanmaisystem.controller;

import com.dhee.fanmaisystem.entity.Department;
import com.dhee.fanmaisystem.entity.Employee;
import com.dhee.fanmaisystem.service.DepartmentService;
import com.dhee.fanmaisystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private DepartmentService departmentService;
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping("/tologin") //请求映射
    public String index(Model model) {
        //调用Service层获取部门数据
        List<Department> list = departmentService.searchAll();
        //带着数据跳转到login.html
        model.addAttribute("deptList", list);
        //跳转到login.html
        //SpringMVC提供的视图解析器，会自动拼接前后缀，拼接之后跳转到templates/XX.html  SpringBoot热部署
        return "login";
    }
    
    @RequestMapping("/login")
    public String login123(Employee employee, Model model) { //方法参数接受画面传来的数据
        //调用业务逻辑层，进行业务处理
        try {
            boolean flag = employeeService.login(employee);
            if (flag) {
                //登录成功，跳转到index.html
                return "index";
            }
        } catch (Exception e) {
            //登录失败，要把错误信息传递给login.html
            model.addAttribute("msg", e.getMessage());
        }
        //根据业务逻辑的结果进行页面的跳转
        //登录失败，跳转到login.html
        List<Department> list = departmentService.searchAll();
        //带着数据跳转到login.html
        model.addAttribute("deptList", list);
        return "login";
    }
}

