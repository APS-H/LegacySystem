package com.apsh.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @XmlElement(name = "number")
    private String number;
    @XmlElement(name = "itemCode")
    private String itemCode;
    @XmlElement(name = "count")
    private Integer count;
    @XmlElement(name = "date")
    private String date;

    @XmlTransient
    public String getNumber() {
        return number;
    }

    @XmlTransient
    public String getItemCode() {
        return itemCode;
    }

    @XmlTransient
    public Integer getCount() {
        return count;
    }

    @XmlTransient
    public String getDate() {
        return date;
    }
}