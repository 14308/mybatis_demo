package com.example.demo.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.domain.Department;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/20.
 */
@Service
public class DepartmentService extends BaseService<DepartmentMapper,Department>{
    @Autowired
    private DepartmentMapper departmentMapper;

    public Department selectByUserId(Long id){
        return departmentMapper.selectByUserId(id);
    }
    public List<Department> search(String keyword){
        return departmentMapper.search(keyword);
    }
    public List<Department> selectDepartments(Page<Department> page){
        List<Department> list = departmentMapper.selectPage(page,new EntityWrapper<Department>());
        System.out.println(list);
        return list;
    }
}
