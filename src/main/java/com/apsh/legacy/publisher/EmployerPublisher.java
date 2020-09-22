package com.apsh.legacy.publisher;

import com.apsh.legacy.data.EmployeeData;

import javax.xml.ws.Endpoint;

public class EmployerPublisher implements Publisher {

    public void publish() {
        String url = "http://localhost:8081/Employer";
        Endpoint.publish(url, new EmployeeData());
    }

}
