package com.sunjinwei.feign;

import com.sunjinwei.dto.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: com.sunjinwei.feign
 * @author: sun jinwei
 * @create: 2023-03-02 07:33
 * @description:
 **/
@Component
@FeignClient(value = "product-service", path = "/")
public interface ProductFeignClient {

    @GetMapping("product/info")
    Result getServiceInfo();


}
