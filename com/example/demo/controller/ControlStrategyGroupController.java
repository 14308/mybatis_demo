package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * ??????? 前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2017-08-21
 */
@Controller
@RequestMapping("/demo/controlStrategyGroup")
public class ControlStrategyGroupController {

    private final ControlStrategyGroupService controlstrategygroupservice;

    ControlStrategyGroupController(ControlStrategyGroupService controlstrategygroupservice){
        this.controlstrategygroupservice = controlstrategygroupservice;
    }

    @PostMapping()
    public ResponseEntity<ControlStrategyGroup> createControlStrategyGroup(@RequestBody ControlStrategyGroup controlstrategygroup){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<ControlStrategyGroup>> createControlStrategyGroupBatch(@RequestBody List<ControlStrategyGroup> controlstrategygroups){
        return ResponseEntity.ok();
    }
    @PutMapping()
    public ResponseEntity<ControlStrategyGroup> update(@RequestBody ControlStrategyGroup controlstrategygroup){
        return ResponseEntity.ok();
    }
    @PutMapping("/batch")
    public ResponseEntity<List<ControlStrategyGroup>> updateBatch(@RequestBody ControlStrategyGroup controlstrategygroups){
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
    public ResponseEntity<List<ControlStrategyGroup>> get<ControlStrategyGroup>>ByCond(){
        return ResponseEntity.ok();
    }
}
