package com.chl.providerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:chihongliang
 * @date Created in 2021/1/31
 */

@RestController
@RefreshScope
public class HelloController {

    @Value("${myName}")
    private String myName;

    @GetMapping("hello")
    public String SayHello() {
        return "===我是服务提供方提供的数据====" + myName;
    }
}
