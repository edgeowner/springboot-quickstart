package com.example.quickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.quickstart.dao")
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}

}