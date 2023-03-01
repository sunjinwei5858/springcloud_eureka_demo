package com.sunjinwei.controller;

import com.sunjinwei.dto.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.sunjinwei.controller
 * @author: sun jinwei
 * @create: 2023-03-02 07:36
 * @description:
 **/
@RestController
public class ProductController {

    @Value("${spring.application.name}")
    private String instanceName;

    @GetMapping("product/info")
    public Result getServiceInfo() {

        return new Result(true, instanceName);
    }
}