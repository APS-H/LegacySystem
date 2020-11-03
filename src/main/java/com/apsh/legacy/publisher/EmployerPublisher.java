package com.apsh.legacy.publisher;

import com.apsh.legacy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Value;


import javax.xml.ws.Endpoint;

public class EmployerPublisher implements Publisher {

    @Value("${legacy-system.employer.port}")
    private String port;

    @Value("${legacy-system.employer.context}")
    private String context;

    public void publish() {
        String url = String.format("http://localhost:%s/%s", port, context);
        Endpoint.publish(url, new EmployeeService());
    }

}
