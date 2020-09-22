package com.example.legacy.publisher;

import com.example.legacy.data.ItemData;

import javax.xml.ws.Endpoint;
public class ItemPublisher {

    public static void main(String[] args) {
        String url = "http://localhost:8082/Item";
        Endpoint.publish(url, new ItemData());
    }
    public void publish() {
        String url = "http://localhost:8082/Item";
        Endpoint.publish(url, new ItemData());
    }
}
