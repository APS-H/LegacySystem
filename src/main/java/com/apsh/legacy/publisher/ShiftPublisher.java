package com.apsh.legacy.publisher;


import com.apsh.legacy.data.ShiftData;

import javax.xml.ws.Endpoint;

public class ShiftPublisher implements Publisher {

    public void publish() {
        String url = "http://localhost:8085/Shift";
        Endpoint.publish(url, new ShiftData());
    }

}
