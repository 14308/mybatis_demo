package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class AtlRoleService extends BaseService<AtlRoleMapper,AtlRole> {
    private final AtlRoleMapper atlrolemapper;

    AtlRoleController(AtlRoleMapper atlrolemapper){
        this.atlrolemapper = atlrolemapper;
    }
}
