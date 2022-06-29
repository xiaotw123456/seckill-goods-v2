package com.example.seckillgoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.seckillgoods")
@SpringBootApplication
public class SeckillGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillGoodsApplication.class, args);
    }

}
