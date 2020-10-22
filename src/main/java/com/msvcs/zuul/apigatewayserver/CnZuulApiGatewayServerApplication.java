package com.msvcs.zuul.apigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
public class CnZuulApiGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnZuulApiGatewayServerApplication.class, args);
    }

}