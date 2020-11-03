package com.apsh.legacy.publisher;

import com.apsh.legacy.service.ShiftService;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.ws.Endpoint;

public class ShiftPublisher implements Publisher {

    @Value("${legacy-system.shift.port}")
    private String port;

    @Value("${legacy-system.shift.context}")
    private String context;

    public void publish() {
        String url = String.format("http://localhost:%s/%s", port, context);
        Endpoint.publish(url, new ShiftService());
    }

}
