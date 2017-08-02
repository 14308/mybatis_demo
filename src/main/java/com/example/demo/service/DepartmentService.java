package com.example.demo.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.domain.Department;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/20.
 */
@Service
@CacheConfig(cacheNames = {"Department"})
public class DepartmentService extends BaseService<DepartmentMapper,Department>{

    private final DepartmentMapper departmentMapper;

    public DepartmentService(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public Department selectByUserId(Long id){
        return departmentMapper.selectByUserId(id);
    }
    @Cacheable(key = "'com.example.demo.domain.Departmen'+#id")
    public Department selectByrId(Long id){
        System.out.println("Cacheable");
        return departmentMapper.selectById(id);
    }
    @CacheEvict(key = "#id")
    public Integer deleteById(Long id){
        return departmentMapper.deleteById(id);
    }

    public List<Department> search(String keyword){
        return departmentMapper.search(keyword);
    }
    public List<Department> selectDepartments(Page<Department> page){
        List<Department> list = departmentMapper.selectPage(page,new EntityWrapper<Department>());
        return list;
    }
//    @CachePut(key = "'com.example.demo.domain.Department'+#department.id")
    @CachePut(key="'DepartmentID='+#department.id+'DepartmentName='+#department.name")
    public Department create(Department department){
        System.out.println("CachePut");
        departmentMapper.insert(department);
        return  department;
    }
}
