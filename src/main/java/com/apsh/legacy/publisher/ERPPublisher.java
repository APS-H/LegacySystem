package com.apsh.legacy.publisher;

import com.apsh.legacy.service.ERPService;


import javax.xml.ws.Endpoint;

public class ERPPublisher implements Publisher {
    @Override
    public void publish() {
        String url = "http://localhost:8086/ERP";
        Endpoint.publish(url, new ERPService());
    }
}
