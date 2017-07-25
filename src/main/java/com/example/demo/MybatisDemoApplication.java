package com.example.demo;


import com.helioscloud.atlantis.annotation.EnableHeliosBasedConfiguration;
import com.helioscloud.atlantis.annotation.EnableHeliosWeb;
import com.helioscloud.atlantis.annotation.EnableMyBatis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;


//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication
@MapperScan("com.example.demo.mapper")

public class MybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}
}
