package com.apsh.legacy.service;

import com.apsh.legacy.data.EmployeeData;
import com.apsh.legacy.entity.Employee;
import com.apsh.legacy.entity.Employees;
import com.apsh.legacy.util.Transformer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class EmployeeService {

    private final EmployeeData employeeData;

    public EmployeeService() {
        this.employeeData = new EmployeeData();
    }

    @WebMethod
    public String getEmployeesService() throws Exception {
        List<Employee> res = employeeData.getEmployees();
        Employees emd = new Employees(res);
        Transformer<Employees> jtx = new Transformer<>();
        return jtx.java2Xml(emd);
    }

}
