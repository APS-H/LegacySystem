package com.example.legacy.publisher;


import com.example.legacy.data.ItemData;
import com.example.legacy.data.ResourceData;

import javax.xml.ws.Endpoint;

public class ResourcePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8084/Resource";
        Endpoint.publish(url, new ResourceData());
    }
    public void publish() {
        String url = "http://localhost:8084/Resource";
        Endpoint.publish(url, new ItemData());
    }
}
