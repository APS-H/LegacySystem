package com.apsh.legacy.publisher;

import com.apsh.legacy.data.ItemData;

import javax.xml.ws.Endpoint;

public class ItemPublisher implements Publisher {

    public void publish() {
        String url = "http://localhost:8082/Item";
        Endpoint.publish(url, new ItemData());
    }

}
