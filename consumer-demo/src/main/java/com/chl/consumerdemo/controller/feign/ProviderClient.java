package com.chl.consumerdemo.controller.feign;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author:chihongliang
 * @date Created in 2021/2/1
 */

@FeignClient("service-provider")
public interface ProviderClient {

    @GetMapping("hello")
    String SayHello();
}
