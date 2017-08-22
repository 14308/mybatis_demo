package com.example.demo.config;

import com.example.demo.domain.Department;
import com.example.demo.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 陆小凤 on 2017/8/3.
 */
@Configuration
public class AnnotationConfig {
    @Bean
    public Department department(){
        System.out.println("-------------------BEAN-----------");
        return new Department();
    }
}
