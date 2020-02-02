package com.xdkt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdkt.dao")
public class InternationApplication {

    public static void main(String[] args) {

        SpringApplication.run(InternationApplication.class, args);
    }

}
