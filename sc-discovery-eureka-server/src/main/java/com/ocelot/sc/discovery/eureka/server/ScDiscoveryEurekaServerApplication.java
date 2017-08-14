package com.ocelot.sc.discovery.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScDiscoveryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDiscoveryEurekaServerApplication.class, args);
	}
}
