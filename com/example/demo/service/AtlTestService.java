package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class AtlTestService extends BaseService<AtlTestMapper,AtlTest> {
    private final AtlTestMapper atltestmapper;

    AtlTestController(AtlTestMapper atltestmapper){
        this.atltestmapper = atltestmapper;
    }
}
