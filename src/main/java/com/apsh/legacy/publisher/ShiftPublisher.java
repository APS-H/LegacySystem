package com.apsh.legacy.publisher;

import com.apsh.legacy.service.ShiftService;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.ws.Endpoint;

public class ShiftPublisher implements Publisher {

    private static final String url = "http://0.0.0.0:9002/shift";

    public void publish() {
        Endpoint.publish(url, new ShiftService());
    }

}
