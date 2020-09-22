package com.apsh.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResource {
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "capacity")
    private Integer capacity;
  
    @XmlElement(name = "changeLineTime")
    private Double changeLineTime;
    @XmlTransient
    public String getCode() {
        return code;
    }
    @XmlTransient
    public String getName() {
        return name;
    }
    @XmlTransient
  public Double getChangeLineTime() {
        return changeLineTime;
    }
    @XmlTransient
    public Integer getCapacity() {
        return capacity;
    }


    


}