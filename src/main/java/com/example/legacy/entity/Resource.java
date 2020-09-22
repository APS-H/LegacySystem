package com.example.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "type")
    private String type;
    @XmlElement(name = "count")
    private Integer count;
    @XmlElement(name = "day")
    private String day;
    @XmlElement(name = "shift")
    private String shift;
    @XmlTransient
    public String getCode() {
        return code;
    }
    @XmlTransient
    public String getName() {
        return name;
    }
    @XmlTransient
    public String getType() {
        return type;
    }
    @XmlTransient
    public Integer getCount() {
        return count;
    }
    @XmlTransient
    public String getDay() {
        return day;
    }
    @XmlTransient
    public String getShift() {
        return shift;
    }
}