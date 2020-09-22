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
    private Double count;
    @XmlTransient
    public String getCode() {
        return code;
    }
    @XmlTransient
    public Double getCount() {
        return count;
    }

}