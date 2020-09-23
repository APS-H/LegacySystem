package com.apsh.legacy.service;

import com.apsh.legacy.data.OrderData;
import com.apsh.legacy.entity.Order;
import com.apsh.legacy.entity.Orders;
import com.apsh.legacy.util.Transformer;

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
    public List<Order> getOrderService() throws Exception {
        return orderData.getOrders();
//        Orders ods = new Orders(res);
//        Transformer<Orders> jtx = new Transformer<>();
//        return jtx.java2Xml(ods);
    }

}
