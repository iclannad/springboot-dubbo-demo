package com.glinet.demo.dubbo.service;

import com.glinet.demo.dubbo.api.DemoService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}