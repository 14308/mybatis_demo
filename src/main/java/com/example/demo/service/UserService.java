package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/19.
 */
@Service
public class UserService extends BaseService<UserMapper,User>{

    @Autowired
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> selectByUnitId(Long Unitid){
        System.out.println(userMapper);
        return userMapper.selectByUnitId(Unitid);
    }

    public User crate(User user){
        userMapper.insert(user);
        return user;
    }
}
