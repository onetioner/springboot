package com.onesion.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author onesion
 * @version 1.0
 * @description Rest模式
 * @date 2025/3/27 22:04
 */
@RestController
@RequestMapping("/book")
public class BookController {

    // 读取yaml数据中单一数据
    @Value("${country}")
    private String country1;

    @Value("${user.name}")
    private String name1;

    @Value("${likes[1]}")
    private String likes1;

    @Value("${users[1].age}")
    private String age1;

    @Value("${server.port}")
    private String port;

    @Value("${tempDir}")
    private String tempDir;

    @GetMapping
    public String getById() {
        System.out.println("springboot is running...");

        System.out.println("country1========>" + country1);
        System.out.println("name1========>" + name1);
        System.out.println("likes1========>" + likes1);
        System.out.println("age1========>" + age1);
        System.out.println("port========>" + port);

        System.out.println("tempDir========>" + tempDir);

        return "springboot is running...";
    }
}
