package com.apsh.legacy.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "ItemDataPack")
public class Items {
    @XmlElementWrapper(name = "ItemList")
    @XmlElement(name = "Item")
    List<Item> ItemList;

    public Items(List<Item> itemList) {
        ItemList = itemList;
    }

    public Items() {

    }

}
