package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class AsdService extends BaseService<AsdMapper,Asd> {
    private final AsdMapper asdmapper;

    AsdController(AsdMapper asdmapper){
        this.asdmapper = asdmapper;
    }
}
