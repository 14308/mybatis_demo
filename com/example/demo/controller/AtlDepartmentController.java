package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/atlDepartment")
public class AtlDepartmentController {

    private final AtlDepartmentService atldepartmentservice;

    AtlDepartmentController(AtlDepartmentService atldepartmentservice){
        this.atldepartmentservice = atldepartmentservice;
    }

    @PostMapping()
    public ResponseEntity<AtlDepartment> createAtlDepartment(@RequestBody AtlDepartment atldepartment){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<AtlDepartment>> createAtlDepartmentBatch(@RequestBody List<AtlDepartment> atldepartments){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<AtlDepartment> update(@RequestBody AtlDepartment atldepartment){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<AtlDepartment>> updateBatch(@RequestBody List<AtlDepartment> atldepartments){
        return ResponseEntity.ok();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable Long id){
        return ResponseEntity.ok();
    }

    @DeleteMapping("/batch")
    public ResponseEntity delete (@PathVariable Long id){
        return ResponseEntity.ok();
    }
    @PostMapping("/query")
    public ResponseEntity<List<AtlDepartment>> get<AtlDepartment>>ByCond(){
        return ResponseEntity.ok();
    }
}
