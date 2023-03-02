package com.sunjinwei.controller;

import com.netflix.discovery.DiscoveryManager;
import com.sunjinwei.dto.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.sunjinwei
 * @author: sun jinwei
 * @create: 2023-03-02 08:10
 * @description:
 **/
@RestController
public class ProductController {

    @Value("${spring.application.name}")
    private String instanceName;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("product/info")
    public Result getServiceInfo() {

        return new Result(true, instanceName + ":" + serverPort);

    }

    /**
     * 在Eureka客户端中调用下线请求
     */
    @GetMapping("/offline")
    public Result offLine() {
        DiscoveryManager.getInstance().shutdownComponent();

        return new Result(true, "下线===" + instanceName + ":" + serverPort);

    }
}