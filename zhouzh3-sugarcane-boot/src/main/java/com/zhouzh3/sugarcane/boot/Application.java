package com.zhouzh3.sugarcane.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.zhouzh3.sugarcane.**")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zhouzh3.sugarcane.api.feign")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
