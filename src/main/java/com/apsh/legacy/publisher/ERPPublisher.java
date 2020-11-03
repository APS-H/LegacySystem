package com.apsh.legacy.publisher;

import com.apsh.legacy.service.ERPService;
import org.springframework.beans.factory.annotation.Value;


import javax.xml.ws.Endpoint;

public class ERPPublisher implements Publisher {

    @Value("${legacy-system.erp.port}")
    private String port;

    @Value("${legacy-system.erp.context}")
    private String context;

    @Override
    public void publish() {
        String url = String.format("http://localhost:%s/%s", port, context);
        Endpoint.publish(url, new ERPService());
    }

}
