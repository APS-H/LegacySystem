package com.apsh.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="ProductDataPack")
public class Products {
    @XmlElementWrapper(name = "ProductList")
    @XmlElement(name = "Product")
    List<Product> productList;
}
