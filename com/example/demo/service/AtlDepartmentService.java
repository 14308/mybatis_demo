package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class AtlDepartmentService extends BaseService<AtlDepartmentMapper,AtlDepartment> {
    private final AtlDepartmentMapper atldepartmentmapper;

    AtlDepartmentController(AtlDepartmentMapper atldepartmentmapper){
        this.atldepartmentmapper = atldepartmentmapper;
    }
}
