package com.example.legacy.publisher;


import com.example.legacy.data.ItemData;
import com.example.legacy.data.OrderData;

import javax.xml.ws.Endpoint;

public class OrderPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8083/Order";
        Endpoint.publish(url, new OrderData());
    }
    public void publish() {
        String url = "http://localhost:8083/Order";
        Endpoint.publish(url, new ItemData());
    }
}
