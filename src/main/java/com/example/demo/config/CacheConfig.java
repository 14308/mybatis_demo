package com.example.demo.config;

import com.example.demo.domain.keyToStringDome;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * Created by 陆小凤 on 2017/7/28.
 */
@Configuration
@EnableCaching
@EnableConfigurationProperties({RedisProperties.class})
public class CacheConfig {

	private final RedisProperties redisProperties;

	public CacheConfig(RedisProperties redisProperties) {
		this.redisProperties = redisProperties;
	}

	@Bean
    public CacheManager cacheManager() {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate(redisConnectionFactory()));
        return cacheManager;
    }

	@Bean
	public RedisConnectionFactory redisConnectionFactory(){
		 JedisConnectionFactory redisConnectionFactory=new JedisConnectionFactory();
		 redisConnectionFactory.setPort(redisProperties.getPort());
		 return  redisConnectionFactory;
	}

	@Bean
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory);

		// 使用Jackson2JsonRedisSerialize 替换默认序列化
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
   /*     JavaTimeModule timeModule = new JavaTimeModule();
        timeModule.addSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        objectMapper.registerModule(timeModule);
        objectMapper.setTimeZone(TimeZone.getDefault());*/

		jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

		// 设置value的序列化规则和 key的序列化规则
		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
		redisTemplate.setKeySerializer(new GenericJackson2JsonRedisSerializer(new ObjectMapper()));
		redisTemplate.afterPropertiesSet();
		return redisTemplate;
	}

	@Bean
	public KeyGenerator keyGenerator() {
		return (o, method, objects) -> {
			StringBuilder sb = new StringBuilder();
			sb.append(o.getClass().getName());
			sb.append(".");
			sb.append(method.getName());
			sb.append("-");
			for (Object obj : objects) {
				sb.append(obj.toString());
			}
			return sb.toString();
		};
	}

    @Bean(value = "keyGenerator2")
    public KeyGenerator keyGenerator3() {
	    //jdk 1.8新特性，只有一个实现方法时不关心方法名
        //这里相当于@Override
        //public Object generate(Object o, Method method, Object... objects) ｛xxx｝
        return (o, method, objects) -> {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objects) {
                if(obj instanceof keyToStringDome){
                    keyToStringDome keyToStringDome = (keyToStringDome) obj;
                    sb.append(obj.getClass().getName());
                    sb.append(".");
                    sb.append(keyToStringDome.keyToString());
                }
            }
            return sb.toString();
        };
    }
//@Bean
//public KeyGenerator keyGenerator() {
//	System.out.println("RedisCacheConfig.keyGenerator()");
//	return new KeyGenerator() {
//		@Override
//		public Object generate(Object o, Method method, Object... objects) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(o.getClass().getName());
//			sb.append(method.getName());
//			for (Object obj : objects) {
//				sb.append(obj.toString());
//			}
//			System.out.println("keyGenerator=" + sb.toString());
//			return sb.toString();
//		}
//
//	};
//}
}
