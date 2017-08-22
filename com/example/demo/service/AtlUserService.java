package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class AtlUserService extends BaseService<AtlUserMapper,AtlUser> {
    private final AtlUserMapper atlusermapper;

    AtlUserController(AtlUserMapper atlusermapper){
        this.atlusermapper = atlusermapper;
    }
}
