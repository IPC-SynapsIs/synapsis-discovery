package org.ipc.synapsis.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SynapsisDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SynapsisDiscoveryApplication.class, args);
	}
}
