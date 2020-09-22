package com.example.legacy.publisher;
import com.example.legacy.data.EmployerData;

import javax.xml.ws.Endpoint;

public class EmployerPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8081/Employer";
        Endpoint.publish(url, new EmployerData());
    }
    public void publish() {
        String url = "http://localhost:8081/Employer";
        Endpoint.publish(url, new EmployerData());
    }
}
