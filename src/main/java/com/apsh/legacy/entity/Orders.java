package com.apsh.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "OrderDataPack")
public class Orders {
    @XmlElementWrapper(name = "OrderList")
    @XmlElement(name = "Order")
    List<Order> OrderList;

}
