package com.apsh.legacy.publisher;

import com.apsh.legacy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import javax.xml.ws.Endpoint;

@Component
public class EmployerPublisher implements Publisher {

    private static final String url = "http://localhost:9000/employer";

    public void publish() {
        Endpoint.publish(url, new EmployeeService());
    }

}
