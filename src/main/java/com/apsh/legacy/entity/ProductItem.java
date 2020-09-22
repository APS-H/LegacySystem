package com.apsh.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem {
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "count")
    private Integer count;
    @XmlTransient
    public String getCode() {
        return code;
    }
    @XmlTransient
    public Integer getCount() {
        return count;
    }
}