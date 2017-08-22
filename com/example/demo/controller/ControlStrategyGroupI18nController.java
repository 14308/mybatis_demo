package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/controlStrategyGroupI18n")
public class ControlStrategyGroupI18nController {

    private final ControlStrategyGroupI18nService controlstrategygroupi18nservice;

    ControlStrategyGroupI18nController(ControlStrategyGroupI18nService controlstrategygroupi18nservice){
        this.controlstrategygroupi18nservice = controlstrategygroupi18nservice;
    }

    @PostMapping()
    public ResponseEntity<ControlStrategyGroupI18n> createControlStrategyGroupI18n(@RequestBody ControlStrategyGroupI18n controlstrategygroupi18n){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<ControlStrategyGroupI18n>> createControlStrategyGroupI18nBatch(@RequestBody List<ControlStrategyGroupI18n> controlstrategygroupi18ns){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<ControlStrategyGroupI18n> update(@RequestBody ControlStrategyGroupI18n controlstrategygroupi18n){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<ControlStrategyGroupI18n>> updateBatch(@RequestBody List<ControlStrategyGroupI18n> controlstrategygroupi18ns){
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
    public ResponseEntity<List<ControlStrategyGroupI18n>> get<ControlStrategyGroupI18n>>ByCond(){
        return ResponseEntity.ok();
    }
}
