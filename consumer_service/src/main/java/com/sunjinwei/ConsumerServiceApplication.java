package com.sunjinwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: com.sunjinwei
 * @author: sun jinwei
 * @create: 2023-03-02 07:26
 * @description:
 **/
@EnableEurekaClient
@SpringBootApplication
public class ConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceApplication.class, args);

    }
}