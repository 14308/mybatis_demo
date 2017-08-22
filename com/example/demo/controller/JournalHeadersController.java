package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/journalHeaders")
public class JournalHeadersController {

    private final JournalHeadersService journalheadersservice;

    JournalHeadersController(JournalHeadersService journalheadersservice){
        this.journalheadersservice = journalheadersservice;
    }

    @PostMapping()
    public ResponseEntity<JournalHeaders> createJournalHeaders(@RequestBody JournalHeaders journalheaders){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<JournalHeaders>> createJournalHeadersBatch(@RequestBody List<JournalHeaders> journalheaderss){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<JournalHeaders> update(@RequestBody JournalHeaders journalheaders){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<JournalHeaders>> updateBatch(@RequestBody List<JournalHeaders> journalheaderss){
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
    public ResponseEntity<List<JournalHeaders>> get<JournalHeaders>>ByCond(){
        return ResponseEntity.ok();
    }
}
