package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.*;
import com.example.demo.service.*;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-08-22
 */
@Controller
@RequestMapping("/demo/altUsers")
public class AltUsersController {

    private final AltUsersService altusersservice;

    AltUsersController(AltUsersService altusersservice){
        this.altusersservice = altusersservice;
    }

    @PostMapping()
    public ResponseEntity<AltUsers> createAltUsers(@RequestBody AltUsers altusers){
        return ResponseEntity.ok();
    }

    @PostMapping("/batch")
    public ResponseEntity<List<AltUsers>> createAltUsersBatch(@RequestBody List<AltUsers> altuserss){
        return ResponseEntity.ok();
    }

    @PutMapping()
    public ResponseEntity<AltUsers> update(@RequestBody AltUsers altusers){
        return ResponseEntity.ok();
    }

    @PutMapping("/batch")
    public ResponseEntity<List<AltUsers>> updateBatch(@RequestBody List<AltUsers> altuserss){
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
    public ResponseEntity<List<AltUsers>> get<AltUsers>>ByCond(){
        return ResponseEntity.ok();
    }
}
