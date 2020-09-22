package com.apsh.legacy.entity;

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
public class ProductTech {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "employerCount")
    private Integer employerCount;
    @XmlElementWrapper(name = "materialList")
    @XmlElement(name = "ProductItem")
    private List<ProductItem> materials;
    @XmlElementWrapper(name = "resourceList")
    @XmlElement(name = "ProductResource")
    private List<ProductResource> resources;
    @XmlTransient
    public String getName() {
        return name;
    }
    @XmlTransient
    public Integer getEmployerCount() {
        return employerCount;
    }
    @XmlTransient
    public List<ProductItem> getMaterials() {
        return materials;
    }
    @XmlTransient
    public List<ProductResource> getResources() {
        return resources;
    }
}