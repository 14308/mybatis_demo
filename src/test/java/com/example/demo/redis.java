package com.example.demo;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by 陆小凤 on 2017/7/28.
 */
public class redis {

    public static void a(int a){

    }
    public static void test(){

    }
    public static void main(String[] args){
        Zi zi = new Zi();

        Fu fu = zi;
        System.out.println(fu.id);
        /*Runnable runnable = () -> System.out.println("Hello Lambda Expressions");
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
        features.forEach(System.out::println);*/
    }
}
class Fu{
    public int id;
}
class Zi extends Fu{
    public int id;
    public String name;
}

