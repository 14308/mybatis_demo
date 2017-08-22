package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/atlTest")
public class AtlTestController {

    private final AtlTestService atltestservice;

    AtlTestController(AtlTestService atltestservice){
        this.atltestservice = atltestservice;
    }

    @PostMapping()
    public ResponseEntity<AtlTest> createAtlTest(@RequestBody AtlTest atltest){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<AtlTest>> createAtlTestBatch(@RequestBody List<AtlTest> atltests){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<AtlTest> update(@RequestBody AtlTest atltest){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<AtlTest>> updateBatch(@RequestBody List<AtlTest> atltests){
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
    public ResponseEntity<List<AtlTest>> get<AtlTest>>ByCond(){
        return ResponseEntity.ok();
    }
}
