package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/budgetControlStrategy")
public class BudgetControlStrategyController {

    private final BudgetControlStrategyService budgetcontrolstrategyservice;

    BudgetControlStrategyController(BudgetControlStrategyService budgetcontrolstrategyservice){
        this.budgetcontrolstrategyservice = budgetcontrolstrategyservice;
    }

    @PostMapping()
    public ResponseEntity<BudgetControlStrategy> createBudgetControlStrategy(@RequestBody BudgetControlStrategy budgetcontrolstrategy){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<BudgetControlStrategy>> createBudgetControlStrategyBatch(@RequestBody List<BudgetControlStrategy> budgetcontrolstrategys){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<BudgetControlStrategy> update(@RequestBody BudgetControlStrategy budgetcontrolstrategy){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<BudgetControlStrategy>> updateBatch(@RequestBody List<BudgetControlStrategy> budgetcontrolstrategys){
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
    public ResponseEntity<List<BudgetControlStrategy>> get<BudgetControlStrategy>>ByCond(){
        return ResponseEntity.ok();
    }
}
