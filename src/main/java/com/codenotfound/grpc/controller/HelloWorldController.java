package com.codenotfound.grpc.controller;

import com.codenotfound.grpc.client.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: grpc-spring-boot-helloworld
 * @description: 测试grp服务
 * @author: heidsoft
 * @create: 2018-11-09 14:01
 **/
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @GetMapping(path = "/say")
    public void sayHello(){
        helloWorldClient.sayHello("jake","liu");
    }
}
