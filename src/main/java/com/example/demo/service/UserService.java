package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/19.
 */
@Service
@CacheConfig(cacheNames = {"User"})
public class UserService extends BaseService<UserMapper,User>{

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<String,User> valueOperations;

    @Autowired
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> selectByUnitId(Long Unitid){
        return userMapper.selectByUnitId(Unitid);
    }
    @CachePut(key = "#user.id")
    public User crate(User user){
        user.setId(3l);
        userMapper.insert(user);
        return user;
    }

    public User findByUserName(String username){
        User user = new User();
        user.setUsername(username);
        return baseMapper.selectOne(user);
    }

    public Long getId(Long idf){
        return idf;
    }

    public List<User> tset(User user){
        return userMapper.test(user);
    }
}
