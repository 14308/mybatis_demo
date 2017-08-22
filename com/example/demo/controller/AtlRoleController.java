package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/atlRole")
public class AtlRoleController {

    private final AtlRoleService atlroleservice;

    AtlRoleController(AtlRoleService atlroleservice){
        this.atlroleservice = atlroleservice;
    }

    @PostMapping()
    public ResponseEntity<AtlRole> createAtlRole(@RequestBody AtlRole atlrole){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<AtlRole>> createAtlRoleBatch(@RequestBody List<AtlRole> atlroles){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<AtlRole> update(@RequestBody AtlRole atlrole){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<AtlRole>> updateBatch(@RequestBody List<AtlRole> atlroles){
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
    public ResponseEntity<List<AtlRole>> get<AtlRole>>ByCond(){
        return ResponseEntity.ok();
    }
}
