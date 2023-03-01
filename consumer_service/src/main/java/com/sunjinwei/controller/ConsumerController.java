package com.sunjinwei.controller;

import com.sunjinwei.dto.Result;
import com.sunjinwei.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.sunjinwei.controller
 * @author: sun jinwei
 * @create: 2023-03-02 07:36
 * @description:
 **/
@RestController
public class ConsumerController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @GetMapping("/consumer")
    public Result getServiceInfo() {
        return productFeignClient.getServiceInfo();
    }
}