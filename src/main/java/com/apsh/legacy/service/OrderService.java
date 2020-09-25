package com.apsh.legacy.service;

import com.apsh.legacy.data.OrderData;
import com.apsh.legacy.entity.Order;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class OrderService {

    private final OrderData orderData;

    public OrderService() {
        this.orderData = new OrderData();
    }

    @WebMethod
    public List<Order> getOrderAll() {
        return orderData.getOrders();
    }

    @WebMethod
    public Order getOrderById(String id) {
        return orderData.getOrderbyId(id);
    }

}
