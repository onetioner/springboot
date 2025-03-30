package com.onesion.controller;

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

    @GetMapping
    public String getById() {
        System.out.println("springboot is running...");
        return "springboot is running...2";
    }
}
