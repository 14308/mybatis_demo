package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/atlUser")
public class AtlUserController {

    private final AtlUserService atluserservice;

    AtlUserController(AtlUserService atluserservice){
        this.atluserservice = atluserservice;
    }

    @PostMapping()
    public ResponseEntity<AtlUser> createAtlUser(@RequestBody AtlUser atluser){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<AtlUser>> createAtlUserBatch(@RequestBody List<AtlUser> atlusers){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<AtlUser> update(@RequestBody AtlUser atluser){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<AtlUser>> updateBatch(@RequestBody List<AtlUser> atlusers){
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
    public ResponseEntity<List<AtlUser>> get<AtlUser>>ByCond(){
        return ResponseEntity.ok();
    }
}
