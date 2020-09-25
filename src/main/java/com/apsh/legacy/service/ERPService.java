package com.apsh.legacy.service;

import com.apsh.legacy.data.ItemData;
import com.apsh.legacy.data.ProductData;
import com.apsh.legacy.data.ResourceData;
import com.apsh.legacy.entity.Item;
import com.apsh.legacy.entity.Product;
import com.apsh.legacy.entity.Resource;

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
    public List<Item> getItemAll() {
        return itemData.getItems();
    }

    @WebMethod
    public List<Resource> getResourceAll() {
        return resourceData.getResources();
    }

    @WebMethod
    public List<Product> getProductAll() {
        return productData.getProducts();
    }

    @WebMethod
    public Resource getResourceByCode(String Code) {
        return resourceData.getResourcesByCode(Code);
    }

    @WebMethod
    public Item getItemByCode(String Code) {
        return resourceData.getItemByCode(Code);
    }

    @WebMethod
    public Product getProductByCode(String Code) {
        return resourceData.getProductByCode(Code);
    }
}
