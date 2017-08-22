package com.example.demo.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/19.
 */

public interface UserMapper extends BaseMapper<User>{
    public List<User> selectByUnitId(Long id);

    public List<User> test(User user);

}
