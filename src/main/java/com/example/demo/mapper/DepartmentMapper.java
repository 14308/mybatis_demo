package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.domain.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/20.
 */
public interface DepartmentMapper extends BaseMapper<Department>{
    public Department selectByUserId(Long UserId);
    public List<Department> search(String keyword);
}
