package com.liushaoming.jseckill.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liushaoming.jseckill.backend.dao")
public class JseckillBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JseckillBackendApplication.class, args);
    }

}

