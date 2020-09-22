package com.apsh.legacy.service;

import com.apsh.legacy.data.ItemData;
import com.apsh.legacy.entity.Item;
import com.apsh.legacy.entity.Items;
import com.apsh.legacy.util.Transformer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ItemService {

    private final ItemData itemData;

    public ItemService() {
        this.itemData = new ItemData();
    }

    @WebMethod
    public String getItemService() throws Exception {
        List<Item> res = itemData.getItems();
        Items its = new Items(res);
        Transformer<Items> jtx = new Transformer<>();
        return jtx.java2Xml(its);
    }

}
