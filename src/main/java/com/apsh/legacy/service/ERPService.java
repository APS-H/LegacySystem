package com.apsh.legacy.service;

import com.apsh.legacy.data.ItemData;
import com.apsh.legacy.data.ProductData;
import com.apsh.legacy.data.ResourceData;
import com.apsh.legacy.entity.*;
import com.apsh.legacy.util.Transformer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ERPService {
    private final ItemData itemData;
    private final ResourceData resourceData;
    private final ProductData producrData;
    public ERPService() {
        this.itemData = new ItemData();
        this.resourceData=new ResourceData();
        this.producrData=new ProductData();
    }

    @WebMethod
    public String getItemService() throws Exception {
        List<Item> res = itemData.getItems();
        Items its = new Items(res);
        Transformer<Items> jtx = new Transformer<>();
        return jtx.java2Xml(its);
    }

    @WebMethod
    public String getResourceService() throws Exception {
        List<Resource> res = resourceData.getResources();
        Resources rs = new Resources(res);
        Transformer<Resources> jtx = new Transformer<>();
        return jtx.java2Xml(rs);

    }

    @WebMethod
    public String getProductService() throws Exception {
        List<Product> res = producrData.getProducts();
        //System.out.println(res.size());
        Products rs = new Products(res);
        Transformer<Products> jtx = new Transformer<>();
        return jtx.java2Xml(rs);

    }

public static void main(String args[]) throws Exception {
        ERPService s=new ERPService();
        System.out.println(s.getProductService());
}
}
