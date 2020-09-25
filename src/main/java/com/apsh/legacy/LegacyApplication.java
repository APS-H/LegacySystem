package com.apsh.legacy;

import com.apsh.legacy.publisher.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LegacyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegacyApplication.class, args);
        Publisher employerPublisher = new EmployerPublisher();
        Publisher orderPublisher = new OrderPublisher();
        Publisher shiftPublisher = new ShiftPublisher();
        Publisher erpPublisher = new ERPPublisher();
        employerPublisher.publish();
        orderPublisher.publish();
        erpPublisher.publish();
        shiftPublisher.publish();
    }

}
