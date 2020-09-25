package com.apsh.legacy.entity;

import java.beans.Transient;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @XmlElement(name = "itemCode")
    private String itemCode;
    @XmlElementWrapper(name = "ProductTechList")
    @XmlElement(name = "ProductTech")
    private List<ProductTech> techs;
    @XmlTransient
    public String getItemCode() {
        return itemCode;
    }
    @XmlTransient
    public List<ProductTech> getTechs() {
        return techs;
    }
}