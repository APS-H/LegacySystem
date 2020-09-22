package com.example.legacy;

import com.example.legacy.publisher.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LegacyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegacyApplication.class, args);
		ItemPublisher s1=new ItemPublisher();
		EmployerPublisher s2=new EmployerPublisher();
		OrderPublisher s3=new OrderPublisher();
		ResourcePublisher s4=new ResourcePublisher();
		ShiftPublisher s5=new ShiftPublisher();
		s1.publish();
		s2.publish();
		s3.publish();
		s4.publish();
		s5.publish();


	}

}
