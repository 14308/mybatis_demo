package com.example.demo;


import com.example.demo.annotation.AnnotationDemo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication
@MapperScan("com.example.demo.mapper")

public class MybatisDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MybatisDemoApplication.class, args);
	}

	//自定义RedisTemplate的序列化方式，key-String,value-json


/*	//RedisConnectionFactory redisConnectionFactory

	@Bean
	public RedisConnectionFactory redisConnectionFactory(){
		 JedisConnectionFactory redisConnectionFactory=new JedisConnectionFactory();
		 return  redisConnectionFactory;
	}

	@Bean
	public RedisTemplate<Object, Object> redisTemplate() {
		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
		*//*redisTemplate.setConnectionFactory(redisConnectionFactory);*//*

		// 使用Jackson2JsonRedisSerialize 替换默认序列化
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

		jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

		// 设置value的序列化规则和 key的序列化规则
		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.afterPropertiesSet();
		return redisTemplate;
	}*/
}

