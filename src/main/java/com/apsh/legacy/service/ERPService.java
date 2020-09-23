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
    private final ProductData productData;

    public ERPService() {
        this.itemData = new ItemData();
        this.resourceData = new ResourceData();
        this.productData = new ProductData();
    }

    @WebMethod
    public List<Item>  getItemService() throws Exception {
        return itemData.getItems();
//        Items its = new Items(res);
//        Transformer<Items> jtx = new Transformer<>();
//        return jtx.java2Xml(its);
    }

    @WebMethod
    public List<Resource>  getResourceService() throws Exception {
       return resourceData.getResources();
//        Resources rs = new Resources(res);
//        Transformer<Resources> jtx = new Transformer<>();
//        return jtx.java2Xml(rs);

    }

    @WebMethod
    public  List<Product> getProductService() throws Exception {
        return producrData.getProducts();
//        //System.out.println(res.size());
//        Products rs = new Products(res);
//        Transformer<Products> jtx = new Transformer<>();
//        return jtx.java2Xml(rs);

    }


}
