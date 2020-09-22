package com.apsh.legacy.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "EmployerDataPack")
public class Employees {
    @XmlElementWrapper(name = "EmployerList")
    @XmlElement(name = "Employer")
    private List<Employee> employeeList;

    public Employees(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employees() {

    }
}