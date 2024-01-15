package com.accenture.pip.chuggydiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ChuggyDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuggyDiscoveryServiceApplication.class, args);
	}

}
