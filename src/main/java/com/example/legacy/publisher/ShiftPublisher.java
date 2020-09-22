package com.example.legacy.publisher;


import com.example.legacy.data.ItemData;
import com.example.legacy.data.ShiftData;

import javax.xml.ws.Endpoint;

public class ShiftPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8085/Shift";
        Endpoint.publish(url, new ShiftData());
    }
    public void publish() {
        String url = "http://localhost:8085/Shift";
        Endpoint.publish(url, new ItemData());
    }
}
