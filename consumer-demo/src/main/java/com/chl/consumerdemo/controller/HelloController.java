package com.chl.consumerdemo.controller;

import com.chl.consumerdemo.controller.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:chihongliang
 * @date Created in 2021/1/31
 */


@RestController
public class HelloController {

    @Value("${myName}")
    private String myName;

    @Autowired
    ProviderClient providerClient;
    @GetMapping("hi")
    public String sayHello() {
        return providerClient.SayHello();
    }

}
