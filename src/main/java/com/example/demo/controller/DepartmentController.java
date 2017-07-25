package com.example.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.domain.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by 陆小凤 on 2017/7/20.
 */
@RestController
@RequestMapping("/departments")
@PreAuthorize("hasRole('ADMIN')")
public class DepartmentController {
    private final DepartmentService departmentService;


    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    //分页查询部门
    @GetMapping("")
    public List<Department> getDepartments(int page,int size){
        Page<Department> page_ob = new Page(page,size);
        return departmentService.selectDepartments(page_ob);
    }
    //根据部门Id查出对应部门
    @GetMapping("{departmentId}")
    public Department getDepartmentByID(@PathVariable Long departmentId){
        return departmentService.selectById(departmentId);
    }
    //根据部门名称搜索部门列表,模糊查询
    @GetMapping("search")
    public List<Department> search(String keyword){
        return departmentService.search(keyword);
    }
    //创建一个部门
    @PostMapping("")
    public void createDepartment(@RequestBody Department department){
        department.setCreatedDate(ZonedDateTime.now());
        System.out.println(department);
        departmentService.insert(department);
    }
    //根据id更新部门
    @PutMapping("")
    public void update(@RequestBody Department department){
        System.out.println(department);
        departmentService.updateById(department);
    }
    //根据id删除部门
    @DeleteMapping("{departmentId}")
    public boolean delete(@PathVariable Long departmentId){
        return departmentService.deleteById(departmentId);
    }

}
