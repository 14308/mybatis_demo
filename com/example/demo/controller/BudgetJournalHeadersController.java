package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/budgetJournalHeaders")
public class BudgetJournalHeadersController {

    private final BudgetJournalHeadersService budgetjournalheadersservice;

    BudgetJournalHeadersController(BudgetJournalHeadersService budgetjournalheadersservice){
        this.budgetjournalheadersservice = budgetjournalheadersservice;
    }

    @PostMapping()
    public ResponseEntity<BudgetJournalHeaders> createBudgetJournalHeaders(@RequestBody BudgetJournalHeaders budgetjournalheaders){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<BudgetJournalHeaders>> createBudgetJournalHeadersBatch(@RequestBody List<BudgetJournalHeaders> budgetjournalheaderss){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<BudgetJournalHeaders> update(@RequestBody BudgetJournalHeaders budgetjournalheaders){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<BudgetJournalHeaders>> updateBatch(@RequestBody List<BudgetJournalHeaders> budgetjournalheaderss){
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
    public ResponseEntity<List<BudgetJournalHeaders>> get<BudgetJournalHeaders>>ByCond(){
        return ResponseEntity.ok();
    }
}
