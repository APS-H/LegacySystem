package com.apsh.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shift {
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "beginTime")
    private String beginTime;
    @XmlElement(name = "endTime")
    private String endTime;

    @XmlTransient
    public String getCode() {
        return code;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    @XmlTransient
    public String getBeginTime() {
        return beginTime;
    }

    @XmlTransient
    public String getEndTime() {
        return endTime;
    }
}