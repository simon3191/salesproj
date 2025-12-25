package com.dhee.fanmaisystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 华信贩卖系统 - Spring Boot 启动类
 * 
 * @author System
 */
@SpringBootApplication
@MapperScan("com.dhee.fanmaisystem.dao")
public class FanmaiSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanmaiSystemApplication.class, args);
    }
}

