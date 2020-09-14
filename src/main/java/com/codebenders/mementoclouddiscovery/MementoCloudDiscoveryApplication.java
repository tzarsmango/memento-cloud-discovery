package com.codebenders.mementoclouddiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MementoCloudDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MementoCloudDiscoveryApplication.class, args);
    }

}
