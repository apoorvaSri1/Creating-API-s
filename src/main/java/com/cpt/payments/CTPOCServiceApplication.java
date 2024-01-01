package com.cpt.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.cpt.payments" })
public class CTPOCServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CTPOCServiceApplication.class, args);
		System.out.println("application started");
	}

}
