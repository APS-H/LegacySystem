package com.apsh.legacy.publisher;


import com.apsh.legacy.service.EmployeeService;


import javax.xml.ws.Endpoint;

public class EmployerPublisher implements Publisher {

    public void publish() {
        String url = "http://localhost:8081/Employer";
        Endpoint.publish(url, new EmployeeService());
    }

}
