package com.apsh.legacy.publisher;



import com.apsh.legacy.service.ResourceService;

import javax.xml.ws.Endpoint;

public class ResourcePublisher implements Publisher {

    public void publish() {
        String url = "http://localhost:8084/Resource";
        Endpoint.publish(url, new ResourceService());
    }

}
