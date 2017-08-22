package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/asd")
public class AsdController {

    private final AsdService asdservice;

    AsdController(AsdService asdservice){
        this.asdservice = asdservice;
    }

    @PostMapping()
    public ResponseEntity<Asd> createAsd(@RequestBody Asd asd){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<Asd>> createAsdBatch(@RequestBody List<Asd> asds){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<Asd> update(@RequestBody Asd asd){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<Asd>> updateBatch(@RequestBody List<Asd> asds){
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
    public ResponseEntity<List<Asd>> get<Asd>>ByCond(){
        return ResponseEntity.ok();
    }
}
