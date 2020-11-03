package com.apsh.legacy.publisher;

import com.apsh.legacy.service.OrderService;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.ws.Endpoint;

public class OrderPublisher implements Publisher {

    @Value("${legacy-system.order.port}")
    private String port;

    @Value("${legacy-system.order.context}")
    private String context;

    public void publish() {
        String url = String.format("http://localhost:%s/%s", port, context);
        Endpoint.publish(url, new OrderService());
    }

}
