package com.apsh.legacy.publisher;

import com.apsh.legacy.service.OrderService;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.ws.Endpoint;

public class OrderPublisher implements Publisher {

    private static final String url = "http://localhost:9001/order";

    public void publish() {
        Endpoint.publish(url, new OrderService());
    }

}
