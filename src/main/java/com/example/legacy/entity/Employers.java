package com.example.legacy.entity;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "EmployerDataPack")
public class Employers{
    @XmlElementWrapper(name = "EmployerList")
    @XmlElement(name = "Employer")
    private List<Employer> EmployerList;

    public Employers(List<Employer> employerList) {
        EmployerList = employerList;
    }
    public Employers() {

    }
}