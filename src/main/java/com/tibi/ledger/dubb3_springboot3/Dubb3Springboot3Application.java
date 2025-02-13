package com.tibi.ledger.dubb3_springboot3;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.tibi.ledger.*")
public class Dubb3Springboot3Application {

    public static void main(String[] args) {
        SpringApplication.run(Dubb3Springboot3Application.class, args);
    }

}
