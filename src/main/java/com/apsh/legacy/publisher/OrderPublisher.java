package com.apsh.legacy.publisher;



import com.apsh.legacy.service.OrderService;

import javax.xml.ws.Endpoint;

public class OrderPublisher implements Publisher {

    public void publish() {
        String url = "http://localhost:8083/Order";
        Endpoint.publish(url, new OrderService());
    }

}
