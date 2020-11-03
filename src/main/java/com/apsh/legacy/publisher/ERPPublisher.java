package com.apsh.legacy.publisher;

import com.apsh.legacy.service.ERPService;
import org.springframework.beans.factory.annotation.Value;


import javax.xml.ws.Endpoint;

public class ERPPublisher implements Publisher {

    private static final String url = "http://localhost:9003/erp";

    @Override
    public void publish() {
        Endpoint.publish(url, new ERPService());
    }

}
