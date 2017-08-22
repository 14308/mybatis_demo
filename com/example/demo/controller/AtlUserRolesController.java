package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/atlUserRoles")
public class AtlUserRolesController {

    private final AtlUserRolesService atluserrolesservice;

    AtlUserRolesController(AtlUserRolesService atluserrolesservice){
        this.atluserrolesservice = atluserrolesservice;
    }

    @PostMapping()
    public ResponseEntity<AtlUserRoles> createAtlUserRoles(@RequestBody AtlUserRoles atluserroles){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<AtlUserRoles>> createAtlUserRolesBatch(@RequestBody List<AtlUserRoles> atluserroless){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<AtlUserRoles> update(@RequestBody AtlUserRoles atluserroles){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<AtlUserRoles>> updateBatch(@RequestBody List<AtlUserRoles> atluserroless){
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
    public ResponseEntity<List<AtlUserRoles>> get<AtlUserRoles>>ByCond(){
        return ResponseEntity.ok();
    }
}
