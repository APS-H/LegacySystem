package com.apsh.legacy;

import com.apsh.legacy.publisher.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LegacyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegacyApplication.class, args);
        Publisher itemPublisher = new ItemPublisher();
        Publisher employerPublisher = new EmployerPublisher();
        Publisher orderPublisher = new OrderPublisher();
        Publisher resourcePublisher = new ResourcePublisher();
        Publisher shiftPublisher = new ShiftPublisher();
        itemPublisher.publish();
        employerPublisher.publish();
        orderPublisher.publish();
        resourcePublisher.publish();
        shiftPublisher.publish();
    }

}
