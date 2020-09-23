package com.apsh.legacy.service;

import com.apsh.legacy.data.EmployeeData;
import com.apsh.legacy.entity.Employee;

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
    public  List<Employee> getEmployeesService() {
        return employeeData.getEmployees();
    }

}
