package com.leverx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.sap.cloud.sdk")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShaadtDemoApplication.class, args);
	}

}
